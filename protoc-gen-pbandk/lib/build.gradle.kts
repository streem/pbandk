plugins {
    kotlin("multiplatform")
    `maven-publish`
    signing
}

description = "Kotlin code generator for Protocol Buffers and library for writing code generator plugins."

kotlin {
    explicitApi()

    jvm {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }

    sourceSets {
        all {
            languageSettings.optIn("kotlin.RequiresOptIn")
        }

        val commonMain by getting {
            dependencies {
                implementation(project(":pbandk-runtime"))
            }
        }

        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }

        val jvmMain by getting {
            dependencies {
                implementation("com.google.protobuf:protobuf-java:${Versions.protobufJava}")
            }
        }

        val jvmTest by getting {
            dependencies {
                implementation(kotlin("reflect"))
                implementation("com.github.tschuchortdev:kotlin-compile-testing:1.4.9")
            }
        }
    }
}

val extractWellKnownTypeProtos = rootProject.tasks.named<Sync>("extractWellKnownTypeProtos")

tasks {
    val generateProto by registering(KotlinProtocTask::class) {
        includeDir.set(layout.dir(extractWellKnownTypeProtos.map { it.destinationDir }))
        outputDir.set(project.file("src/commonMain/kotlin"))
        kotlinPackage.set("pbandk.gen.pb")
        logLevel.set("debug")
        protoFileSubdir("google/protobuf/compiler")
    }

    val generateTestProtoDescriptor by registering(DescriptorProtocTask::class) {
        val out = File(project.buildDir, name).also { it.mkdirs() }

        includeDir.set(project.file("src/jvmTest/resources/protos"))
        outputDir.set(out)
    }

    getByName("jvmTest").dependsOn(generateTestProtoDescriptor)
}

// Stub javadoc artifact to satisfy Maven Central requirements. It's only required for the jvm target.
// TODO: replace this with a real javadoc jar generated with Dokka
val jvmJavadocJar by tasks.registering(Jar::class) {
    archiveClassifier.set("javadoc")
}

publishing {
    publications.withType<MavenPublication>().configureEach {
        if (artifactId == "protoc-gen-pbandk-lib-jvm") {
            artifact(jvmJavadocJar)
        }
        configurePbandkPom(project.description!!)
    }
}
