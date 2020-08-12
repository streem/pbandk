package pbandk.examples.greeter

import pbandk.gen.ServiceGenerator
import java.nio.file.Paths

class Generator : ServiceGenerator {
    override fun generate(service: ServiceGenerator.Service): List<ServiceGenerator.Result> {
        service.debug { "Generating code for service ${service.name}" }
        // This is just an example so the code is obviously simple.
        // Would use Kastree in more advanced situation
        var interfaceMethods = emptyList<String>()
        var clientMethods = emptyList<String>()
        var serverMethods = emptyList<String>()
        service.methods.forEach { method ->
            val reqType = service.kotlinTypeMappings[method.inputType!!]!!
            val respType = service.kotlinTypeMappings[method.outputType!!]!!
            val nameLit = "\"${method.name}\""
            interfaceMethods += "suspend fun ${method.name}(req: $reqType): $respType"
            clientMethods += "override suspend fun ${method.name}(req: $reqType): $respType { " +
                "return client.callUnary($nameLit, req) }"
            serverMethods += "$nameLit -> ${method.name}(req as $reqType) as Resp"
        }
        return listOf(ServiceGenerator.Result(
            otherFilePath = Paths.get(service.filePath).resolveSibling(service.name + ".kt").toString(),
            code = """
                package ${service.file.kotlinPackageName}

                interface ${service.name} {
                    ${interfaceMethods.joinToString("\n    ")}

                    class Client(val client: pbandk.examples.greeter.Rpc.Client) : ${service.name} {
                        ${clientMethods.joinToString("\n        ")}
                    }

                    abstract class Server : pbandk.examples.greeter.Rpc.Server(), ${service.name} {
                        override suspend fun <Req : pbandk.Message, Resp : pbandk.Message> onUnaryCall(name: String, req: Req): Resp {
                            return when (name) {
                                ${serverMethods.joinToString("\n                ")}
                                else -> error("404")
                            }
                        }
                    }
                }
            """.trimIndent()
        ))
    }
}
