package pbandk.gen

import com.google.protobuf.compiler.PluginProtos

fun main(args: Array<String>) {
    // protoc --kotlin_out=. --plugin=protoc-gen-kotlin=.\protoc-gen-kotlin\build\install\protoc-gen-kotlin\bin\protoc-gen-kotlin.bat protoc-gen-kotlin\src\test\resources\pbandk\gen\conformance\conformance.proto
    System.err.println("Hello, world!")
    System.err.println("Reading stdin...")
    val bytes = System.`in`.readBytes()
    System.err.println("Read " + bytes.size + " bytes")
    val request = PluginProtos.CodeGeneratorRequest.parseFrom(bytes)
    System.err.println("FILES: " + request.fileToGenerateList)
    System.exit(1)
}