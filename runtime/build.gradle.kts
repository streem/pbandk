import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
    kotlin("multiplatform")
    id("com.android.library")
    `maven-publish`
    signing
    id("binary-compatibility-validator")
}

description = "Kotlin runtime library for Protocol Buffers. It is built to work across multiple Kotlin platforms."

repositories {
    google()
}

apiValidation {
    nonPublicMarkers.add("pbandk.PbandkInternal")
}

kotlin {
    android {
        publishAllLibraryVariants()
    }

    jvm()

    js(BOTH) {
        browser {}
        nodejs {}
    }

    iosArm64()
    iosX64()

    // For ARM, should be changed to iosArm32 or iosArm64
    // For Linux, should be changed to e.g. linuxX64
    // For MacOS, should be changed to e.g. macosX64
    // For Windows, should be changed to e.g. mingwX64
    macosX64()
    linuxX64()

    sourceSets {
        all {
            languageSettings.optIn("pbandk.ExperimentalProtoJson")
            languageSettings.optIn("pbandk.ExperimentalProtoReflection")
            languageSettings.optIn("pbandk.PbandkInternal")
            languageSettings.optIn("pbandk.PublicForGeneratedCode")
            languageSettings.optIn("kotlin.RequiresOptIn")
            languageSettings.optIn("kotlin.js.ExperimentalJsExport")
        }

        val commonMain by getting {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:${Versions.kotlinSerialization}")
            }
        }

        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }

        val androidMain by getting {
            kotlin.srcDir("src/commonJvmAndroid/kotlin")
            dependencies {
                api(project(":pbandk-protos"))
            }
        }

        val androidTest by getting {
            dependencies {
                runtimeOnly("org.robolectric:android-all:${Versions.robolectric}")
            }
        }

        val jvmMain by getting {
            kotlin.srcDir("src/commonJvmAndroid/kotlin")
            dependencies {
                api(project(":pbandk-protos"))
            }
        }

        val jvmTest by getting {
            dependencies {
                implementation(project(":jvm-test-types"))
            }
        }

        val jsMain by getting {
            dependencies {
                implementation(npm("protobufjs", "^${Versions.protobufJs}"))
            }
        }

        val nativeMain by creating {
            dependsOn(commonMain)
        }
    }

    targets.withType<KotlinNativeTarget> {
        val main by compilations.getting {
            defaultSourceSet {
                val nativeMain by sourceSets.getting
                dependsOn(nativeMain)
            }
        }
    }
}

android {
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")

    compileSdkVersion(Versions.androidTargetSdk)
    defaultConfig {
        minSdkVersion(Versions.androidMinSdk)
        targetSdkVersion(Versions.androidTargetSdk)
    }
}

val extractWellKnownTypeProtos = rootProject.tasks.named<Sync>("extractWellKnownTypeProtos")

tasks {
    val generateWellKnownTypes by registering(KotlinProtocTask::class) {
        includeDir.set(layout.dir(extractWellKnownTypeProtos.map { it.destinationDir }))
        outputDir.set(project.file("src/commonMain/kotlin"))
        kotlinPackage.set("pbandk.wkt")
        logLevel.set("debug")
        protoFileSubdir("google/protobuf")
    }

    val generateKotlinTestTypes by registering(KotlinProtocTask::class) {
        includeDir.set(project.file("src/commonTest/proto"))
        outputDir.set(project.file("src/commonTest/kotlin"))
        kotlinPackage.set("pbandk.testpb")
        logLevel.set("debug")
        protoFileSubdir("pbandk/testpb")
    }

    val generateJavaTestTypes by registering(ProtocTask::class) {
        includeDir.set(project.file("src/commonTest/proto"))
        val outputProject = rootProject.findProject("jvm-test-types")!!
        outputDir.set(outputProject.file("src/main/java"))
        plugin.set("java")
        protoFileSubdir("pbandk/testpb")
    }

    val generateTestTypes by registering {
        dependsOn(generateKotlinTestTypes, generateJavaTestTypes)
    }
}

// Stub javadoc artifact to satisfy Maven Central requirements. It's only required for the jvm target.
// TODO: replace this with a real javadoc jar generated with Dokka
val jvmJavadocJar by tasks.registering(Jar::class) {
    archiveClassifier.set("javadoc")
}

afterEvaluate {
    // This needs to be inside of `afterEvaluate` to work correctly with the Android Gradle plugin
    publishing {
        publications.withType<MavenPublication>().configureEach {
            if (artifactId == "pbandk-runtime-jvm") {
                artifact(jvmJavadocJar)
            }
            configurePbandkPom(project.description!!)
        }
    }
}
