@Suppress("UnstableApiUsage")
open class DescriptorProtocTask : ProtocTask() {
    init {
        plugin.set("descriptor_set")
        protocOptions.add("--include_imports")
        protocOptions.add("--include_source_info")
        outputFileName.convention("fileDescriptor.protoset")
    }
}
