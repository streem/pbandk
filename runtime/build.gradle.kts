import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("multiplatform")
    id("com.android.library")
    `maven-publish`
    signing
    id("org.jetbrains.kotlinx.binary-compatibility-validator")
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

    androidTarget {
        publishAllLibraryVariants()
    }

    jvm()

    js {
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
            languageSettings {
                optIn("pbandk.ExperimentalProtoJson")
                optIn("pbandk.ExperimentalProtoReflection")
                optIn("pbandk.PbandkInternal")
                optIn("pbandk.PublicForGeneratedCode")
                optIn("kotlin.js.ExperimentalJsExport")
            }
        }

        commonMain {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:${Versions.kotlinSerialization}")
            }
        }

        commonTest {
            dependencies {
                implementation(kotlin("test"))
                implementation(project(":test-types"))
            }
        }

        androidMain {
            kotlin.srcDir("src/commonJvmAndroid/kotlin")
            dependencies {
                api(project(":pbandk-protos"))
            }
        }

        val androidUnitTest by getting {
            dependencies {
                runtimeOnly("org.robolectric:android-all:${Versions.robolectric}")
            }
        }

        jvmMain {
            kotlin.srcDir("src/commonJvmAndroid/kotlin")
            dependencies {
                api(project(":pbandk-protos"))
            }
        }

        jsMain {
            dependencies {
                implementation(npm("protobufjs", "^${Versions.protobufJs}"))
            }
        }
    }
}

android {
    namespace = "pro.streem.pbandk"

    compileSdk = Versions.androidTargetSdk
    defaultConfig {
        minSdk = Versions.androidMinSdk
    }
    testOptions {
        targetSdk = Versions.androidTargetSdk
    }
    lint {
        targetSdk = Versions.androidTargetSdk
    }
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = Versions.jvmTarget
}
tasks.withType<JavaCompile> {
    targetCompatibility = Versions.jvmTarget
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
