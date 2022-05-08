package pbandk.gen

import com.tschuchort.compiletesting.KotlinCompilation
import com.tschuchort.compiletesting.KotlinCompilation.ExitCode
import com.tschuchort.compiletesting.SourceFile
import pbandk.decodeFromStream
import pbandk.gen.pb.CodeGeneratorRequest
import pbandk.wkt.FileDescriptorSet
import java.io.File
import kotlin.reflect.full.declaredMemberExtensionProperties
import kotlin.reflect.full.declaredMemberProperties
import kotlin.reflect.full.hasAnnotation
import kotlin.reflect.full.memberProperties
import kotlin.test.Ignore
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
        assertTrue("optionalMessage should be nullable") {
            mainClazz.memberProperties.first { it.name == "optionalMessage" }.returnType.isMarkedNullable
        }
        assertTrue("message should be nullable") {
            mainClazz.memberProperties.first { it.name == "message" }.returnType.isMarkedNullable
        }
        assertTrue("optionalString should be nullable") {
            mainClazz.memberProperties.first { it.name == "optionalString" }.returnType.isMarkedNullable
        }
        assertFalse("string should not be nullable") {
            mainClazz.memberProperties.first { it.name == "string" }.returnType.isMarkedNullable
        }
        assertTrue("optionalInt should be nullable") {
            mainClazz.memberProperties.first { it.name == "optionalInt" }.returnType.isMarkedNullable
        }
        assertFalse("int should not be nullable") {
            mainClazz.memberProperties.first { it.name == "int" }.returnType.isMarkedNullable
        }
        assertTrue("optionalEnum should be nullable") {
            mainClazz.memberProperties.first { it.name == "optionalEnum" }.returnType.isMarkedNullable
        }
        assertFalse("enum should not be nullable") {
            mainClazz.memberProperties.first { it.name == "enum" }.returnType.isMarkedNullable
        }
    }

    /**
     * This test is disabled for now because Kotlin doesn't yet allow reflection on "file facades" (aka the synthetic
     * Java class that is generated to hold properties and methods that are declared at the file level outside any
     * Kotlin class). See https://youtrack.jetbrains.com/issue/KT-16479.
     *
     * As a workaround, we have a test for this in `runtime/src/commonTest/kotlin/pbandk/Proto3ExtensionTest.kt`. But
     * once Kotlin reflection is supported for this use case, it'd be better to have the test here since it's testing
     * the generated code rather than the runtime.
     */
    @Ignore("Kotlin currently doesn't support reflection on file-level properties")
    @Test
    fun testProto3Extension_alwaysOptional() {
        val result = compileProto("proto3_extensions.proto")

        assertEquals(ExitCode.OK, result.exitCode, result.messages)

        val extensionsClazz = result.classLoader.loadClass("pbandk.testpb.Proto3_extensionsKt").kotlin
        assertTrue("optional extension fields should be nullable") {
            extensionsClazz.declaredMemberExtensionProperties.first { it.name == "optionalInt32" }.returnType.isMarkedNullable
        }
        assertTrue("even non-optional extension fields should be nullable") {
            extensionsClazz.declaredMemberExtensionProperties.first { it.name == "nonOptionalInt32" }.returnType.isMarkedNullable
        }
    }

    private fun compileProto(inputProto: String): KotlinCompilation.Result {
        val gen = runGenerator(
            CodeGeneratorRequest {
                fileToGenerate += inputProto
                protoFile += fileDescriptorSet
                parameter = "log=debug"
            }
        )

        val kotlinSource = SourceFile.kotlin(File(gen.file.first().name!!).name, gen.file.first().content!!)
        return KotlinCompilation().apply {
            sources = listOf(kotlinSource)
            inheritClassPath = true
            messageOutputStream = System.out
            kotlincArguments = listOf("-Xopt-in=kotlin.RequiresOptIn")
        }.compile()
    }
}
