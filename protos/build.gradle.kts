plugins {
    kotlin("jvm")
    `maven-publish`
    signing
}

/**
 * The main purpose of this sub-project is to allow using pbandk from the Protobuf Gradle Plugin. The Protobuf Gradle
 * Plugin expects to find .proto files for the Well-Known Types somewhere in the pbandk dependency chain.
 */

description = "Kotlin library for Protocol Buffers. This artifact contains the .proto files for the Protocol Buffer Well-Known Types."

val extractWellKnownTypeProtos = rootProject.tasks.named<Sync>("extractWellKnownTypeProtos")

sourceSets {
    main {
        resources.srcDir(extractWellKnownTypeProtos)
    }
}

@Suppress("UnstableApiUsage")
java {
    withSourcesJar()
    withJavadocJar()
}

publishing {
    val protos by publications.creating(MavenPublication::class) {
        from(components["java"])
        configurePbandkPom(project.description!!)
    }
}