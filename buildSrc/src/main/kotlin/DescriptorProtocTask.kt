@Suppress("UnstableApiUsage")
open class DescriptorProtocTask : ProtocTask() {
    init {
        plugin.set("descriptor_set")
        outputFileName.convention("fileDescriptor.protoset")
        protocOptions.set(listOf("--include_imports"))
    }
}
