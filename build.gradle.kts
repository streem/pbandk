import java.nio.file.Paths
import java.nio.file.Path
import org.gradle.internal.os.OperatingSystem

// Top-level build configuration

buildscript {
    extra["kotlin_version"] = "1.3.61"
    extra["kotlin_serialization_version"] = "0.14.0"
    extra["protobuf_version"] = "3.11.1"
    extra["spring_boot_gradle_plugin_version"] = "2.1.7.RELEASE"

    repositories { 
        google()
        mavenCentral()
        jcenter()
        maven("https://kotlin.bintray.com/kotlinx")
        mavenLocal()
    }

    dependencies {
        classpath(kotlin("serialization", version = "${Versions.kotlin}"))
    }
}

plugins {
    id("org.jetbrains.kotlin.multiplatform") version "${Versions.kotlin}"
    id("maven-publish")
}

allprojects {
    group = "com.github.streem.pbandk"
    version = "0.8.0"

    repositories {
        google()
        mavenCentral()
        jcenter()
        maven("https://kotlin.bintray.com/kotlinx")
    }

    this.ext["mavenRepositoryUrl"] = "https://oss.sonatype.org/service/local/staging/deploy/maven2/"
    this.ext["snapshotRepositoryUrl"] = "https://oss.sonatype.org/content/repositories/snapshots/"

    this.ext["runProtoGen"] = { inPath: String, outPath: String, kotlinPackage: String?, logLevel: String?, inSubPath: String? ->
        // Build CLI args
        var args = mutableListOf("protoc")

        var kotlinOut = "--kotlin_out="

        if (kotlinPackage != null) kotlinOut += "kotlin_package=$kotlinPackage,"
        if (logLevel != null) kotlinOut += "log=$logLevel,"
        kotlinOut += "json_use_proto_names=true,"
        kotlinOut += "empty_arg:" + Paths.get(outPath)

        args.add(kotlinOut)

        args.add("--plugin=protoc-gen-kotlin=" +
                Paths.get(project.rootDir.toString(), "protoc-gen-kotlin/build/install/protoc-gen-kotlin/bin/protoc-gen-kotlin"))
        if (OperatingSystem.current().isWindows) args[args.count() - 1] += ".bat"

        var includePath = Paths.get(inPath)
        if (!includePath.isAbsolute) includePath = Paths.get(project.projectDir.toString(), inPath)
        args.add("-I$includePath")

        var filePath = includePath
        if (inSubPath != null) filePath = includePath.resolve(inSubPath)
        args.addAll(filePath.toFile().listFiles().filter {
            it.isFile() && it.toString().endsWith(".proto")
        }.map { it.absolutePath })

        // Run itz
        exec { commandLine(args) }
    }
}
