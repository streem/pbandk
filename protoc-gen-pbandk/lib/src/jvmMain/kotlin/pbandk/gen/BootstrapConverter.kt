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
                javaStringCheckUtf8 = it.javaStringCheckUtf8.orNull(it.hasJavaStringCheckUtf8()),
                optimizeFor = it.optimizeFor?.number?.let { FileOptions.OptimizeMode.fromValue(it) },
                goPackage = it.goPackage.orNull(it.hasGoPackage()),
                ccGenericServices = it.ccGenericServices.orNull(it.hasCcGenericServices()),
                javaGenericServices = it.javaGenericServices.orNull(it.hasJavaGenericServices()),
                pyGenericServices = it.pyGenericServices.orNull(it.hasPyGenericServices()),
                deprecated = it.deprecated.orNull(it.hasDeprecated()),
                ccEnableArenas = it.ccEnableArenas.orNull(it.hasCcEnableArenas()),
                objcClassPrefix = it.objcClassPrefix.orNull(it.hasObjcClassPrefix()),
                csharpNamespace = it.csharpNamespace.orNull(it.hasCsharpNamespace()),
                swiftPrefix = it.swiftPrefix.orNull(it.hasSwiftPrefix()),
                phpClassPrefix = it.phpClassPrefix.orNull(it.hasPhpClassPrefix()),
                phpNamespace = it.phpNamespace.orNull(it.hasPhpNamespace()),
                phpMetadataNamespace = it.phpMetadataNamespace.orNull(it.hasPhpMetadataNamespace()),
                rubyPackage = it.rubyPackage.orNull(it.hasRubyPackage()),
                features = it.features?.convert(),
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
        syntax = syntax.orNull(hasSyntax()),
        edition = edition.number.orNull(hasEdition())?.let { Edition.fromValue(it) },
    )

    private fun DescriptorProtos.UninterpretedOption.convert() = UninterpretedOption(
        name = nameList.map { UninterpretedOption.NamePart(namePart = it.namePart, isExtension = false) },
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
                    ExtensionRangeOptions(
                        uninterpretedOption = it.uninterpretedOptionList.map { it.convert() },
                        declaration = it.declarationList.map { it.convert() },
                        features = it.features?.convert(),
                        verification = it.verification?.number?.let {
                            ExtensionRangeOptions.VerificationState.fromValue(it)
                        }
                    )
                }
            )
        },
        oneofDecl = oneofDeclList.map { it.convert() },
        options = options?.let {
            @Suppress("DEPRECATION")
            MessageOptions(
                messageSetWireFormat = it.messageSetWireFormat.orNull(it.hasMessageSetWireFormat()),
                noStandardDescriptorAccessor =
                    it.noStandardDescriptorAccessor.orNull(it.hasNoStandardDescriptorAccessor()),
                deprecated = it.deprecated.orNull(it.hasDeprecated()),
                mapEntry = it.mapEntry.orNull(it.hasMapEntry()),
                deprecatedLegacyJsonFieldConflicts = it.deprecatedLegacyJsonFieldConflicts.orNull(it.hasDeprecatedLegacyJsonFieldConflicts()),
                features = it.features?.convert(),
                uninterpretedOption = it.uninterpretedOptionList.map { it.convert() }
            )
        },
        reservedRange = reservedRangeList.map {
            DescriptorProto.ReservedRange(start = it.start.orNull(it.hasStart()), end = it.end.orNull(it.hasEnd()))
        },
        reservedName = reservedNameList
    )

    private fun DescriptorProtos.ExtensionRangeOptions.Declaration.convert() = ExtensionRangeOptions.Declaration(
        number = number.orNull(hasNumber()),
        fullName = fullName.orNull(hasFullName()),
        type = type.orNull(hasType()),
        reserved = reserved.orNull(hasReserved()),
        repeated = repeated.orNull(hasRepeated()),
    )

    private fun DescriptorProtos.FeatureSet.convert() = FeatureSet(
        fieldPresence = fieldPresence?.number?.let { FeatureSet.FieldPresence.fromValue(it) },
        enumType = enumType?.number?.let { FeatureSet.EnumType.fromValue(it) },
        repeatedFieldEncoding = repeatedFieldEncoding?.number?.let { FeatureSet.RepeatedFieldEncoding.fromValue(it) },
        utf8Validation = utf8Validation?.number?.let { FeatureSet.Utf8Validation.fromValue(it) },
        messageEncoding = messageEncoding?.number?.let { FeatureSet.MessageEncoding.fromValue(it) },
        jsonFormat = jsonFormat?.number?.let { FeatureSet.JsonFormat.fromValue(it) },
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
                        features = it.features?.convert(),
                        debugRedact = it.debugRedact.orNull(it.hasDebugRedact()),
                        featureSupport = it.featureSupport?.convert(),
                        uninterpretedOption = it.uninterpretedOptionList.map { it.convert() }
                    )
                }
            )
        },
        options = options?.let {
            @Suppress("DEPRECATION")
            EnumOptions(
                allowAlias = it.allowAlias.orNull(it.hasAllowAlias()),
                deprecated = it.deprecated.orNull(it.hasDeprecated()),
                deprecatedLegacyJsonFieldConflicts = it.deprecatedLegacyJsonFieldConflicts.orNull(it.hasDeprecatedLegacyJsonFieldConflicts()),
                features = it.features?.convert(),
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
                        features = it.features?.convert(),
                        uninterpretedOption = it.uninterpretedOptionList.map { it.convert() }
                    )
                },
                clientStreaming = it.clientStreaming.orNull(it.hasClientStreaming()),
                serverStreaming = it.serverStreaming.orNull(it.hasServerStreaming())
            )
        },
        options = options?.let {
            ServiceOptions(
                features = it.features?.convert(),
                deprecated = it.deprecated.orNull(it.hasDeprecated()),
                uninterpretedOption = it.uninterpretedOptionList.map { it.convert() }
            )
        }
    )

    private fun DescriptorProtos.OneofDescriptorProto.convert() = OneofDescriptorProto(
        name = name.orNull(hasName()),
        options = options?.let {
            OneofOptions(
                features = it.features?.convert(),
                uninterpretedOption = it.uninterpretedOptionList.map { it.convert() },
            )
        }
    )

    private fun DescriptorProtos.FieldDescriptorProto.convert() = FieldDescriptorProto(
        name = name.orNull(hasName()),
        number = number.orNull(hasNumber()),
        label = label.number.orNull(hasLabel())?.let { FieldDescriptorProto.Label.fromValue(it) },
        type = type.number.orNull(hasType())?.let { FieldDescriptorProto.Type.fromValue(it) },
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
                unverifiedLazy = it.unverifiedLazy.orNull(it.hasUnverifiedLazy()),
                deprecated = it.deprecated.orNull(it.hasDeprecated()),
                weak = it.weak.orNull(it.hasWeak()),
                debugRedact = it.debugRedact.orNull(it.hasDebugRedact()),
                retention = it.retention?.number?.let { FieldOptions.OptionRetention.fromValue(it) },
                targets = it.targetsList.map { FieldOptions.OptionTargetType.fromValue(it.number) },
                editionDefaults = it.editionDefaultsList.map { it.convert() },
                features = it.features?.convert(),
                featureSupport = it.featureSupport?.convert(),
                uninterpretedOption = it.uninterpretedOptionList.map { it.convert() }
            )
        }
    )

    private fun DescriptorProtos.FieldOptions.EditionDefault.convert() = FieldOptions.EditionDefault(
        edition = edition?.number?.let { Edition.fromValue(it) },
        value = value.orNull(hasValue()),
    )

    private fun DescriptorProtos.FieldOptions.FeatureSupport.convert() = FieldOptions.FeatureSupport(
        editionIntroduced = editionIntroduced.number.orNull(hasEditionIntroduced())?.let { Edition.fromValue(it) },
        editionDeprecated = editionDeprecated.number.orNull(hasEditionDeprecated())?.let { Edition.fromValue(it) },
        deprecationWarning = deprecationWarning.orNull(hasDeprecationWarning()),
        editionRemoved = editionRemoved.number.orNull(hasEditionRemoved())?.let { Edition.fromValue(it) },
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