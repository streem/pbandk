package pbandk.gen

import com.google.protobuf.compiler.PluginProtos

var logDebug = false
inline fun debug(fn: () -> String) { if (logDebug) System.err.println(fn()) }

fun main(args: Array<String>) {
    // Read the bytes from stdin and parse into request
    val request = PluginProtos.CodeGeneratorRequest.parseFrom(System.`in`.readBytes())

    // Parse the parameters
    val params =
        if (request.parameter == null || request.parameter.isEmpty()) emptyMap()
        else request.parameter.split(',').map { it.substringBefore('=') to it.substringAfter('=', "") }.toMap()
    logDebug = params["log"] == "debug"
    debug { "Running generator with params: $params" }

    // Convert to file model and generate the code
    PluginProtos.CodeGeneratorResponse.newBuilder().addAllFile(request.fileToGenerateList.map { fileName ->
        debug { "Preparing $fileName" }
        val protoFile = request.protoFileList.find { it.name == fileName } ?: error("Unable to find $fileName")
        val file = FileBuilder.fromProto(protoFile, params)
        // Package name + file name (s/proto/kt)
        val fileNameSansPath = fileName.substringAfterLast('/')
        val filePath = (file.packageName?.replace('.', '/')?.plus('/') ?: "") +
            fileNameSansPath.removeSuffix(".proto") + ".kt"
        debug { "Generating $filePath" }
        PluginProtos.CodeGeneratorResponse.File.newBuilder().
            setName(filePath).
            setContent(CodeGenerator().generate(file)).
            build()
    }).build().writeTo(System.out)
}