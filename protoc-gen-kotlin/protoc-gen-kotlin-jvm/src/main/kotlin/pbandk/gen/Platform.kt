package pbandk.gen

import com.google.protobuf.compiler.PluginProtos
import pbandk.gen.pb.CodeGeneratorRequest
import pbandk.gen.pb.CodeGeneratorResponse

// Set this to false to use the JVM marshal/unmarshal for code gen proto
const val useJvmProto = false

actual object Platform {
    actual fun stderrPrintln(str: String) = System.err.println(str)
    actual fun stdinReadRequest() = System.`in`.readBytes().let { bytes ->
        if (useJvmProto) BootstrapConverter.fromReq(PluginProtos.CodeGeneratorRequest.parseFrom(bytes))
        else CodeGeneratorRequest.protoUnmarshal(bytes)
    }
    actual fun stdoutWriteResponse(resp: CodeGeneratorResponse) =
        if (useJvmProto) BootstrapConverter.toResp(resp).writeTo(System.out)
        else System.out.write(resp.protoMarshal())
}