import org.jetbrains.kotlin.ir.backend.js.compile

plugins {
    kotlin("multiplatform")
    `maven-publish`
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
                implementation(kotlin("stdlib-common"))
                implementation(project(":runtime"))
            }
        }

        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }

        val jvmMain by getting {
            dependencies {
                implementation(kotlin("stdlib-jdk8"))
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

configurations {
    create("downloadProtoc") {
        isTransitive = false
    }
}

dependencies {
    val arch = System.getProperty("os.arch").toLowerCase().let {
        when {
            it.contains("amd64") || it.contains("x86_64") -> "x86_64"
            else -> "x86_32"
        }
    }
    val os = System.getProperty("os.name").toLowerCase().let {
        when {
            it.contains("windows") -> "windows"
            it.contains("mac os x") || it.contains("darwin") || it.contains("osx") -> "osx"
            else -> "linux"
        }
    }
    "downloadProtoc"(group="com.google.protobuf", name="protoc", version="3.10.1", classifier = "$os-$arch", ext = "exe")
}

tasks {
    val generateProto by registering(KotlinProtocTask::class) {
        includeDir.set(project.file("src/commonMain/proto"))
        outputDir.set(project.file("src/commonMain/kotlin"))
        kotlinPackage.set("pbandk.gen.pb")
        logLevel.set("debug")
    }

    val generateTestProto by registering(DescriptorProtocTask::class) {
        includeDir.set(project.file("src/jvmTest/resources/protos"))
        outputDir.set(temporaryDir)

        val protocBin = configurations["downloadProtoc"].singleFile
            .also { it.setExecutable(true) }
            .absolutePath

        protoc.set(protocBin)
    }

    getByName("jvmTest").dependsOn(generateTestProto)
}

publishing {
    publications.withType<MavenPublication>().configureEach {
        description = "Library for pbandk protoc plugin plugins"
        pom {
            configureForPbandk()
        }
        addBintrayRepository(project, this)
    }
}
