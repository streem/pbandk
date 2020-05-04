import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("multiplatform")
}

kotlin {
    linuxX64("linux") {
        binaries {
            executable {
                baseName = "conformance"

                entryPoint = "pbandk.conformance.main"

                runTask?.args("")
            }
        }
    }

    macosX64("macos") {
        binaries {
            executable {
                baseName = "conformance"

                entryPoint = "pbandk.conformance.main"

                runTask?.args("")
            }
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
            }
        }

        val nativeMain by creating {
            dependencies {
                api(project(":conformance:lib"))
            }
        }

        val linuxMain by getting {
            dependsOn(nativeMain)
        }

        val macosMain by getting {
            dependsOn(nativeMain)
        }
    }
}
