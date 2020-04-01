import java.nio.file.Paths

plugins {
    kotlin("multiplatform")
    kotlin("plugin.serialization")
    `maven-publish`
}

project.ext["projectDescription"] = "Library for pbandk runtime protobuf code"
apply(from = "../gradle/publish.gradle")

kotlin {

    jvm {
        withJava()
    }

    js {
        useCommonJs()
        browser {}
        nodejs {}
    }

    val onPhone = System.getenv("SDK_NAME")?.startsWith("iphoneos")?:false
    if(onPhone){
        iosArm64("ios")
    }else{
        iosX64("ios")
    }

    // For ARM, should be changed to iosArm32 or iosArm64
    // For Linux, should be changed to e.g. linuxX64
    // For MacOS, should be changed to e.g. macosX64
    // For Windows, should be changed to e.g. mingwX64
    // macosX64("macos")

    sourceSets["commonMain"].dependencies {
        implementation(kotlin("stdlib-common"))
        implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime-common:${Versions.kotlinSerialization}")
    }
    sourceSets["commonTest"].dependencies {
        implementation(kotlin("test-common"))
        implementation(kotlin("test-annotations-common"))
    }

    sourceSets["jvmMain"].dependencies {
        implementation(kotlin("stdlib"))
        implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime:${Versions.kotlinSerialization}")
        api("com.google.protobuf:protobuf-java:${Versions.protobufJava}")
    }
    sourceSets["jvmTest"].dependencies {
        implementation(kotlin("test"))
        implementation(kotlin("test-junit"))
        implementation("junit:junit:4.12")
    }

    sourceSets["jsMain"].dependencies {
        implementation(kotlin("stdlib-js"))
        implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime-js:${Versions.kotlinSerialization}")
        implementation(npm("protobufjs", "^${Versions.protobufJs}"))
    }
    sourceSets["jsTest"].dependencies {
        implementation(kotlin("test-js"))
    }

    sourceSets["iosMain"].dependencies {
        implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime-native:${Versions.kotlin_serialization}")
    }
    //sourceSets["macosTest"].dependencies {
    //}
}

tasks {
    val generateWellKnownTypes by registering(ProtocTask::class) {
        val protocPath = provider {
            System.getProperty("protoc.path")
                ?: throw InvalidUserDataException("System property protoc.path must be set")
        }.map { rootProject.layout.projectDirectory.dir(it) }

        includeDir.set(protocPath.map { it.dir("include") })
        outputDir.set(project.file("src/commonMain/kotlin"))
        kotlinPackage.set("pbandk.wkt")
        logLevel.set("debug")
        protoFileSubdir("google/protobuf")
    }

    val generateKotlinTestTypes by registering(ProtocTask::class) {
        includeDir.set(project.file("src/jvmTest/proto"))
        outputDir.set(project.file("src/jvmTest/kotlin"))
        kotlinPackage.set("pbandk.testpb")
        logLevel.set("debug")
        protoFileSubdir("pbandk/testpb")
    }

    val generateJavaTestTypes by registering(Exec::class) {
        commandLine(
            "protoc",
            "-Isrc/jvmTest/proto",
            "--java_out=src/jvmTest/java",
            "src/jvmTest/proto/pbandk/testpb/test.proto"
        )
    }

    val generateTestTypes by registering {
        dependsOn(generateKotlinTestTypes, generateJavaTestTypes)
    }
}

publishing {
    publications.withType<MavenPublication>().configureEach {
        artifactId = "pbandk-$artifactId"
        description = "Library for pbandk runtime protobuf code"
        pom {
            configureForPbandk()
        }
    }
}
