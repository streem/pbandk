import org.jetbrains.kotlin.gradle.plugin.*
import java.nio.file.Paths

plugins {
    id("maven-publish")
    kotlin("multiplatform")
    kotlin("plugin.serialization")
}

project.ext["projectDescription"] = "Library for pbandk runtime protobuf code"
apply(from = "../gradle/publish.gradle")

kotlin {

    jvm {
        withJava()
    }
    js {
        useCommonJs()

        browser {}

        nodejs {}
    }
    // For ARM, should be changed to iosArm32 or iosArm64
    // For Linux, should be changed to e.g. linuxX64
    // For MacOS, should be changed to e.g. macosX64
    // For Windows, should be changed to e.g. mingwX64
    // macosX64("macos")

    sourceSets["commonMain"].dependencies {
        implementation(kotlin("stdlib-common"))
        implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime-common:${Versions.kotlin_serialization}")
    }
    sourceSets["commonTest"].dependencies {
        implementation(kotlin("test-common"))
        implementation(kotlin("test-annotations-common"))
    }

    sourceSets["jvmMain"].dependencies {
        implementation(kotlin("stdlib"))
        implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime:${Versions.kotlin_serialization}")
        api("com.google.protobuf:protobuf-java:${Versions.protobuf}")
    }
    sourceSets["jvmTest"].dependencies {
        implementation(kotlin("test"))
        implementation(kotlin("test-junit"))
        implementation("junit:junit:4.12")
    }

    sourceSets["jsMain"].dependencies {
        implementation(kotlin("stdlib-js"))
        implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime-js:${Versions.kotlin_serialization}")
        implementation(npm("protobufjs", "^6.8.8"))
    }
    sourceSets["jsTest"].dependencies {
        implementation(kotlin("test-js"))
    }

    //    sourceSets["macosMain"].dependencies {
    //    }
    //    sourceSets["macosTest"].dependencies {
    //    }
}

tasks.register("generateWellKnownTypes") {
    dependsOn(":protoc-gen-kotlin:installDist")

    doFirst {
        val protocPath = System.getProperty("protoc.path")
        if (protocPath == null) throw InvalidUserDataException("System property protoc.path must be set")

        val runProtoGen = project.ext["runProtoGen"] as (String, String, String?, String?, String?) -> Unit
        runProtoGen(Paths.get(protocPath, "include").toString(), "src/commonMain/kotlin", "pbandk.wkt", "debug", "google/protobuf")
    }
}

tasks.register("generateTestTypes") {
    dependsOn(":protoc-gen-kotlin:installDist")
    doFirst {
        val runProtoGen = project.ext["runProtoGen"] as (String, String, String?, String?, String?) -> Unit
        runProtoGen("src/jvmTest/proto", "src/jvmTest/kotlin", "pbandk.testpb", "debug", "pbandk/testpb")
    }
    doFirst {
        exec {
            commandLine("protoc", "-Isrc/jvmTest/proto", "--java_out=src/jvmTest/java", "src/jvmTest/proto/pbandk/testpb/test.proto")
        }
    }
}