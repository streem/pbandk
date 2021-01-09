import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.FileCollection
import org.gradle.api.provider.Property
import org.gradle.api.tasks.*
import org.gradle.kotlin.dsl.property

@Suppress("UnstableApiUsage")
open class DescriptorProtocTask : AbstractExecTask<DescriptorProtocTask>(DescriptorProtocTask::class.java) {
    @InputDirectory
    val includeDir: DirectoryProperty = project.objects.directoryProperty()

    @OutputDirectory
    val outputDir: DirectoryProperty = project.objects.directoryProperty()

    @Input
    val protoc: Property<String> = project.objects.property()

    @Input
    val descriptorSetOutput: Property<String> = project.objects.property()

    private val protoFileDir: DirectoryProperty = project.objects.directoryProperty().apply {
        convention(includeDir)
    }

    @InputFiles
    @SkipWhenEmpty
    val protoFiles: FileCollection = protoFileDir.asFileTree.matching {
        this.include("*.proto")
    }

    init {
        descriptorSetOutput.set("fileDescriptor.protoset")
        protoc.set("protoc")
    }

    override fun exec() {
        executable = protoc.get()

        args("--proto_path=${includeDir.get()}")
        args("--descriptor_set_out=${outputDir.get().file(descriptorSetOutput.get()).asFile.absolutePath}")

        args(protoFiles.map { it.absolutePath })

        super.exec()
    }
}
