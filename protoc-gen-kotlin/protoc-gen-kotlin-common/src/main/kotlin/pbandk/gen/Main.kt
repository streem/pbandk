package pbandk.gen

import pbandk.gen.pb.CodeGeneratorRequest
import pbandk.gen.pb.CodeGeneratorResponse

var logDebug = false
inline fun debug(fn: () -> String) { if (logDebug) Platform.stderrPrintln(fn()) }

fun main(args: Array<String>) {
    // Read the request from stdin and write response into stdout
    Platform.stdoutWriteResponse(runGenerator(Platform.stdinReadRequest()))
}

fun runGenerator(request: CodeGeneratorRequest): CodeGeneratorResponse {
    // Parse the parameters
    val params =
        if (request.parameter == null || request.parameter.isEmpty()) emptyMap()
        else request.parameter.split(',').map { it.substringBefore('=') to it.substringAfter('=', "") }.toMap()
    logDebug = true//params["log"] == "debug"
    debug { "Running generator with params: $params" }
    // Load service generator if it exists
    val serviceGen = Platform.serviceGenerator(params)
    // Convert to file model and generate the code only for ones requested
    val kotlinTypeMappings = mutableMapOf<String, String>()
    return CodeGeneratorResponse(file = request.protoFile.flatMap { protoFile ->
        debug { "Reading ${protoFile.name}, package: ${protoFile.`package`}" }
        val needToGenerate = request.fileToGenerate.contains(protoFile.name)
        // Convert the file to our model
        val file = FileBuilder.buildFile(FileBuilder.Context(protoFile, params.let {
            // As a special case, if we're not generating it but it's a well-known type package, change it our known one
            if (needToGenerate || (protoFile.`package` != "google.protobuf" && protoFile.`package` != "com.google.api")) it
            else if (protoFile.`package` == "com.google.api") it + ("kotlin_package" to "pbandk.google.api")
            else it + ("kotlin_package" to "pbandk.wkt")
        }.also {
            debug { "Params $it" }
        }))
        // Update the type mappings
        kotlinTypeMappings += file.kotlinTypeMappings()
        // Generate if necessary
        if (!needToGenerate) emptyList() else {
            // Package name + file name (s/proto/kt)
            val fileNameSansPath = protoFile.name!!.substringAfterLast('/')
            val filePath = (file.kotlinPackageName?.replace('.', '/')?.plus('/') ?: "") +
                fileNameSansPath.removeSuffix(".proto") + ".kt"
            debug { "Generating $filePath" }
            var code = CodeGenerator(file, kotlinTypeMappings).generate()
            // Do service gen if generator present
            var extraServiceCode = ""
            val serviceFiles = if (serviceGen == null) emptyList() else protoFile.service.flatMap { protoService ->
                val results = serviceGen.generate(ServiceGenerator.Service(
                    file = file,
                    filePath = filePath,
                    existingCode = code,
                    kotlinTypeMappings = kotlinTypeMappings,
                    raw = protoService,
                    rawRequest = request,
                    debugFn = ::debug
                ))
                results.mapNotNull { result ->
                    // If the result is for this file, just append
                    if (result.otherFilePath == null) {
                        extraServiceCode += "\n" + result.code
                        null
                    } else CodeGeneratorResponse.File(
                        name = result.otherFilePath,
                        insertionPoint = result.otherFileInsertionPoint,
                        content = result.code
                    )
                }
            }
            val primaryFiles =
                if (file.types.isEmpty() && extraServiceCode.isEmpty()) emptyList()
                else listOf(CodeGeneratorResponse.File(name = filePath, content = code + extraServiceCode))
            primaryFiles + serviceFiles
        }
    })
}