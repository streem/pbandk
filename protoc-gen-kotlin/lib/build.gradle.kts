plugins {
    kotlin("multiplatform")
    `maven-publish`
    signing
    id("com.google.osdetector")
}

kotlin {
    jvm {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }

    sourceSets {
        all {
            languageSettings.useExperimentalAnnotation("kotlin.RequiresOptIn")
        }

        val commonMain by getting {
            dependencies {
                implementation(project(":runtime"))
            }
        }

        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }

        val jvmTest by getting {
            dependencies {
                implementation(kotlin("test"))
                implementation(kotlin("test-junit"))
                implementation("junit:junit:4.12")
                implementation("com.github.tschuchortdev:kotlin-compile-testing:1.2.9")
            }
        }
    }
}

val downloadProtoc: Configuration by configurations.creating {
    isTransitive = false
}

dependencies {
    downloadProtoc(
        group = "com.google.protobuf",
        name = "protoc",
        version = Versions.protoc,
        classifier = osdetector.classifier,
        ext = "exe"
    )
}

tasks {
    val generateProto by registering(KotlinProtocTask::class) {
        includeDir.set(project.file("src/commonMain/proto"))
        outputDir.set(project.file("src/commonMain/kotlin"))
        kotlinPackage.set("pbandk.gen.pb")
        logLevel.set("debug")
    }

    val generateTestProtoDescriptor by registering(DescriptorProtocTask::class) {
        val out = File(project.buildDir, name).also { it.mkdirs() }

        includeDir.set(project.file("src/jvmTest/resources/protos"))
        outputDir.set(out)

        val protocBin = downloadProtoc.singleFile
            .also { it.setExecutable(true) }
            .absolutePath

        protoc.set(protocBin)
    }

    getByName("jvmTest").dependsOn(generateTestProtoDescriptor)
}

publishing {
    publications.withType<MavenPublication>().configureEach {
        description = "Library for pbandk protoc plugin plugins"
        pom {
            configureForPbandk()
        }
        addMavenCentralRepository(project, this)
    }

    signing {
        addMavenCentralSigning()
    }
}
