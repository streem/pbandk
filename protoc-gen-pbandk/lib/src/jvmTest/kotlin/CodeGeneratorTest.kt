package pbandk.gen

import com.tschuchort.compiletesting.KotlinCompilation
import com.tschuchort.compiletesting.KotlinCompilation.ExitCode
import com.tschuchort.compiletesting.SourceFile
import pbandk.decodeFromStream
import pbandk.gen.pb.CodeGeneratorRequest
import pbandk.wkt.FileDescriptorSet
import java.io.File
import kotlin.reflect.full.declaredMemberProperties
import kotlin.reflect.full.hasAnnotation
import kotlin.reflect.full.memberProperties
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

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

        assertEquals(ExitCode.OK, result.exitCode, result.messages)

        // Ensure classes and fields were generated successfully
        val message1Clazz = result.classLoader.loadClass("foobar.Message1").kotlin
        val message2Clazz = result.classLoader.loadClass("foobar.Message2").kotlin
        message1Clazz.declaredMemberProperties.single { it.name == "intVal" }
        message2Clazz.declaredMemberProperties.single { it.name == "strVal" }
    }

    @Test
    fun testDeprecatedAnnotation() {
        val result = compileProto("options.proto")

        assertEquals(ExitCode.OK, result.exitCode, result.messages)

        // Ensure that deprecated proto fields have a `@Deprecated` Kotlin annotation
        val fooClazz = result.classLoader.loadClass("foobar.Foo").kotlin
        val deprecatedField = fooClazz.declaredMemberProperties.single { it.name == "deprecatedField" }
        assertTrue(deprecatedField.hasAnnotation<Deprecated>())
    }

    @Test
    fun testOneOf_SameNameField() {
        val result = compileProto("oneof_same_name.proto")

        assertEquals(ExitCode.OK, result.exitCode, result.messages)

        // Ensure the oneof with the same name as its containing message was generated correctly
        val valueClazz = result.classLoader.loadClass("foobar.Value")
        valueClazz.classLoader.loadClass("foobar.Value\$Value")
    }

    @Test
    fun testProto3Optional() {
        val result = compileProto("proto_3_presence.proto")
        assertEquals(ExitCode.OK, result.exitCode, result.messages)

        val mainClazz = result.classLoader.loadClass("pbandk.testpb.Proto3PresenceMain").kotlin
        assertTrue("optionalMessage should be nullable") { mainClazz.memberProperties.find { it.name == "optionalMessage" }!!.returnType.isMarkedNullable }
        assertTrue("message should be nullable") { mainClazz.memberProperties.find { it.name == "message" }!!.returnType.isMarkedNullable }
        assertTrue("optionalString should be nullable") { mainClazz.memberProperties.find { it.name == "optionalString" }!!.returnType.isMarkedNullable }
        assertFalse("string should not be nullable") { mainClazz.memberProperties.find { it.name == "string" }!!.returnType.isMarkedNullable }
        assertTrue("optionalInt should be nullable") { mainClazz.memberProperties.find { it.name == "optionalInt" }!!.returnType.isMarkedNullable }
        assertFalse("int should not be nullable") { mainClazz.memberProperties.find { it.name == "int" }!!.returnType.isMarkedNullable }
        assertTrue("optionalEnum should be nullable") { mainClazz.memberProperties.find { it.name == "optionalEnum" }!!.returnType.isMarkedNullable }
        assertFalse("enum should not be nullable") { mainClazz.memberProperties.find { it.name == "enum" }!!.returnType.isMarkedNullable }
    }

    private fun compileProto(inputProto: String): KotlinCompilation.Result {
        val gen = runGenerator(
            CodeGeneratorRequest {
                fileToGenerate += inputProto
                protoFile += fileDescriptorSet
            }
        )

        val kotlinSource = SourceFile.kotlin(File(gen.file.first().name!!).name, gen.file.first().content!!)
        return KotlinCompilation().apply {
            sources = listOf(kotlinSource)
            inheritClassPath = true
            messageOutputStream = System.out
        }.compile()
    }
}
