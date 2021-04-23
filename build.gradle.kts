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
}

configure<ApiValidationExtension> {
    ignoredProjects.addAll(
        project.subprojects.map { it.name }.minus(listOf("runtime"))
    )
    nonPublicMarkers.add("pbandk.PbandkInternal")
}

allprojects {
    repositories {
        jcenter()
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

subprojects {
    plugins.withType<MavenPublishPlugin> {
        val sonatypeApiUser = project.providers.gradleProperty("sonatypeApiUser")
                .forUseAtConfigurationTime()
                .orElse(project.providers.environmentVariable("SONATYPE_API_USER").forUseAtConfigurationTime())
        val sonatypeApiKey = project.providers.gradleProperty("sonatypeApiKey")
                .forUseAtConfigurationTime()
                .orElse(project.providers.environmentVariable("SONATYPE_API_KEY").forUseAtConfigurationTime())

        if (!sonatypeApiUser.isPresent || !sonatypeApiKey.isPresent) {
            project.logger.info("Sonatype API key not defined, skipping configuration of Maven Central publishing repository")
            return@withType
        }

        configure<PublishingExtension> {
            repositories {
                maven {
                    name = "Maven Central"
                    url = java.net.URI("https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/")

                    credentials {
                        username = sonatypeApiUser.get()
                        password = sonatypeApiKey.get()
                    }
                }
            }
        }
    }
    plugins.withType<SigningPlugin> {
        val gpgBase64Key = project.providers.gradleProperty("sonatypePgpKeyBase64").forUseAtConfigurationTime()
                .orElse(project.providers.environmentVariable("SONATYPE_PGP_KEY_BASE64").forUseAtConfigurationTime())
        val keyPassword = ""
        if (!gpgBase64Key.isPresent) {
            project.logger.info("Sonatype PGP key not defined, skipping signing configuration")
            return@withType
        }

        configure<SigningExtension> {
            useInMemoryPgpKeys(gpgBase64Key.get(), keyPassword)
            sign(project.tasks["publishToMavenCentralRepository"])
        }
    }
}