import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
    kotlin("multiplatform")
    id("com.android.library")
    `maven-publish`
    signing
}

description = "Kotlin runtime library for Protocol Buffers. It is built to work across multiple Kotlin platforms."

repositories {
    google()
}

kotlin {
    android {
        publishAllLibraryVariants()
    }

    jvm()

    js {
        useCommonJs()
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
            languageSettings.enableLanguageFeature("InlineClasses")

            languageSettings.useExperimentalAnnotation("pbandk.ExperimentalProtoJson")
            languageSettings.useExperimentalAnnotation("pbandk.PbandkInternal")
            languageSettings.useExperimentalAnnotation("pbandk.PublicForGeneratedCode")
            languageSettings.useExperimentalAnnotation("kotlin.RequiresOptIn")
        }

        val commonMain by getting {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:${Versions.kotlinSerialization}")
            }
        }

        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }

        val androidMain by getting {
            kotlin.srcDir("src/commonJvmAndroid/kotlin")
            dependencies {
                api(project(":protos"))
            }
        }

        val androidTest by getting {
            dependencies {
                implementation(kotlin("test"))
                implementation(kotlin("test-junit"))
                implementation("junit:junit:${Versions.junit}")
                runtimeOnly("org.robolectric:android-all:${Versions.robolectric}")
            }
        }

        val jvmMain by getting {
            kotlin.srcDir("src/commonJvmAndroid/kotlin")
            dependencies {
                api(project(":protos"))
            }
        }

        val jvmTest by getting {
            dependencies {
                implementation(project(":jvm-test-types"))
                implementation(kotlin("test"))
                implementation(kotlin("test-junit"))
                implementation("junit:junit:${Versions.junit}")
            }
        }

        val jsMain by getting {
            dependencies {
                implementation(npm("protobufjs", "^${Versions.protobufJs}"))
            }
        }

        val jsTest by getting {
            dependencies {
                implementation(kotlin("test-js"))
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

    // DCE is now enabled by default in Kotlin 1.3.7x
    // and it doesn't work well with commonJS modules
    // Use of commonJs could be removed since default module is now UMD
    // but would require some code change
    val processDceJsKotlinJs by getting {
        enabled = false
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
            if (artifactId == "runtime-jvm") {
                artifact(jvmJavadocJar)
            }
            artifactId = "pbandk-$artifactId"
            configurePbandkPom(project.description!!)
        }
    }
}
