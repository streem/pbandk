plugins {
    kotlin("multiplatform")
    kotlin("plugin.serialization")
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
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
                implementation(project(":runtime"))
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime-common:${Versions.kotlinSerialization}")
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
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime:${Versions.kotlinSerialization}")
            }
        }

        val jvmTest by getting {
            dependencies {
                implementation(kotlin("test"))
                implementation(kotlin("test-junit"))
                implementation("junit:junit:4.12")
            }
        }
    }
}

tasks {
    val generateProto by registering(KotlinProtocTask::class) {
        includeDir.set(project.file("src/commonMain/proto"))
        outputDir.set(project.file("src/commonMain/kotlin"))
        kotlinPackage.set("pbandk.gen.pb")
        logLevel.set("debug")
    }
}

publishing {
    publications.withType<MavenPublication>().configureEach {
        artifactId = "protoc-gen-kotlin-$artifactId"
        description = "Library for pbandk protoc plugin plugins"
        pom {
            configureForPbandk()
        }
    }
}
