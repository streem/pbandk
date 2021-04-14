import org.gradle.kotlin.dsl.get
import org.gradle.plugins.signing.SigningExtension

fun SigningExtension.addMavenCentralSigning() {
    val gpgBase64Key = project.providers.gradleProperty("sonatypePgpKeyBase64").forUseAtConfigurationTime()
            .orElse(project.providers.environmentVariable("SONATYPE_PGP_KEY_BASE64").forUseAtConfigurationTime())
    val keyPassword = ""
    useInMemoryPgpKeys(gpgBase64Key.get(), keyPassword)
    sign(project.tasks["publishToMavenCentralRepository"])
}