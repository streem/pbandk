import com.google.common.base.CaseFormat
import org.gradle.api.Project
import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.api.publish.maven.tasks.PublishToMavenRepository
import org.gradle.kotlin.dsl.withType
import java.net.URI

fun PublishingExtension.addBintrayRepository(project: Project, publication: MavenPublication) {
    val bintrayApiUser = project.providers.gradleProperty("bintrayApiUser")
        .forUseAtConfigurationTime()
        .orElse(project.providers.environmentVariable("BINTRAY_API_USER").forUseAtConfigurationTime())
    val bintrayApiKey = project.providers.gradleProperty("bintrayApiKey")
        .forUseAtConfigurationTime()
        .orElse(project.providers.environmentVariable("BINTRAY_API_KEY").forUseAtConfigurationTime())
    if (!bintrayApiUser.isPresent || !bintrayApiKey.isPresent) {
        project.logger.info("Bintray API key not defined, skipping configuration of Bintray maven publishing repository")
        return
    }

    val camelCaseArtifactId = CaseFormat.LOWER_HYPHEN.to(CaseFormat.UPPER_CAMEL, publication.artifactId)

    val mavenRepo = repositories.maven {
        name = "bintray$camelCaseArtifactId"

        val bintrayUser = "streem"
        val bintrayRepo = "pbandk"
        val bintrayPackage = "${publication.groupId}:${publication.artifactId}"
        url = URI("https://api.bintray.com/maven/$bintrayUser/$bintrayRepo/$bintrayPackage/;publish=1")

        credentials {
            username = bintrayApiUser.get()
            password = bintrayApiKey.get()
        }
    }

    val publishToBintrayRepository = project.tasks.maybeCreate("publishToBintrayRepository").apply {
        group = "publishing"
        description = "Publishes all Maven publications to the Bintray Maven repositories."
    }

    project.tasks.withType<PublishToMavenRepository>()
        .matching { it.repository == mavenRepo }
        .all {
            // Bintray does not support publishing snapshot versions
            if (this.publication.version.contains("SNAPSHOT")
                // Each Bintray "repository" will only contain a single package
                || this.publication.artifactId != publication.artifactId
            ) {
                enabled = false
                // Blank out the task group so that this task doesn't show up in the `gradlew tasks` list by default
                group = ""
            } else {
                publishToBintrayRepository.dependsOn(this)
            }
        }
}
