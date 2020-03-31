package pbandk.gen

import com.google.protobuf.DescriptorProtos
import com.google.protobuf.compiler.PluginProtos
import pbandk.ByteArr
import pbandk.gen.pb.CodeGeneratorRequest
import pbandk.gen.pb.CodeGeneratorResponse
import pbandk.gen.pb.Version
import pbandk.wkt.*

// Simple conversion between JVM protos and Kotlin ones for bootstrapping
internal object BootstrapConverter {
    fun fromReq(req: PluginProtos.CodeGeneratorRequest) = req.convert()
    fun toResp(resp: CodeGeneratorResponse) = resp.convert()

    private fun PluginProtos.CodeGeneratorRequest.convert() = CodeGeneratorRequest(
        fileToGenerate = fileToGenerateList,
        parameter = parameter.orNull(hasParameter()),
        protoFile = protoFileList.map { it.convert() },
        compilerVersion = compilerVersion?.let {
            Version(
                major = it.major.orNull(it.hasMajor()),
                minor = it.minor.orNull(it.hasMinor()),
                patch = it.patch.orNull(it.hasPatch()),
                suffix = it.suffix.orNull(it.hasSuffix())
            )
        }
    )

    private fun DescriptorProtos.FileDescriptorProto.convert() = FileDescriptorProto(
        name = name.orNull(hasName()),
        `package` = `package`.orNull(hasPackage()),
        dependency = dependencyList,
        publicDependency = publicDependencyList,
        weakDependency = weakDependencyList,
        messageType = messageTypeList.map { it.convert() },
        enumType = enumTypeList.map { it.convert() },
        service = serviceList.map { it.convert() },
        extension = extensionList.map { it.convert() },
        options = options?.let {
            FileOptions(
                javaPackage = it.javaPackage.orNull(it.hasJavaPackage()),
                javaOuterClassname = it.javaOuterClassname.orNull(it.hasJavaOuterClassname()),
                javaMultipleFiles = it.javaMultipleFiles.orNull(it.hasJavaMultipleFiles()),
                javaGenerateEqualsAndHash = it.javaGenerateEqualsAndHash.orNull(it.hasJavaGenerateEqualsAndHash()),
                javaStringCheckUtf8 = it.javaStringCheckUtf8.orNull(it.hasJavaStringCheckUtf8()),
                optimizeFor = it.optimizeFor?.number?.let { FileOptions.OptimizeMode.fromValue(it) },
                goPackage = it.goPackage.orNull(it.hasGoPackage()),
                ccGenericServices = it.ccGenericServices.orNull(it.hasCcGenericServices()),
                javaGenericServices = it.javaGenericServices.orNull(it.hasJavaGenericServices()),
                pyGenericServices = it.pyGenericServices.orNull(it.hasPyGenericServices()),
                phpGenericServices = it.phpGenericServices.orNull(it.hasPhpGenericServices()),
                deprecated = it.deprecated.orNull(it.hasDeprecated()),
                ccEnableArenas = it.ccEnableArenas.orNull(it.hasCcEnableArenas()),
                objcClassPrefix = it.objcClassPrefix.orNull(it.hasObjcClassPrefix()),
                csharpNamespace = it.csharpNamespace.orNull(it.hasCsharpNamespace()),
                swiftPrefix = it.swiftPrefix.orNull(it.hasSwiftPrefix()),
                phpClassPrefix = it.phpClassPrefix.orNull(it.hasPhpClassPrefix()),
                phpNamespace = it.phpNamespace.orNull(it.hasPhpNamespace()),
                uninterpretedOption = it.uninterpretedOptionList.map { it.convert() }
            )
        },
        sourceCodeInfo = sourceCodeInfo?.let {
            SourceCodeInfo(location = it.locationList.map {
                SourceCodeInfo.Location(
                    path = it.pathList,
                    span = it.spanList,
                    leadingComments = it.leadingComments.orNull(it.hasLeadingComments()),
                    trailingComments = it.trailingComments.orNull(it.hasTrailingComments()),
                    leadingDetachedComments = it.leadingDetachedCommentsList
                )
            })
        },
        syntax = syntax.orNull(hasSyntax())
    )

    private fun DescriptorProtos.UninterpretedOption.convert() = UninterpretedOption(
        name = nameList.map { UninterpretedOption.NamePart(namePart = it.namePart) },
        stringValue = stringValue?.let { ByteArr(it.toByteArray()) }
    )

    private fun DescriptorProtos.DescriptorProto.convert(): DescriptorProto = DescriptorProto(
        name = name.orNull(hasName()),
        field = fieldList.map { it.convert() },
        extension = fieldList.map { it.convert() },
        nestedType = nestedTypeList.map { it.convert() },
        enumType = enumTypeList.map { it.convert() },
        extensionRange = extensionRangeList.map {
            DescriptorProto.ExtensionRange(
                start = it.start.orNull(it.hasStart()),
                end = it.end.orNull(it.hasEnd()),
                options = it.options?.let {
                    ExtensionRangeOptions(uninterpretedOption = it.uninterpretedOptionList.map { it.convert() })
                }
            )
        },
        oneofDecl = oneofDeclList.map { it.convert() },
        options = options?.let {
            MessageOptions(
                messageSetWireFormat = it.messageSetWireFormat.orNull(it.hasMessageSetWireFormat()),
                noStandardDescriptorAccessor =
                    it.noStandardDescriptorAccessor.orNull(it.hasNoStandardDescriptorAccessor()),
                deprecated = it.deprecated.orNull(it.hasDeprecated()),
                mapEntry = it.mapEntry.orNull(it.hasMapEntry()),
                uninterpretedOption = it.uninterpretedOptionList.map { it.convert() }
            )
        },
        reservedRange = reservedRangeList.map {
            DescriptorProto.ReservedRange(start = it.start.orNull(it.hasStart()), end = it.end.orNull(it.hasEnd()))
        },
        reservedName = reservedNameList
    )

    private fun DescriptorProtos.EnumDescriptorProto.convert() = EnumDescriptorProto(
        name = name.orNull(hasName()),
        value = valueList.map {
            EnumValueDescriptorProto(
                name = it.name.orNull(it.hasName()),
                number = it.number.orNull(it.hasNumber()),
                options = it.options?.let {
                    EnumValueOptions(
                        deprecated = it.deprecated.orNull(it.hasDeprecated()),
                        uninterpretedOption = it.uninterpretedOptionList.map { it.convert() }
                    )
                }
            )
        },
        options = options?.let {
            EnumOptions(
                allowAlias = it.allowAlias.orNull(it.hasAllowAlias()),
                deprecated = it.deprecated.orNull(it.hasDeprecated()),
                uninterpretedOption = it.uninterpretedOptionList.map { it.convert() }
            )
        },
        reservedRange = reservedRangeList.map {
            EnumDescriptorProto.EnumReservedRange(
                start = it.start.orNull(it.hasStart()),
                end = it.end.orNull(it.hasEnd())
            )
        },
        reservedName = reservedNameList
    )

    private fun DescriptorProtos.ServiceDescriptorProto.convert() = ServiceDescriptorProto(
        name = name.orNull(hasName()),
        method = methodList.map {
            MethodDescriptorProto(
                name = it.name.orNull(it.hasName()),
                inputType = it.inputType.orNull(it.hasInputType()),
                outputType = it.outputType.orNull(it.hasOutputType()),
                options = it.options?.let {
                    MethodOptions(
                        deprecated = it.deprecated.orNull(it.hasDeprecated()),
                        idempotencyLevel =
                            it.idempotencyLevel?.number?.let { MethodOptions.IdempotencyLevel.fromValue(it) },
                        uninterpretedOption = it.uninterpretedOptionList.map { it.convert() }
                    )
                },
                clientStreaming = it.clientStreaming.orNull(it.hasClientStreaming()),
                serverStreaming = it.serverStreaming.orNull(it.hasServerStreaming())
            )
        },
        options = options?.let {
            ServiceOptions(
                deprecated = it.deprecated.orNull(it.hasDeprecated()),
                uninterpretedOption = it.uninterpretedOptionList.map { it.convert() }
            )
        }
    )

    private fun DescriptorProtos.OneofDescriptorProto.convert() = OneofDescriptorProto(
        name = name.orNull(hasName()),
        options = options?.let { OneofOptions(uninterpretedOption = it.uninterpretedOptionList.map { it.convert() }) }
    )

    private fun DescriptorProtos.FieldDescriptorProto.convert() = FieldDescriptorProto(
        name = name.orNull(hasName()),
        number = number.orNull(hasNumber()),
        label = label?.number?.let { FieldDescriptorProto.Label.fromValue(it) },
        type = type?.number?.let { FieldDescriptorProto.Type.fromValue(it) },
        typeName = typeName.orNull(hasTypeName()),
        extendee = extendee.orNull(hasExtendee()),
        defaultValue = defaultValue.orNull(hasDefaultValue()),
        oneofIndex = oneofIndex.orNull(hasOneofIndex()),
        jsonName = jsonName.orNull(hasJsonName()),
        options = options?.let {
            FieldOptions(
                ctype = it.ctype?.number?.let { FieldOptions.CType.fromValue(it) },
                packed = it.packed.orNull(it.hasPacked()),
                jstype = it.jstype?.number?.let { FieldOptions.JSType.fromValue(it) },
                lazy = it.lazy.orNull(it.hasLazy()),
                deprecated = it.deprecated.orNull(it.hasDeprecated()),
                weak = it.weak.orNull(it.hasWeak()),
                uninterpretedOption = it.uninterpretedOptionList.map { it.convert() }
            )
        }
    )

    private fun CodeGeneratorResponse.convert() = PluginProtos.CodeGeneratorResponse.newBuilder().apply {
        error?.also { error = it }
        addAllFile(file.map {
            PluginProtos.CodeGeneratorResponse.File.newBuilder().apply {
                it.name?.also { name = it }
                it.insertionPoint?.also { insertionPoint = it }
                it.content?.also { content = it }
            }.build()
        })
    }.build()

    private fun String?.orNull(cond: Boolean) = if (cond) this else null
    private fun Int?.orNull(cond: Boolean) = if (cond) this else null
    private fun Boolean?.orNull(cond: Boolean) = if (cond) this else null
}