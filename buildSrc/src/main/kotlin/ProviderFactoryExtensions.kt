import com.google.common.base.CaseFormat
import org.gradle.api.provider.Provider
import org.gradle.api.provider.ProviderFactory

/**
 * Creates a [Provider] whose value is fetched from the Gradle property named [propertyName], or if there is no such
 * Gradle property, then from the environment variable whose name is the ALL_CAPS version of [propertyName]. For
 * example, given a [propertyName] of "fooBar", this function will look for an environment variable named "FOO_BAR".
 */
@Suppress("UnstableApiUsage")
fun ProviderFactory.gradlePropertyOrEnvironmentVariable(propertyName: String): Provider<String> {
    val envVariableName = CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, propertyName)
    return gradleProperty(propertyName)
        .forUseAtConfigurationTime()
        .orElse(environmentVariable(envVariableName).forUseAtConfigurationTime())
}