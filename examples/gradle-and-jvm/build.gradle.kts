import com.google.protobuf.gradle.*
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.72"
    application
    id("com.google.protobuf") version "0.8.12"
    // Fetch/sync remote proto files prior to code gen.
    id("com.tinder.gitquery") version "2.0.1"
}

val protoDir = "src/main/proto"

gitQuery {
    configFile = "gitquery-proto.yml"
    outputDir = protoDir
    repoDir = "tmp/.gitquery"
}

sourceSets {
    main {
        proto.srcDirs(protoDir)
    }
}

val protobufVersion by extra("3.11.1")
val pbandkVersion by extra("0.9.0-SNAPSHOT")

repositories {
    if (System.getenv("CI") == "true") {
        mavenLocal()
    }
    jcenter()
}

application {
    mainClassName = "pbandk.examples.addressbook.MainKt"
    applicationName = "addressbook"
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("pro.streem.pbandk:pbandk-runtime-jvm:$pbandkVersion")
}

protobuf {
    generatedFilesBaseDir = "$projectDir/src"
    protoc {
        artifact = "com.google.protobuf:protoc:$protobufVersion"
    }
    plugins {
        id("kotlin") {
            artifact = "pro.streem.pbandk:protoc-gen-kotlin-jvm:$pbandkVersion:jvm8@jar"
        }
    }
    generateProtoTasks {
        ofSourceSet("main").forEach { task ->
            if (task.name == "generateProto") {
                task.dependsOn(tasks.getByName("gitQuery"))
            }
            task.builtins {
                remove("java")
            }
            task.plugins {
                id("kotlin") {
                    option("kotlin_package=pbandk.examples.addressbook.pb")
                }
            }
        }
    }
}

tasks {
    compileJava {
        enabled = false
    }

    withType<KotlinCompile>().configureEach {
        kotlinOptions {
            jvmTarget = "1.8"
            freeCompilerArgs += "-Xopt-in=kotlin.RequiresOptIn"
        }
    }
}

// Workaround the Gradle bug resolving multi-platform dependencies.
// Fix courtesy of https://github.com/square/okio/issues/647
configurations.forEach {
    if (it.name.toLowerCase().contains("kapt") || it.name.toLowerCase().contains("proto")) {
        it.attributes.attribute(Usage.USAGE_ATTRIBUTE, objects.named(Usage::class.java, Usage.JAVA_RUNTIME))
    }
}
