import kotlinx.validation.ApiValidationExtension
import org.gradle.api.tasks.testing.logging.TestExceptionFormat
import org.gradle.api.tasks.testing.logging.TestLogEvent

// Top-level build configuration

plugins {
    kotlin("multiplatform") version Versions.kotlin apply false
    id("org.springframework.boot") version Versions.springBootGradlePlugin apply false

    id("binary-compatibility-validator") version Versions.binaryCompatibilityValidatorGradlePlugin
}

configure<ApiValidationExtension> {
    ignoredProjects.addAll(
        project.subprojects.map { it.name }.minus(
            listOf(
                "runtime"
            )
        )
    )
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
