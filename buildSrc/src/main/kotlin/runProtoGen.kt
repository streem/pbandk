import org.gradle.api.Project
import org.gradle.internal.os.OperatingSystem
import java.nio.file.Paths

fun runProtoGen(
    project: Project,
    inPath: String,
    outPath: String,
    kotlinPackage: String? = null,
    logLevel: String? = null,
    inSubPath: String? = null
) {
    // Build CLI args
    val args = mutableListOf("protoc")

    val kotlinOut = mutableListOf<String>()

    if (kotlinPackage != null) kotlinOut += "kotlin_package=$kotlinPackage"
    if (logLevel != null) kotlinOut += "log=$logLevel"
    kotlinOut += "json_use_proto_names=true"
    kotlinOut += "empty_arg:" + Paths.get(outPath)

    args += kotlinOut.joinToString(",", prefix = "--kotlin_out=")

    args += "--plugin=protoc-gen-kotlin=${Paths.get(
        project.rootDir.toString(),
        "protoc-gen-kotlin/jvm/build/install/protoc-gen-kotlin/bin/protoc-gen-kotlin"
    )}"
    if (OperatingSystem.current().isWindows) args[args.count() - 1] += ".bat"

    var includePath = Paths.get(inPath)
    if (!includePath.isAbsolute) includePath = Paths.get(project.projectDir.toString(), inPath)
    args += "-I"
    args += includePath.toString()

    var filePath = includePath
    if (inSubPath != null) filePath = includePath.resolve(inSubPath)
    args += filePath.toFile()
        .listFiles { file -> file.isFile && file.toString().endsWith(".proto") }
        .orEmpty()
        .map { it.absolutePath }

    // Run it
    project.exec { commandLine(args) }
}
