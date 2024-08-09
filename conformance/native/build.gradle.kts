import org.gradle.nativeplatform.platform.internal.DefaultNativePlatform
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
    kotlin("multiplatform")
}

kotlin {
    linuxX64()
    if (DefaultNativePlatform.getCurrentOperatingSystem().isMacOsX && DefaultNativePlatform.getCurrentArchitecture().name == "aarch64") {
        macosArm64()
    } else {
        macosX64()
    }

    targets.withType<KotlinNativeTarget> {
        binaries {
            executable("conformance")
        }
    }

    sourceSets {
        commonMain {
            dependencies {
                api(project(":conformance:conformance-lib"))
            }
        }
    }
}