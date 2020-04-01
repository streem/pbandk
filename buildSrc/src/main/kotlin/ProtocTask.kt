import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.FileCollection
import org.gradle.api.provider.Property
import org.gradle.api.tasks.*
import org.gradle.internal.os.OperatingSystem
import org.gradle.kotlin.dsl.property

@Suppress("UnstableApiUsage")
open class ProtocTask : AbstractExecTask<ProtocTask>(ProtocTask::class.java) {
    @InputDirectory
    val includeDir: DirectoryProperty = project.objects.directoryProperty()

    @OutputDirectory
    val outputDir: DirectoryProperty = project.objects.directoryProperty()

    @Input
    val protoc: Property<String> = project.objects.property<String>().apply {
        convention("protoc")
    }

    @Input
    @Optional
    val kotlinPackage: Property<String> = project.objects.property()

    @Console
    val logLevel: Property<String> = project.objects.property()

    private val protoFileDir: DirectoryProperty = project.objects.directoryProperty().apply {
        convention(includeDir)
    }

    fun protoFileSubdir(dir: String) {
        protoFileDir.set(includeDir.dir(dir))
    }

    @InputFiles
    @SkipWhenEmpty
    val protoFiles: FileCollection = protoFileDir.asFileTree.matching {
        this.include("*.proto")
    }

    private val protocGenKotlinInstallDir = project.project(":protoc-gen-kotlin:jvm").tasks
        .named("installDist", Sync::class.java)
        .map { it.destinationDir }

    init {
        inputs.dir(protocGenKotlinInstallDir)
    }

    override fun exec() {
        executable = protoc.get()

        // Build CLI args
        val kotlinOut = listOfNotNull(
            kotlinPackage.orNull.let { "kotlin_package=$it" },
            logLevel.orNull.let { "log=$it" },
            "json_use_proto_names=true",
            "empty_arg:${outputDir.get()}"
        )
        args(kotlinOut.joinToString(separator = ",", prefix = "--kotlin_out="))

        val protocGenKotlinPath = protocGenKotlinInstallDir.get().resolve(
            "bin/protoc-gen-kotlin" + ".bat".takeIf { OperatingSystem.current().isWindows }.orEmpty()
        )
        args("--plugin=protoc-gen-kotlin=$protocGenKotlinPath")

        args("-I", includeDir.get())

        args(protoFiles.map { it.absolutePath })

        super.exec()
    }
}
