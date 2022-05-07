import org.gradle.nativeplatform.platform.internal.DefaultNativePlatform
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
    kotlin("multiplatform")
}

kotlin {
    linuxX64("linux")
    if (DefaultNativePlatform.getCurrentOperatingSystem().isMacOsX && DefaultNativePlatform.getCurrentArchitecture().name == "aarch64") {
        macosArm64("macos")
    } else {
        macosX64("macos")
    }

    targets.withType<KotlinNativeTarget> {
        binaries {
            executable("conformance")
            configureEach {
                // See https://youtrack.jetbrains.com/issue/KT-44148
                freeCompilerArgs += "-Xdisable-phases=EscapeAnalysis"
            }
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                api(project(":conformance:conformance-lib"))
            }
        }
    }
}
