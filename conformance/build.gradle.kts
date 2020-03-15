import org.jetbrains.kotlin.gradle.plugin.*
import org.gradle.api.tasks.testing.logging.*

plugins {
    id("org.jetbrains.kotlin.plugin.serialization")
    id("kotlinx-serialization")
    id("org.jetbrains.kotlin.multiplatform")
    id("application")
}

application {
    mainClassName = "pbandk.conformance.MainKt"
    applicationName = "conformance"
}

kotlin {
    jvm()
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
        implementation(project(":runtime"))
        implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime:${Versions.kotlin_serialization}")
        implementation("com.google.protobuf:protobuf-java:${Versions.protobuf}")
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

// This is a workaround because kotlin multiplatform plugin does not work well with application plugin
afterEvaluate {
    tasks {
        val compileKotlinJvm by getting(org.jetbrains.kotlin.gradle.tasks.KotlinCompile::class)
        val jvmProcessResources by getting(Copy::class)
        val jvmRun by creating(JavaExec::class) {
            dependsOn(compileKotlinJvm, jvmProcessResources)
            group = "run"
            main = "pbandk.conformance.MainKt"
            classpath = configurations["jvmRuntimeClasspath"] + compileKotlinJvm.outputs.files +
                    jvmProcessResources.outputs.files
            workingDir = buildDir
            args = System.getProperty("exec.args", "").split(" ")
        }
        val jvmJar by getting(Jar::class) {
            manifest {
                attributes["Main-Class"] = jvmRun.main
                attributes["Version"] = project.version
            }
            from(kotlin.jvm().compilations.getByName("main").compileDependencyFiles.map { if (it.isDirectory) it else zipTree(it) })
        }
    }
}

tasks.register("generateProto") {
    dependsOn(":protoc-gen-kotlin:packagePlugin")

    doFirst {
        val runProtoGen = project.ext["runProtoGen"] as (String, String, String?, String?, String?) -> Unit
        runProtoGen("src/commonMain/proto", "src/commonMain/kotlin", "pbandk.gen.pb", "debug", null)
    }
}

tasks.register("package") {
    dependsOn(":conformance:jvmJar")
    dependsOn(":conformance:installDist")

    doLast {
        copy {
            from("$buildDir/libs/conformance-jvm-${project.version}.jar")
            into("$buildDir/install/conformance/lib/")
            rename { "conformance-${project.version}.jar" }
        }
    }
}