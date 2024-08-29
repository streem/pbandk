import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.targets.js.dsl.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("multiplatform")
}

kotlin {
    jvm {
        withJava()
    }

    js {
        browser {}
        nodejs {}

        compilations.all {
            compileTaskProvider.configure {
                // Skip compiler limits test on Kotlin/JS for now, since the Kotlin/JS compiler can't deal with large
                // protobuf messages (as of Kotlin 1.9). See https://github.com/streem/pbandk/issues/267 for details.
                exclude("pbandk/testpb/test_compiler_limits.kt")
            }
        }
    }

    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {
        browser {}
        nodejs {}
    }

    // Native targets, according to https://kotlinlang.org/docs/native-target-support.html
    // Tier 1
    macosX64()
    macosArm64()
    iosSimulatorArm64()
    iosX64()
    // Tier 2
    linuxX64()
    linuxArm64()
    //watchosSimulatorArm64()
    //watchosX64()
    //watchosArm32()
    //watchosArm64()
    tvosSimulatorArm64()
    tvosX64()
    tvosArm64()
    iosArm64()
    // Tier 3
    //androidNativeArm32()
    //androidNativeArm64()
    //androidNativeX86()
    //androidNativeX64()
    mingwX64()
    //watchosDeviceArm64()

    sourceSets {
        commonMain {
            dependencies {
                implementation(project(":pbandk-runtime"))
            }
        }

        jvmMain {
            dependencies {
                api("com.google.protobuf:protobuf-java:${Versions.protobufJava}")
            }
        }
    }
}

tasks.withType<KotlinCompile> {
    compilerOptions.jvmTarget.set(JvmTarget.fromTarget(Versions.jvmTarget))
}
tasks.withType<JavaCompile> {
    sourceCompatibility = Versions.jvmTarget
    targetCompatibility = Versions.jvmTarget
}

tasks {
    val generateKotlinTestProtos by registering(KotlinProtocTask::class) {
        includeDir.set(project.file("src/commonMain/proto"))
        outputDir.set(project.file("src/commonMain/kotlin"))
        kotlinPackage.set("pbandk.testpb")
        logLevel.set("debug")
        protoFileSubdir("pbandk/testpb")
    }

    val generateJavaTestProtos by registering(ProtocTask::class) {
        includeDir.set(project.file("src/commonMain/proto"))
        outputDir.set(project.file("src/jvmMain/java"))
        plugin.set("java")
        protoFileSubdir("pbandk/testpb")
    }

    val generateProtos by registering {
        dependsOn(generateKotlinTestProtos, generateJavaTestProtos)
    }
}
