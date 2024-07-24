import org.gradle.nativeplatform.platform.internal.DefaultNativePlatform
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("multiplatform")
}

kotlin {
    jvm()

    js {
        binaries.executable()
        nodejs {}
    }

    linuxX64()
    if (DefaultNativePlatform.getCurrentOperatingSystem().isMacOsX && DefaultNativePlatform.getCurrentArchitecture().name == "aarch64") {
        macosArm64()
    } else {
        macosX64()
    }
    // Uncomment to enable Windows
    // mingwX64("windows")

    sourceSets {
        all {
            languageSettings {
                optIn("kotlin.js.ExperimentalJsExport")
            }
        }

        commonMain {
            dependencies {
                implementation(project(":pbandk-runtime"))
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinCoroutines}")
            }
        }

        commonTest {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}

tasks.withType<KotlinCompile> {
    compilerOptions.jvmTarget.set(JvmTarget.fromTarget(Versions.jvmTarget))
}
tasks.withType<JavaCompile> {
    targetCompatibility = Versions.jvmTarget
}

tasks {
    val generateConformanceProtos by registering(KotlinProtocTask::class) {
        includeDir.set(project.file("src/commonMain/proto"))
        outputDir.set(project.file("src/commonMain/kotlin"))
        kotlinPackage.set("pbandk.conformance.pb")
        logLevel.set("debug")
    }

    val generateProtos by registering {
        dependsOn(generateConformanceProtos)
    }
}