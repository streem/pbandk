plugins {
    kotlin("multiplatform")
    `maven-publish`
    // Fetch/sync remote proto files prior to code gen.
    id("com.tinder.gitquery")
}

val protoDir = "src/commonMain/proto"

gitQuery {
    configFile = "gitquery-proto.yml"
    outputDir = protoDir
    repoDir = "tmp/.gitquery"
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
            }
        }
    }
}

tasks {
    val generateProto by registering(KotlinProtocTask::class) {
        includeDir.set(project.file(protoDir))
        outputDir.set(project.file("src/commonMain/kotlin"))
        kotlinPackage.set("pbandk.gen.pb")
        logLevel.set("debug")
        dependsOn("gitQuery")
    }
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
