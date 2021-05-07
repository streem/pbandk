import io.github.gradlenexus.publishplugin.NexusPublishExtension
import kotlinx.validation.ApiValidationExtension
import org.gradle.api.tasks.testing.logging.TestExceptionFormat
import org.gradle.api.tasks.testing.logging.TestLogEvent

// Top-level build configuration

plugins {
    kotlin("multiplatform") version Versions.kotlin apply false
    id("com.android.library") version Versions.androidGradlePlugin apply false
    id("org.springframework.boot") version Versions.springBootGradlePlugin apply false
    id("com.google.osdetector") version Versions.osDetectorGradlePlugin apply false

    id("binary-compatibility-validator") version Versions.binaryCompatibilityValidatorGradlePlugin
    id("io.github.gradle-nexus.publish-plugin") version Versions.nexusPublishGradlePlugin
}

configure<ApiValidationExtension> {
    ignoredProjects.addAll(
        project.subprojects.map { it.name }.minus(listOf("runtime"))
    )
    nonPublicMarkers.add("pbandk.PbandkInternal")
}

val sonatypeApiUser = providers.gradlePropertyOrEnvironmentVariable("sonatypeApiUser")
val sonatypeApiKey = providers.gradlePropertyOrEnvironmentVariable("sonatypeApiKey")
if (sonatypeApiUser.isPresent && sonatypeApiKey.isPresent) {
    configure<NexusPublishExtension> {
        repositories {
            sonatype {
                nexusUrl.set(uri("https://s01.oss.sonatype.org/service/local/"))
                snapshotRepositoryUrl.set(uri("https://s01.oss.sonatype.org/content/repositories/snapshots/"))
                username.set(sonatypeApiUser)
                password.set(sonatypeApiKey)
            }
        }
    }
} else {
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

val wellKnownTypes by configurations.creating {
    isTransitive = false
}

dependencies {
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
}