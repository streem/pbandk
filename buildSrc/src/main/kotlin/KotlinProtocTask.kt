import org.gradle.api.provider.Property
import org.gradle.api.tasks.Console
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.Sync
import org.gradle.internal.os.OperatingSystem
import org.gradle.kotlin.dsl.property

@Suppress("UnstableApiUsage")
open class KotlinProtocTask : ProtocTask() {
    @Input
    @Optional
    val kotlinPackage: Property<String> = project.objects.property()

    @Input
    @Optional
    val kotlinPackagePrefix: Property<String> = project.objects.property()

    @Console
    val logLevel: Property<String> = project.objects.property()

    private val protocGenPbandkInstallDir = project.project(":protoc-gen-pbandk:protoc-gen-pbandk-jvm").tasks
        .named("installDist", Sync::class.java)
        .map { it.destinationDir }

    init {
        inputs.dir(protocGenPbandkInstallDir)
        plugin.set("pbandk")
        pluginPath.set(project.layout.file(protocGenPbandkInstallDir.map {
            it.resolve("bin/protoc-gen-pbandk" + ".bat".takeIf { OperatingSystem.current().isWindows }.orEmpty())
        }))
        pluginOptions.add(kotlinPackage.map { "kotlin_package" to it })
        pluginOptions.add(kotlinPackagePrefix.map { "kotlin_package_prefix" to it })
        pluginOptions.add(logLevel.map { "log" to it })
    }
}
