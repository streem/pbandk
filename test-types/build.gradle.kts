plugins {
    kotlin("multiplatform")
}

kotlin {
    jvm {
        withJava()
    }

    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }

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
            languageSettings.optIn("kotlin.RequiresOptIn")
        }

        val commonMain by getting {
            dependencies {
                implementation(project(":pbandk-runtime"))
            }
        }

        val jvmMain by getting {
            dependencies {
                api("com.google.protobuf:protobuf-java:${Versions.protobufJava}")
            }
        }
    }
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
