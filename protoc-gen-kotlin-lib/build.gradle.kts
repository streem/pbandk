
plugins {
    kotlin("multiplatform")
    id("kotlinx-serialization")
    id("maven-publish")
}

project.ext["projectDescription"] = "Library for pbandk protobuf code generator"
apply(from = "../gradle/publish.gradle")

kotlin {
    jvm {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }

    // For ARM, should be changed to iosArm32 or iosArm64
    // For Linux, should be changed to e.g. linuxX64
    // For MacOS, should be changed to e.g. macosX64
    // For Windows, should be changed to e.g. mingwX64
    // macosX64("macos")

    sourceSets["commonMain"].dependencies {
        implementation(project(":runtime"))
        implementation(kotlin("stdlib-common"))
        implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime-common:${Versions.kotlin_serialization}")
    }

    sourceSets["commonTest"].dependencies {
        implementation(kotlin("test-common"))
        implementation(kotlin("test-annotations-common"))
    }

    sourceSets["jvmMain"].dependencies {
        implementation(kotlin("stdlib"))
        api(project(":runtime"))
        api("org.jetbrains.kotlinx:kotlinx-serialization-runtime:${Versions.kotlin_serialization}")
        api("com.google.protobuf:protobuf-java:3.11.1")
    }

    sourceSets["jvmTest"].dependencies {
        implementation(kotlin("test"))
        implementation(kotlin("test-junit"))
        implementation("junit:junit:4.12")
    }

//    /*
//    sourceSets["macosMain"].dependencies {
//    }
//    sourceSets["macosTest"].dependencies {
//    }
//    */
}

tasks.register("generateProto") {
    dependsOn(":protoc-gen-kotlin:installDist")

    doFirst {
        val runProtoGen = project.ext["runProtoGen"] as (String, String, String?, String?, String?) -> Unit
        runProtoGen("src/commonMain/proto", "src/commonMain/kotlin", "pbandk.gen.pb", "debug", null)
    }
}
