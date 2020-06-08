import com.google.protobuf.gradle.*

plugins {
    `java-library`
    id("com.google.protobuf")
}

val pbandkVersion: String by rootProject.extra
val protobufVersion = val protobufVersion = "3.11.1"

dependencies {
    // This is needed for includes, ref: https://github.com/google/protobuf-gradle-plugin/issues/41#issuecomment-143884188
    compileOnly("com.google.protobuf:protobuf-java:$protobufVersion")
}

protobuf {
    protoc {
        artifact = "com.google.protobuf:protoc:$protobufVersion"
    }
    plugins {
        id("kotlin") {
            artifact = "com.github.streem.pbandk:protoc-gen-kotlin-jvm:$pbandkVersion:jvm8@jar"
        }
    }
    generateProtoTasks {
        ofSourceSet("main").forEach { task ->
            task.builtins {
                remove("java")
            }
            task.plugins {
                id("kotlin") {
                    option("kotlin_package=pbandk.examples.browserjs.pb")
                }
            }
        }
    }
}

tasks {
    compileJava {
        enabled = false
    }
}
