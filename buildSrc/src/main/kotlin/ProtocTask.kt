import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.FileCollection
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.ListProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.*
import org.gradle.kotlin.dsl.listProperty
import org.gradle.kotlin.dsl.property

@Suppress("UnstableApiUsage")
open class ProtocTask : AbstractExecTask<ProtocTask>(ProtocTask::class.java) {
    @InputDirectory
    val includeDir: DirectoryProperty = project.objects.directoryProperty()

    @OutputDirectory
    val outputDir: DirectoryProperty = project.objects.directoryProperty()

    @Input
    val protoc: Property<String> = project.objects.property<String>().apply {
        convention(
            project.providers.systemProperty("protoc.path")
                .map { project.layout.projectDirectory.dir(it).file("bin/protoc") }
                .map { it.asFile.absolutePath }
                .orElse("protoc")
        )
    }

    @Input
    val plugin: Property<String> = project.objects.property()

    @Input
    @Optional
    val pluginOptions: ListProperty<Pair<Any, Any>> = project.objects.listProperty()

    @InputFile
    @Optional
    val pluginPath: RegularFileProperty = project.objects.fileProperty()

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

    override fun exec() {
        executable = protoc.get()

        // Build CLI args
        args(
            pluginOptions.orNull
                ?.takeUnless { it.isEmpty() }
                ?.joinToString(separator = ",", postfix = ":") { (k, v) -> "$k=$v" }
                .let { "--${plugin.get()}_out=${it.orEmpty()}${outputDir.get()}" }
        )

        pluginPath.orNull?.let {
            args("--plugin=protoc-gen-${plugin.get()}=${it.asFile.absolutePath}")
        }

        args("-I", includeDir.get())

        args(protoFiles.map { it.absolutePath })

        super.exec()
    }
}
