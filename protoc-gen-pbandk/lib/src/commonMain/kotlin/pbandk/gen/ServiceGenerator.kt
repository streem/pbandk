package pbandk.gen

import pbandk.gen.pb.CodeGeneratorRequest
import pbandk.wkt.MethodDescriptorProto
import pbandk.wkt.ServiceDescriptorProto

public interface ServiceGenerator {

    public fun generate(service: Service): List<Result>

    public class Service(
        public val name: String,
        public val methods: List<Method>,
        public val file: File,
        public val filePath: String,
        public val existingCode: String,
        public val kotlinTypeMappings: Map<String, Name>,
        public val raw: ServiceDescriptorProto,
        public val rawRequest: CodeGeneratorRequest,
        public val debugFn: (() -> String) -> Unit
    ) {
        internal constructor(
            file: File,
            filePath: String,
            existingCode: String,
            kotlinTypeMappings: Map<String, Name>,
            raw: ServiceDescriptorProto,
            rawRequest: CodeGeneratorRequest,
            debugFn: (() -> String) -> Unit
        ) : this(raw.name!!, raw.method.map(::Method),
            file, filePath, existingCode, kotlinTypeMappings, raw, rawRequest, debugFn)

        public fun debug(fn: () -> String) { debugFn(fn) }
    }

    public data class Method(
        val name: String,
        // Use kotlinTypeMappings to look these up
        val inputType: String?,
        val outputType: String?,
        val inputStreaming: Boolean,
        val outputStreaming: Boolean
    ) {
        internal constructor(raw: MethodDescriptorProto) :
            this(raw.name!!, raw.inputType, raw.outputType, raw.clientStreaming ?: false, raw.serverStreaming ?: false)
    }

    public data class Result(
        val code: String,
        val otherFilePath: String? = null,
        val otherFileInsertionPoint: String? = null
    )
}