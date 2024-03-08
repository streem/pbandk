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
import kotlin.test.*

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
    fun testOneOf_Enum_SameNameField() {
        val result = compileProto("oneof_enum_same_name.proto")

        assertEquals(ExitCode.OK, result.exitCode, result.messages)

        // Ensure the oneof with the same name as its containing message was generated correctly
        val actionClazz = result.classLoader.loadClass("foobar.Action")

        // Ensure the message with a same named enum in the message was generated correctly
        val enumClazz = actionClazz.classLoader.loadClass("foobar.Action\$ActionV1").kotlin
        enumClazz.declaredMemberProperties.single { it.name == "type" }
    }

    @Test
    fun testKotlinBuiltinNames() {
        val result = compileProto("kotlin_builtin_names.proto")
        assertEquals(ExitCode.OK, result.exitCode, result.messages)

        // Ensure the messages with the same names as built-in Kotlin classes were generated correctly

        val anyClazz = result.classLoader.loadClass("foobar.Any").kotlin
        anyClazz.declaredMemberProperties.single { it.name == "any" }

        val booleanClazz = result.classLoader.loadClass("foobar.Boolean_").kotlin
        booleanClazz.declaredMemberProperties.single { it.name == "boolean" }

        val companionClazz = result.classLoader.loadClass("foobar.Companion_").kotlin
        companionClazz.declaredMemberProperties.single { it.name == "companion" }

        val doubleClazz = result.classLoader.loadClass("foobar.Double_").kotlin
        doubleClazz.declaredMemberProperties.single { it.name == "double" }

        val floatClazz = result.classLoader.loadClass("foobar.Float_").kotlin
        floatClazz.declaredMemberProperties.single { it.name == "float" }

        val intClazz = result.classLoader.loadClass("foobar.Int_").kotlin
        intClazz.declaredMemberProperties.single { it.name == "int" }

        val listClazz = result.classLoader.loadClass("foobar.List_").kotlin
        listClazz.declaredMemberProperties.single { it.name == "list" }

        val longClazz = result.classLoader.loadClass("foobar.Long_").kotlin
        longClazz.declaredMemberProperties.single { it.name == "long" }

        val mapClazz = result.classLoader.loadClass("foobar.Map_").kotlin
        mapClazz.declaredMemberProperties.single { it.name == "map" }

        val sequenceClazz = result.classLoader.loadClass("foobar.Sequence").kotlin
        sequenceClazz.declaredMemberProperties.single { it.name == "sequence" }

        val stringClazz = result.classLoader.loadClass("foobar.String_").kotlin
        stringClazz.declaredMemberProperties.single { it.name == "string" }
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

    @Test
    fun testKotlinPackageMappingSimple() {
        val result = compileProto("simple.proto", mapOf("kotlin_package_mapping" to "foobar->newname.pkg"))

        assertEquals(ExitCode.OK, result.exitCode, result.messages)

        // Ensure classes and fields were generated successfully
        result.classLoader.loadClass("newname.pkg.Message1").kotlin
        result.classLoader.loadClass("newname.pkg.Message2").kotlin

        assertFails { result.classLoader.loadClass("foobar.Message1").kotlin }
    }

    @Test
    fun testKotlinPackageMappingSimpleWildcard() {
        val result = compileProto("simple.proto", mapOf("kotlin_package_mapping" to "*->newname.pkg.*"))

        assertEquals(ExitCode.OK, result.exitCode, result.messages)

        // Ensure classes and fields were generated successfully
        // New package name should prefix the existing one.
        result.classLoader.loadClass("newname.pkg.foobar.Message1").kotlin
        result.classLoader.loadClass("newname.pkg.foobar.Message2").kotlin

        assertFails { result.classLoader.loadClass("foobar.Message1").kotlin }
    }

    @Test
    fun testKotlinPackageMappingSimpleWildcardSingle() {
        val result = compileProto("simple.proto", mapOf("kotlin_package_mapping" to "*->newname.pkg"))

        assertEquals(ExitCode.OK, result.exitCode, result.messages)

        // Ensure classes and fields were generated successfully
        // New package name should overwrite the old one
        result.classLoader.loadClass("newname.pkg.Message1").kotlin
        result.classLoader.loadClass("newname.pkg.Message2").kotlin

        assertFails { result.classLoader.loadClass("foobar.Message1").kotlin }
    }

    @Test
    fun testKotlinPackageMappingSimpleWildcardNoMismatch() {
        val result = compileProto("simple.proto", mapOf("kotlin_package_mapping" to "foobar.*->newname.pkg"))

        assertEquals(ExitCode.OK, result.exitCode, result.messages)

        // Ensure classes and fields were generated successfully
        // New package name shouldn't change.
        result.classLoader.loadClass("foobar.Message1").kotlin
        result.classLoader.loadClass("foobar.Message2").kotlin


        assertFails { result.classLoader.loadClass("newname.pkg.Message1").kotlin }
    }

    @Test
    fun testKotlinPackageMappingWildcardPrefixMatch() {
        val result = compileProto("proto_3_presence.proto", mapOf("kotlin_package_mapping" to "pbandk.*->newname.*"))

        assertEquals(ExitCode.OK, result.exitCode, result.messages)

        // Ensure classes and fields were generated successfully
        // New package name should replace the prefix.
        result.classLoader.loadClass("newname.testpb.Proto3PresenceMessage").kotlin

        assertFails { result.classLoader.loadClass("pbandk.testpb.Proto3PresenceMessage").kotlin }
    }

    @Test
    fun testKotlinPackageMappingWithJavaPackage() {
        val result = compileProto("with_java_package.proto", mapOf("kotlin_package_mapping" to "pbandk.*->newname.*"))

        assertEquals(ExitCode.OK, result.exitCode, result.messages)

        // Ensure classes and fields were generated successfully
        // New package name should contain
        result.classLoader.loadClass("newname.javapackage.Foo").kotlin
        result.classLoader.loadClass("newname.javapackage.Goo").kotlin

        assertFails { result.classLoader.loadClass("pbandk.javapackage.Foo").kotlin }
    }

    private fun compileProto(
        inputProto: String,
        parameters: Map<String, String> = emptyMap()
    ): KotlinCompilation.Result {
        val gen = runGenerator(
            CodeGeneratorRequest {
                fileToGenerate += inputProto
                protoFile += fileDescriptorSet
                parameter = parameters
                    .plus("log" to "debug")
                    .map { (k, v) -> "$k=$v" }
                    .joinToString(",")
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
