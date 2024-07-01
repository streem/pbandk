import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("multiplatform")
}

kotlin {
    jvm {
        withJava()
    }

    js {
        browser {}
        nodejs {}

        compilations.all {
            compileTaskProvider.configure {
                // Skip compiler limits test on Kotlin/JS for now, since the Kotlin/JS compiler can't deal with large
                // protobuf messages (as of Kotlin 1.9). See https://github.com/streem/pbandk/issues/267 for details.
                exclude("pbandk/testpb/test_compiler_limits.kt")
            }
        }
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
        commonMain {
            dependencies {
                implementation(project(":pbandk-runtime"))
            }
        }

        jvmMain {
            dependencies {
                api("com.google.protobuf:protobuf-java:${Versions.protobufJava}")
            }
        }
    }
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = Versions.jvmTarget
}
tasks.withType<JavaCompile> {
    sourceCompatibility = Versions.jvmTarget
    targetCompatibility = Versions.jvmTarget
}

tasks {
    val generateKotlinTestProtos by registering(KotlinProtocTask::class) {
        includeDir.set(project.file("src/commonMain/proto"))
        outputDir.set(project.file("src/commonMain/kotlin"))
        kotlinPackage.set("pbandk.testpb")
        logLevel.set("debug")
        protoFileSubdir("pbandk/testpb")
    }

    val generateJavaTestProtos by registering(ProtocTask::class) {
        includeDir.set(project.file("src/commonMain/proto"))
        outputDir.set(project.file("src/jvmMain/java"))
        plugin.set("java")
        protoFileSubdir("pbandk/testpb")
    }

    val generateProtos by registering {
        dependsOn(generateKotlinTestProtos, generateJavaTestProtos)
    }
}
