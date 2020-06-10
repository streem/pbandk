import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("multiplatform")
}

val executableBaseName = "conformance"
val executableEntryPoint = "pbandk.conformance.main"

kotlin {
    linuxX64("linux") {
        binaries {
            executable {
                baseName = executableBaseName
                entryPoint = executableEntryPoint

                runTask?.args("")
            }
        }
    }

    macosX64("macos") {
        binaries {
            executable {
                baseName = executableBaseName
                entryPoint = executableEntryPoint

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
