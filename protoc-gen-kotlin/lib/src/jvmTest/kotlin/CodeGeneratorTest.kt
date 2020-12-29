import com.tschuchort.compiletesting.KotlinCompilation
import com.tschuchort.compiletesting.KotlinCompilation.ExitCode
import com.tschuchort.compiletesting.SourceFile
import pbandk.decodeFromStream
import pbandk.gen.pb.CodeGeneratorRequest
import pbandk.gen.runGenerator
import pbandk.wkt.FileDescriptorProto
import pbandk.wkt.FileDescriptorSet
import java.io.File
import java.lang.IllegalArgumentException
import java.lang.ProcessBuilder.Redirect
import java.util.concurrent.TimeUnit
import kotlin.test.Test
import kotlin.test.assertEquals

class CodeGeneratorTest {
    companion object {
        const val PROTOC_PLUGIN_PATH = "../jvm/build/install/protoc-gen-kotlin/bin/protoc-gen-kotlin"
        const val PROTO_PATH = "src/jvmTest/resources/protos"
        const val DESCRIPTOR_SET_OUT = "build/tmp/fileDescriptor.protoset"
    }

    @Test
    fun testSimple() {
        val result = compileProto("simple.proto")

        assertEquals(result.exitCode, ExitCode.OK)
        val message1Clazz = result.classLoader.loadClass("foobar.Message1")
        val message2Clazz = result.classLoader.loadClass("foobar.Message2")
        message1Clazz.getDeclaredField("intVal")
        message2Clazz.getDeclaredField("strVal")
    }

    @Test
    fun testOneOf_SameNameField() {
        val result = compileProto("oneof_same_name.proto")

        assertEquals(result.exitCode, ExitCode.OK)
        val valueClazz = result.classLoader.loadClass("foobar.Value")
        valueClazz.classLoader.loadClass("foobar.Value\$Value")
    }

    private fun getFileDescriptorProto(protoFile: String): List<FileDescriptorProto> {
        val plugin = File(PROTOC_PLUGIN_PATH + ".bat".takeIf {
            System.getProperty("os.name").startsWith("Windows")
        }.orEmpty())
        val protoc = System.getProperty("protoc.path")?.let { "$it/bin/protoc" } ?: "protoc"

        val proc = ProcessBuilder(
            protoc,
            "--proto_path=$PROTO_PATH",
            "--plugin=protoc-gen-kotlin=${plugin.absoluteFile}",
            "--descriptor_set_out=$DESCRIPTOR_SET_OUT",
            protoFile
        )
            .redirectOutput(Redirect.PIPE)
            .redirectError(Redirect.PIPE)
            .start()
            .also { it.waitFor(10, TimeUnit.SECONDS) }

        if (proc.exitValue() != 0) {
            throw IllegalArgumentException("failed generating proto descriptor set for '$protoFile'")
        }

        return FileDescriptorSet.decodeFromStream(File(DESCRIPTOR_SET_OUT).inputStream()).file
    }

    private fun compileProto(inputProto: String): KotlinCompilation.Result {
        val gen = runGenerator(
            CodeGeneratorRequest(
                fileToGenerate = listOf(inputProto),
                protoFile = getFileDescriptorProto(inputProto)
            )
        )

        val kotlinSource = SourceFile.kotlin("test.kt", gen.file.first().content!!)
        return KotlinCompilation().apply {
            this.kaptSourceDir
            sources = listOf(kotlinSource)
            inheritClassPath = true
            messageOutputStream = System.out
        }.compile()
    }
}