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
    val jsonSupport: Property<Boolean> = project.objects.property<Boolean>().apply {
        convention(true)
    }

    @Input
    @Optional
    val jsonUseProtoNames: Property<Boolean> = project.objects.property<Boolean>().apply {
        convention(true)
    }

    @Console
    val logLevel: Property<String> = project.objects.property()

    private val protocGenKotlinInstallDir = project.project(":protoc-gen-kotlin:jvm").tasks
        .named("installDist", Sync::class.java)
        .map { it.destinationDir }

    init {
        inputs.dir(protocGenKotlinInstallDir)
        plugin.set("kotlin")
        pluginPath.set(project.layout.file(protocGenKotlinInstallDir.map {
            it.resolve("bin/protoc-gen-kotlin" + ".bat".takeIf { OperatingSystem.current().isWindows }.orEmpty())
        }))
        pluginOptions.add(kotlinPackage.map { "kotlin_package" to it })
        pluginOptions.add(logLevel.map { "log" to it })
        pluginOptions.add(jsonSupport.map { "json_support" to it })
        pluginOptions.add(jsonUseProtoNames.map { "json_use_proto_names" to it })
    }
}