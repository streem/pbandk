import java.nio.file.Paths

plugins {
    kotlin("multiplatform")
    kotlin("plugin.serialization")
    `maven-publish`
}

kotlin {

    jvm {
        withJava()
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
    // macosX64("macos")

    sourceSets["commonMain"].dependencies {
        implementation(kotlin("stdlib-common"))
        implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime-common:${Versions.kotlinSerialization}")
    }
    sourceSets["commonTest"].dependencies {
        implementation(kotlin("test-common"))
        implementation(kotlin("test-annotations-common"))
    }

    sourceSets["jvmMain"].dependencies {
        implementation(kotlin("stdlib"))
        implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime:${Versions.kotlinSerialization}")
        api("com.google.protobuf:protobuf-java:${Versions.protobufJava}")
    }
    sourceSets["jvmTest"].dependencies {
        implementation(kotlin("test"))
        implementation(kotlin("test-junit"))
        implementation("junit:junit:4.12")
    }

    sourceSets["jsMain"].dependencies {
        implementation(kotlin("stdlib-js"))
        implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime-js:${Versions.kotlinSerialization}")
        implementation(npm("protobufjs", "^${Versions.protobufJs}"))
    }
    sourceSets["jsTest"].dependencies {
        implementation(kotlin("test-js"))
    }

    //    sourceSets["macosMain"].dependencies {
    //    }
    //    sourceSets["macosTest"].dependencies {
    //    }
}

tasks {
    val generateWellKnownTypes by registering {
        dependsOn(project(":protoc-gen-kotlin").tasks.named("installDist"))

        doFirst {
            val protocPath = System.getProperty("protoc.path")
                ?: throw InvalidUserDataException("System property protoc.path must be set")

            runProtoGen(
                project,
                Paths.get(protocPath, "include").toString(),
                "src/commonMain/kotlin",
                "pbandk.wkt",
                "debug",
                "google/protobuf"
            )
        }
    }

    val generateTestTypes by registering {
        dependsOn(project(":protoc-gen-kotlin").tasks.named("installDist"))

        doFirst {
            runProtoGen(project, "src/jvmTest/proto", "src/jvmTest/kotlin", "pbandk.testpb", "debug", "pbandk/testpb")
        }
        doFirst {
            exec {
                commandLine("protoc", "-Isrc/jvmTest/proto", "--java_out=src/jvmTest/java", "src/jvmTest/proto/pbandk/testpb/test.proto")
            }
        }
    }
}

publishing {
    publications.withType<MavenPublication>().configureEach {
        artifactId = "pbandk-$artifactId"
        description = "Library for pbandk runtime protobuf code"
        pom {
            configureForPbandk()
        }
    }
}
