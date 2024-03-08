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
        assertTrue("optionalMessage should be nullable") { mainClazz.memberProperties.find { it.name == "optionalMessage" }!!.returnType.isMarkedNullable }
        assertTrue("message should be nullable") { mainClazz.memberProperties.find { it.name == "message" }!!.returnType.isMarkedNullable }
        assertTrue("optionalString should be nullable") { mainClazz.memberProperties.find { it.name == "optionalString" }!!.returnType.isMarkedNullable }
        assertFalse("string should not be nullable") { mainClazz.memberProperties.find { it.name == "string" }!!.returnType.isMarkedNullable }
        assertTrue("optionalInt should be nullable") { mainClazz.memberProperties.find { it.name == "optionalInt" }!!.returnType.isMarkedNullable }
        assertFalse("int should not be nullable") { mainClazz.memberProperties.find { it.name == "int" }!!.returnType.isMarkedNullable }
        assertTrue("optionalEnum should be nullable") { mainClazz.memberProperties.find { it.name == "optionalEnum" }!!.returnType.isMarkedNullable }
        assertFalse("enum should not be nullable") { mainClazz.memberProperties.find { it.name == "enum" }!!.returnType.isMarkedNullable }
    }

    @Test
    fun testKotlinPackageMappingSimple() {
        val result = compileProto("simple.proto", "kotlin_package_mapping=foobar->newname.pkg")

        assertEquals(ExitCode.OK, result.exitCode, result.messages)

        // Ensure classes and fields were generated successfully
        result.classLoader.loadClass("newname.pkg.Message1").kotlin
        result.classLoader.loadClass("newname.pkg.Message2").kotlin

        assertFails { result.classLoader.loadClass("foobar.Message1").kotlin }
    }


    @Test
    fun testKotlinPackageMappingSimpleWildcard() {
        val result = compileProto("simple.proto", "kotlin_package_mapping=*->newname.pkg.*")

        assertEquals(ExitCode.OK, result.exitCode, result.messages)

        // Ensure classes and fields were generated successfully
        // New package name should prefix the existing one.
        result.classLoader.loadClass("newname.pkg.foobar.Message1").kotlin
        result.classLoader.loadClass("newname.pkg.foobar.Message2").kotlin

        assertFails { result.classLoader.loadClass("foobar.Message1").kotlin }
    }

    @Test
    fun testKotlinPackageMappingSimpleWildcardSingle() {
        val result = compileProto("simple.proto", "kotlin_package_mapping=*->newname.pkg")

        assertEquals(ExitCode.OK, result.exitCode, result.messages)

        // Ensure classes and fields were generated successfully
        // New package name should overwrite the old one
        result.classLoader.loadClass("newname.pkg.Message1").kotlin
        result.classLoader.loadClass("newname.pkg.Message2").kotlin

        assertFails { result.classLoader.loadClass("foobar.Message1").kotlin }
    }

    @Test
    fun testKotlinPackageMappingSimpleWildcardNoMismatch() {
        val result = compileProto("simple.proto", "kotlin_package_mapping=foobar.*->newname.pkg")

        assertEquals(ExitCode.OK, result.exitCode, result.messages)

        // Ensure classes and fields were generated successfully
        // New package name shouldn't change.
        result.classLoader.loadClass("foobar.Message1").kotlin
        result.classLoader.loadClass("foobar.Message2").kotlin


        assertFails { result.classLoader.loadClass("newname.pkg.Message1").kotlin }
    }

    @Test
    fun testKotlinPackageMappingWildcardPrefixMatch() {
        val result = compileProto("proto_3_presence.proto", "kotlin_package_mapping=pbandk.*->newname.*")

        assertEquals(ExitCode.OK, result.exitCode, result.messages)

        // Ensure classes and fields were generated successfully
        // New package name should replace the prefix.
        result.classLoader.loadClass("newname.testpb.Proto3PresenceMessage").kotlin

        assertFails { result.classLoader.loadClass("pbandk.testpb.Proto3PresenceMessage").kotlin }
    }

    @Test
    fun testKotlinPackageMappingWithJavaPackage() {
        val result = compileProto("with_java_package.proto", "kotlin_package_mapping=pbandk.*->newname.*")

        assertEquals(ExitCode.OK, result.exitCode, result.messages)

        // Ensure classes and fields were generated successfully
        // New package name should contain
        result.classLoader.loadClass("newname.javapackage.Foo").kotlin
        result.classLoader.loadClass("newname.javapackage.Goo").kotlin

        assertFails { result.classLoader.loadClass("pbandk.javapackage.Foo").kotlin }
    }

    private fun compileProto(inputProto: String, parameter: String? = null): KotlinCompilation.Result {
        val gen = runGenerator(
            CodeGeneratorRequest(
                fileToGenerate = listOf(inputProto),
                protoFile = fileDescriptorSet,
                parameter = parameter,
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
