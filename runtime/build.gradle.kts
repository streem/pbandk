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
    explicitApi()

    android {
        publishAllLibraryVariants()
    }

    jvm()

    js(IR) {
        browser {}
        nodejs {}
    }

    iosArm64()
    iosX64()
    iosSimulatorArm64()

    tvosArm64()
    tvosX64()
    tvosSimulatorArm64()

    linuxArm64()
    linuxX64()
    macosArm64()
    macosX64()

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
                implementation(project(":test-types"))
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
    val generateWellKnownTypeProtos by registering(KotlinProtocTask::class) {
        includeDir.set(layout.dir(extractWellKnownTypeProtos.map { it.destinationDir }))
        outputDir.set(project.file("src/commonMain/kotlin"))
        kotlinPackage.set("pbandk.wkt")
        logLevel.set("debug")
        protoFileSubdir("google/protobuf")
    }

    val generateProtos by registering {
        dependsOn(generateWellKnownTypeProtos)
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
