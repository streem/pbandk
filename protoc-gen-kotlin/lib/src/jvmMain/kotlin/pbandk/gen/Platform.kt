package pbandk.gen

import com.google.protobuf.compiler.PluginProtos
import pbandk.gen.pb.CodeGeneratorRequest
import pbandk.gen.pb.CodeGeneratorResponse
import pbandk.encodeToByteArray
import pbandk.decodeFromByteArray
import java.io.File
import java.lang.RuntimeException
import java.net.URLClassLoader
import java.util.*

// Set this to false to use the JVM encode/decode for code gen proto
const val useJvmProto = false

actual object Platform {
    actual fun stderrPrintln(str: String) = System.err.println(str)
    actual fun stdinReadRequest() = System.`in`.readBytes().let { bytes ->
        if (useJvmProto) BootstrapConverter.fromReq(PluginProtos.CodeGeneratorRequest.parseFrom(bytes))
        else CodeGeneratorRequest.decodeFromByteArray(bytes)
    }
    actual fun stdoutWriteResponse(resp: CodeGeneratorResponse) =
        if (useJvmProto) BootstrapConverter.toResp(resp).writeTo(System.out)
        else System.out.write(resp.encodeToByteArray())

    actual fun serviceGenerator(cliParams: Map<String, String>): ServiceGenerator? {
        // CLI param kotlin_service_gen is a collection of JARs. At the very end can have a pipe with the
        // FQCN of a service generator. Otherwise it is loaded via ServiceLoader. It can have an empty
        // string for the JAR list and it can have no pipe which means the param can be null
        val serviceGenParam = cliParams["kotlin_service_gen"]?.takeIf { it.isNotEmpty() } ?: return null
        try {
            val (serviceJarList, serviceClassName) = serviceGenParam.lastIndexOf('|').let { pipeIndex ->
                if (pipeIndex == -1) serviceGenParam to null
                else serviceGenParam.substring(0, pipeIndex) to serviceGenParam.substring(pipeIndex + 1)
            }
            // Load up all the JARs
            var loader = javaClass.classLoader
            if (serviceJarList.isNotEmpty()) loader = URLClassLoader(
                serviceJarList.split(';').map { File(it).toURI().toURL() }.toTypedArray(),
                loader
            )
            // Create the given name if present
            if (serviceClassName != null)
                return Class.forName(serviceClassName, true, loader).newInstance() as ServiceGenerator
            // Otherwise, use the service loader to just get the first
            return ServiceLoader.load(ServiceGenerator::class.java, loader).firstOrNull() ?:
                error("Unable to find service generator in given JARs")
        } catch (e: Exception) {
            throw RuntimeException("Failed generating service with generator param: $serviceGenParam", e)
        }
    }
}
