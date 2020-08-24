import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
    kotlin("multiplatform")
}

kotlin {
    linuxX64("linux")
    macosX64("macos")

    targets.withType<KotlinNativeTarget> {
        binaries {
            executable("conformance")
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
