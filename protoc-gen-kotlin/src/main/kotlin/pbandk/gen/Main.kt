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

    // Convert to file model and generate the code only for ones requested
    val kotlinTypeMappings = mutableMapOf<String, String>()
    PluginProtos.CodeGeneratorResponse.newBuilder().addAllFile(request.protoFileList.mapNotNull { protoFile ->
        debug { "Reading ${protoFile.name}" }
        val needToGenerate = request.fileToGenerateList.contains(protoFile.name)
        // Convert the file to our model
        val file = FileBuilder.buildFile(FileBuilder.Context(protoFile, params.let {
            // As a special case, if we're not generating it but it's a well-known type package, change it our known one
            if (needToGenerate || protoFile.`package` != "google.protobuf") it
            else it + ("kotlin_package" to "pbandk.wkt")
        }))
        // Update the type mappings
        kotlinTypeMappings += file.kotlinTypeMappings()
        // Generate if necessary
        if (!request.fileToGenerateList.contains(protoFile.name)) null else {
            // Package name + file name (s/proto/kt)
            val fileNameSansPath = protoFile.name.substringAfterLast('/')
            val filePath = (file.kotlinPackageName?.replace('.', '/')?.plus('/') ?: "") +
                    fileNameSansPath.removeSuffix(".proto") + ".kt"
            debug { "Generating $filePath" }
            PluginProtos.CodeGeneratorResponse.File.newBuilder().
                    setName(filePath).
                    setContent(CodeGenerator(kotlinTypeMappings).generate(file)).
                    build()
        }
    }).build().writeTo(System.out)
}