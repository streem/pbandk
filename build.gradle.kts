import org.gradle.api.tasks.testing.logging.TestExceptionFormat
import org.gradle.api.tasks.testing.logging.TestLogEvent

// Top-level build configuration

plugins {
    kotlin("multiplatform") version Versions.kotlin apply false
    id("com.android.library") version Versions.androidGradlePlugin apply false
    id("org.springframework.boot") version Versions.springBootGradlePlugin apply false
    id("binary-compatibility-validator") version Versions.binaryCompatibilityValidatorGradlePlugin apply false

    id("com.google.osdetector") version Versions.osDetectorGradlePlugin
}

val sonatypeApiUser = providers.gradlePropertyOrEnvironmentVariable("sonatypeApiUser")
val sonatypeApiKey = providers.gradlePropertyOrEnvironmentVariable("sonatypeApiKey")
val sonatypeRepositoryId = providers.gradlePropertyOrEnvironmentVariable("sonatypeRepositoryId")
val publishToSonatype = sonatypeApiUser.isPresent && sonatypeApiKey.isPresent
if (!publishToSonatype) {
    logger.info("Sonatype API key not defined, skipping configuration of Maven Central publishing repository")
}

val signingKeyAsciiArmored = providers.gradlePropertyOrEnvironmentVariable("signingKeyAsciiArmored")
if (signingKeyAsciiArmored.isPresent) {
    subprojects {
        plugins.withType<SigningPlugin> {
            configure<SigningExtension> {
                @Suppress("UnstableApiUsage")
                useInMemoryPgpKeys(signingKeyAsciiArmored.get(), "")
                sign(extensions.getByType<PublishingExtension>().publications)
            }
        }
    }
} else {
    logger.info("PGP signing key not defined, skipping signing configuration")
}

val downloadProtoc by configurations.creating {
    isTransitive = false
}

val wellKnownTypes by configurations.creating {
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
    wellKnownTypes("com.google.protobuf:protobuf-java:${Versions.protobufJava}")
}

val extractWellKnownTypeProtos by tasks.registering(Sync::class) {
    dependsOn(wellKnownTypes)
    from({
        wellKnownTypes.filter { it.extension == "jar" }.map { zipTree(it) }
    })
    include("**/*.proto")
    includeEmptyDirs = false
    into(layout.buildDirectory.dir("bundled-protos"))
}

allprojects {
    repositories {
        mavenCentral()
    }

    tasks.withType<AbstractTestTask> {
        testLogging {
            outputs.upToDateWhen { false }
            showStandardStreams = true
            exceptionFormat = TestExceptionFormat.FULL
            events = setOf(
                TestLogEvent.PASSED,
                TestLogEvent.SKIPPED,
                TestLogEvent.FAILED
            )
        }
    }

    if (publishToSonatype) {
        plugins.withType<MavenPublishPlugin>() {
            configure<PublishingExtension> {
                repositories {
                    maven {
                        name = "sonatype"
                        url = when {
                            project.version.toString().endsWith("-SNAPSHOT") ->
                                uri("https://s01.oss.sonatype.org/content/repositories/snapshots/")
                            !sonatypeRepositoryId.isPresent ->
                                throw IllegalStateException("Sonatype Repository ID must be provided for non-SNAPSHOT builds")
                            else ->
                                uri("https://s01.oss.sonatype.org/service/local/staging/deployByRepositoryId/${sonatypeRepositoryId.get()}")
                        }

                        credentials {
                            username = sonatypeApiUser.get()
                            password = sonatypeApiKey.get()
                        }
                    }
                }
            }
        }
    }
}
