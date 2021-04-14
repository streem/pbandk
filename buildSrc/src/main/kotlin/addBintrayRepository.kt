import com.google.common.base.CaseFormat
import org.gradle.api.Project
import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.api.publish.maven.tasks.PublishToMavenRepository
import org.gradle.kotlin.dsl.withType
import java.net.URI

fun PublishingExtension.addMavenCentralRepository(project: Project, publication: MavenPublication) {
    val sonatypeApiUser = project.providers.gradleProperty("sonatypeApiUser")
        .forUseAtConfigurationTime()
        .orElse(project.providers.environmentVariable("SONATYPE_API_USER").forUseAtConfigurationTime())
    val sonatypeApiKey = project.providers.gradleProperty("sonatypeApiKey")
        .forUseAtConfigurationTime()
        .orElse(project.providers.environmentVariable("SONATYPE_API_KEY").forUseAtConfigurationTime())
    if (!sonatypeApiUser.isPresent || !sonatypeApiKey.isPresent) {
        project.logger.info("Sonatype API key not defined, skipping configuration of Maven Central publishing repository")
        return
    }

    val camelCaseArtifactId = CaseFormat.LOWER_HYPHEN.to(CaseFormat.UPPER_CAMEL, publication.artifactId)

    val mavenRepo = repositories.maven {
        name = "sonatype$camelCaseArtifactId"
        url = URI("https://oss.sonatype.org/service/local/staging/deploy/maven2")

        credentials {
            username = sonatypeApiUser.get()
            password = sonatypeApiKey.get()
        }
    }

    val publishToMavenCentralRepository = project.tasks.maybeCreate("publishToMavenCentralRepository").apply {
        group = "publishing"
        description = "Publishes all Maven publications to the Maven Central repositories."
    }

    project.tasks.withType<PublishToMavenRepository>()
        .matching { it.repository == mavenRepo }
        .all {
            // TODO add/test support for publishing snapshot versions
            if (this.publication.version.contains("SNAPSHOT")) {
                enabled = false
                // Blank out the task group so that this task doesn't show up in the `gradlew tasks` list by default
                group = ""
            } else {
                publishToMavenCentralRepository.dependsOn(this)
            }
        }
}
