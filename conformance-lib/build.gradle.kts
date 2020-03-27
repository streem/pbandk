import org.jetbrains.kotlin.gradle.plugin.*
import org.gradle.api.tasks.testing.logging.*

plugins {
    id("org.jetbrains.kotlin.plugin.serialization")
    id("kotlinx-serialization")
    id("org.jetbrains.kotlin.multiplatform")
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
        browser {
            useCommonJs()
        }
        nodejs {}
    }

    // For ARM, should be changed to iosArm32 or iosArm64
    // For Linux, should be changed to e.g. linuxX64
    // For MacOS, should be changed to e.g. macosX64
    // For Windows, should be changed to e.g. mingwX64
    // macosX64("macos")

    sourceSets["commonMain"].dependencies {
        implementation(kotlin("stdlib-common"))
        implementation(project(":runtime"))
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
    }

    sourceSets["jvmTest"].dependencies {
        implementation(kotlin("test"))
        implementation(kotlin("test-junit"))
        implementation("junit:junit:4.12")
    }

    sourceSets["jsMain"].dependencies {
        implementation(project(":runtime"))
        implementation(kotlin("stdlib-js"))
        implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime-js:${Versions.kotlin_serialization}")
    }
    sourceSets["jsTest"].dependencies {
        implementation(kotlin("test-js"))
    }

//    sourceSets["macosMain"].dependencies {
//    }
//    sourceSets["macosTest"].dependencies {
//    }
}

tasks.withType<AbstractTestTask> {
    testLogging {
        outputs.upToDateWhen {false}
        showStandardStreams = true
        exceptionFormat = TestExceptionFormat.FULL
        events = setOf(TestLogEvent.PASSED,
                        TestLogEvent.SKIPPED,
                        TestLogEvent.FAILED)
    }
}

tasks.register("generateProto") {
    dependsOn(":protoc-gen-kotlin:installDist")

    doFirst {
        val runProtoGen = project.ext["runProtoGen"] as (String, String, String?, String?, String?) -> Unit
        runProtoGen("src/commonMain/proto", "src/commonMain/kotlin", "pbandk.conformance.pb", "debug", null)
    }
}
