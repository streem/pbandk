plugins {
    kotlin("multiplatform")
    kotlin("plugin.serialization")
}

kotlin {
    jvm {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
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
    iosArm64()
    iosX64()
    macosX64()

    sourceSets.create("nativeMain")

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
                implementation(project(":runtime"))
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime-common:${Versions.kotlinSerialization}")
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-common:${Versions.kotlinCoroutines}")
            }
        }

        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }

        val jvmMain by getting {
            dependencies {
                implementation(kotlin("stdlib-jdk8"))
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime:${Versions.kotlinSerialization}")
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinCoroutines}")
            }
        }

        val jvmTest by getting {
            dependencies {
                implementation(kotlin("test"))
                implementation(kotlin("test-junit"))
                implementation("junit:junit:4.12")
            }
        }

        val jsMain by getting {
            dependencies {
                implementation(kotlin("stdlib-js"))
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime-js:${Versions.kotlinSerialization}")
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-js:${Versions.kotlinCoroutines}")
            }
        }

        val jsTest by getting {
            dependencies {
                implementation(kotlin("test-js"))
            }
        }

        val nativeMain by getting {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime-native:${Versions.kotlinSerialization}")
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-native:${Versions.kotlinCoroutines}")
            }
        }

        val iosArm64Main by getting {
            dependsOn(nativeMain)
        }

        val iosX64Main by getting {
            dependsOn(nativeMain)
        }

        val macosX64Main by getting {
            dependsOn(nativeMain)
        }
    }
}

tasks {
    val generateProto by registering(ProtocTask::class) {
        includeDir.set(project.file("src/commonMain/proto"))
        outputDir.set(project.file("src/commonMain/kotlin"))
        kotlinPackage.set("pbandk.conformance.pb")
        logLevel.set("debug")
    }

    // DCE is now enable by default in Kotlin 1.3.70/71
    // and it doesn't work well with commonJS modules
    // Use of commonJs could be removed since default module is now UMD
    // but would require some code change
    val processDceJsKotlinJs by getting {
        enabled = false
    }
}
