@Suppress("UnstableApiUsage")
open class DescriptorProtocTask : ProtocTask() {
    init {
        plugin.set("descriptor_set")
        protocOptions.add("--include_imports")
        outputFileName.convention("fileDescriptor.protoset")
        protocOptions.set(listOf("--include_imports"))
    }
}
