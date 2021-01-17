import com.tschuchort.compiletesting.KotlinCompilation
import com.tschuchort.compiletesting.KotlinCompilation.ExitCode
import com.tschuchort.compiletesting.SourceFile
import pbandk.decodeFromByteArray
import pbandk.decodeFromStream
import pbandk.gen.pb.CodeGeneratorRequest
import pbandk.gen.runGenerator
import pbandk.wkt.FileDescriptorSet
import java.io.File
import kotlin.test.Test
import kotlin.test.assertEquals


class CodeGeneratorTest {
    private val descriptorSetOutput = File("build/generateTestProtoDescriptor/fileDescriptor.protoset")
    private val fileDescriptorSet by lazy {
        check(descriptorSetOutput.exists()) {
            "${descriptorSetOutput.absolutePath} does not exist, make sure it is generated via :generateTestProto"
        }
        FileDescriptorSet.decodeFromStream(descriptorSetOutput.inputStream()).file
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

    private fun compileProto(inputProto: String): KotlinCompilation.Result {
        val gen = runGenerator(
            CodeGeneratorRequest(
                fileToGenerate = listOf(inputProto),
                protoFile = fileDescriptorSet
            )
        )

        val kotlinSource = SourceFile.kotlin(File(gen.file.first().name!!).name, gen.file.first().content!!)
        return KotlinCompilation().apply {
            sources = listOf(kotlinSource)
            inheritClassPath = true
            messageOutputStream = System.out
        }.compile()
    }
}