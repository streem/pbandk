package pbandk.gen

import pbandk.gen.pb.CodeGeneratorRequest
import pbandk.wkt.MethodDescriptorProto
import pbandk.wkt.ServiceDescriptorProto

interface ServiceGenerator {

    fun generate(service: Service): List<Result>

    class Service(
        val name: String,
        val methods: List<Method>,
        val file: File,
        val filePath: String,
        val existingCode: String,
        val kotlinTypeMappings: Map<String, String>,
        val raw: ServiceDescriptorProto,
        val rawRequest: CodeGeneratorRequest,
        val debugFn: (() -> String) -> Unit
    ) {
        constructor(
            file: File,
            filePath: String,
            existingCode: String,
            kotlinTypeMappings: Map<String, String>,
            raw: ServiceDescriptorProto,
            rawRequest: CodeGeneratorRequest,
            debugFn: (() -> String) -> Unit
        ) : this(raw.name!!, raw.method.map(::Method),
            file, filePath, existingCode, kotlinTypeMappings, raw, rawRequest, debugFn)

        fun debug(fn: () -> String) { debugFn(fn) }
    }

    data class Method(
        val name: String,
        // Use kotlinTypeMappings to look these up
        val inputType: String?,
        val outputType: String?,
        val inputStreaming: Boolean,
        val outputStreaming: Boolean
    ) {
        constructor(raw: MethodDescriptorProto) :
            this(raw.name!!, raw.inputType, raw.outputType, raw.clientStreaming ?: false, raw.serverStreaming ?: false)
    }

    data class Result(
        val code: String,
        val otherFilePath: String? = null,
        val otherFileInsertionPoint: String? = null
    )
}