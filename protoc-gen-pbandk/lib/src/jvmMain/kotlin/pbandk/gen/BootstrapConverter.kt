package pbandk.gen

import com.google.protobuf.DescriptorProtos
import com.google.protobuf.compiler.PluginProtos
import pbandk.ByteArr
import pbandk.gen.pb.CodeGeneratorRequest
import pbandk.gen.pb.CodeGeneratorResponse
import pbandk.gen.pb.Version
import pbandk.wkt.DescriptorProto
import pbandk.wkt.EnumDescriptorProto
import pbandk.wkt.EnumOptions
import pbandk.wkt.EnumReservedRange
import pbandk.wkt.EnumValueDescriptorProto
import pbandk.wkt.EnumValueOptions
import pbandk.wkt.ExtensionRange
import pbandk.wkt.ExtensionRangeOptions
import pbandk.wkt.FieldDescriptorProto
import pbandk.wkt.FieldOptions
import pbandk.wkt.FileDescriptorProto
import pbandk.wkt.FileOptions
import pbandk.wkt.Location
import pbandk.wkt.MessageOptions
import pbandk.wkt.MethodDescriptorProto
import pbandk.wkt.MethodOptions
import pbandk.wkt.NamePart
import pbandk.wkt.OneofDescriptorProto
import pbandk.wkt.OneofOptions
import pbandk.wkt.ReservedRange
import pbandk.wkt.ServiceDescriptorProto
import pbandk.wkt.ServiceOptions
import pbandk.wkt.SourceCodeInfo
import pbandk.wkt.UninterpretedOption

// Simple conversion between JVM protos and Kotlin ones for bootstrapping
internal object BootstrapConverter {
    fun fromReq(req: PluginProtos.CodeGeneratorRequest) = req.convert()
    fun toResp(resp: CodeGeneratorResponse) = resp.convert()

    private fun PluginProtos.CodeGeneratorRequest.convert() = CodeGeneratorRequest {
        fileToGenerate += this@convert.fileToGenerateList
        parameter = this@convert.parameter.orNull(hasParameter())
        protoFile += this@convert.protoFileList.map { it.convert() }
        compilerVersion = this@convert.compilerVersion?.let {
            Version {
                major = it.major.orNull(it.hasMajor())
                minor = it.minor.orNull(it.hasMinor())
                patch = it.patch.orNull(it.hasPatch())
                suffix = it.suffix.orNull(it.hasSuffix())
            }
        }
    }

    private fun DescriptorProtos.FileDescriptorProto.convert() = FileDescriptorProto {
        name = this@convert.name.orNull(hasName())
        `package` = this@convert.`package`.orNull(hasPackage())
        dependency += this@convert.dependencyList
        publicDependency += this@convert.publicDependencyList
        weakDependency += this@convert.weakDependencyList
        messageType += this@convert.messageTypeList.map { it.convert() }
        enumType += this@convert.enumTypeList.map { it.convert() }
        service += this@convert.serviceList.map { it.convert() }
        extension += this@convert.extensionList.map { it.convert() }
        options = this@convert.options?.let {
            FileOptions {
                javaPackage = it.javaPackage.orNull(it.hasJavaPackage())
                javaOuterClassname = it.javaOuterClassname.orNull(it.hasJavaOuterClassname())
                javaMultipleFiles = it.javaMultipleFiles.orNull(it.hasJavaMultipleFiles())
                javaStringCheckUtf8 = it.javaStringCheckUtf8.orNull(it.hasJavaStringCheckUtf8())
                optimizeFor = it.optimizeFor?.number?.let { FileOptions.OptimizeMode.fromValue(it) }
                goPackage = it.goPackage.orNull(it.hasGoPackage())
                ccGenericServices = it.ccGenericServices.orNull(it.hasCcGenericServices())
                javaGenericServices = it.javaGenericServices.orNull(it.hasJavaGenericServices())
                pyGenericServices = it.pyGenericServices.orNull(it.hasPyGenericServices())
                deprecated = it.deprecated.orNull(it.hasDeprecated())
                ccEnableArenas = it.ccEnableArenas.orNull(it.hasCcEnableArenas())
                objcClassPrefix = it.objcClassPrefix.orNull(it.hasObjcClassPrefix())
                csharpNamespace = it.csharpNamespace.orNull(it.hasCsharpNamespace())
                swiftPrefix = it.swiftPrefix.orNull(it.hasSwiftPrefix())
                phpClassPrefix = it.phpClassPrefix.orNull(it.hasPhpClassPrefix())
                phpNamespace = it.phpNamespace.orNull(it.hasPhpNamespace())
                uninterpretedOption += it.uninterpretedOptionList.map { it.convert() }
            }
        }
        sourceCodeInfo = this@convert.sourceCodeInfo?.let {
            SourceCodeInfo {
                location += it.locationList.map {
                    SourceCodeInfo.Location {
                        path += it.pathList
                        span += it.spanList
                        leadingComments = it.leadingComments.orNull(it.hasLeadingComments())
                        trailingComments = it.trailingComments.orNull(it.hasTrailingComments())
                        leadingDetachedComments += it.leadingDetachedCommentsList
                    }
                }
            }
        }
        syntax = this@convert.syntax.orNull(hasSyntax())
    }

    private fun DescriptorProtos.UninterpretedOption.convert() = UninterpretedOption {
        name += this@convert.nameList.map {
            UninterpretedOption.NamePart {
                namePart = it.namePart
                isExtension = false
            }
        }
        stringValue = this@convert.stringValue?.let { ByteArr(it.toByteArray()) }
    }

    private fun DescriptorProtos.DescriptorProto.convert(): DescriptorProto = DescriptorProto {
        name = this@convert.name.orNull(hasName())
        field += this@convert.fieldList.map { it.convert() }
        extension += this@convert.fieldList.map { it.convert() }
        nestedType += this@convert.nestedTypeList.map { it.convert() }
        enumType += this@convert.enumTypeList.map { it.convert() }
        extensionRange += this@convert.extensionRangeList.map {
            DescriptorProto.ExtensionRange {
                start = it.start.orNull(it.hasStart())
                end = it.end.orNull(it.hasEnd())
                options = it.options?.let {
                    ExtensionRangeOptions { uninterpretedOption += it.uninterpretedOptionList.map { it.convert() } }
                }
            }
        }
        oneofDecl += this@convert.oneofDeclList.map { it.convert() }
        options = this@convert.options?.let {
            MessageOptions {
                messageSetWireFormat = it.messageSetWireFormat.orNull(it.hasMessageSetWireFormat())
                noStandardDescriptorAccessor =
                    it.noStandardDescriptorAccessor.orNull(it.hasNoStandardDescriptorAccessor())
                deprecated = it.deprecated.orNull(it.hasDeprecated())
                mapEntry = it.mapEntry.orNull(it.hasMapEntry())
                uninterpretedOption += it.uninterpretedOptionList.map { it.convert() }
            }
        }
        reservedRange += this@convert.reservedRangeList.map {
            DescriptorProto.ReservedRange {
                start = it.start.orNull(it.hasStart())
                end = it.end.orNull(it.hasEnd())
            }
        }
        reservedName += reservedNameList
    }

    private fun DescriptorProtos.EnumDescriptorProto.convert() = EnumDescriptorProto {
        name = this@convert.name.orNull(hasName())
        value += this@convert.valueList.map {
            EnumValueDescriptorProto {
                name = it.name.orNull(it.hasName())
                number = it.number.orNull(it.hasNumber())
                options = it.options?.let {
                    EnumValueOptions {
                        deprecated = it.deprecated.orNull(it.hasDeprecated())
                        uninterpretedOption += it.uninterpretedOptionList.map { it.convert() }
                    }
                }
            }
        }
        options = this@convert.options?.let {
            EnumOptions {
                allowAlias = it.allowAlias.orNull(it.hasAllowAlias())
                deprecated = it.deprecated.orNull(it.hasDeprecated())
                uninterpretedOption += it.uninterpretedOptionList.map { it.convert() }
            }
        }
        reservedRange += this@convert.reservedRangeList.map {
            EnumDescriptorProto.EnumReservedRange {
                start = it.start.orNull(it.hasStart())
                end = it.end.orNull(it.hasEnd())
            }
        }
        reservedName += this@convert.reservedNameList
    }

    private fun DescriptorProtos.ServiceDescriptorProto.convert() = ServiceDescriptorProto {
        name = this@convert.name.orNull(hasName())
        method += this@convert.methodList.map {
            MethodDescriptorProto {
                name = it.name.orNull(it.hasName())
                inputType = it.inputType.orNull(it.hasInputType())
                outputType = it.outputType.orNull(it.hasOutputType())
                options = it.options?.let {
                    MethodOptions {
                        deprecated = it.deprecated.orNull(it.hasDeprecated())
                        idempotencyLevel =
                            it.idempotencyLevel?.number?.let { MethodOptions.IdempotencyLevel.fromValue(it) }
                        uninterpretedOption += it.uninterpretedOptionList.map { it.convert() }
                    }
                }
                clientStreaming = it.clientStreaming.orNull(it.hasClientStreaming())
                serverStreaming = it.serverStreaming.orNull(it.hasServerStreaming())
            }
        }
        options = this@convert.options?.let {
            ServiceOptions {
                deprecated = it.deprecated.orNull(it.hasDeprecated())
                uninterpretedOption += it.uninterpretedOptionList.map { it.convert() }
            }
        }
    }

    private fun DescriptorProtos.OneofDescriptorProto.convert() = OneofDescriptorProto {
        name = this@convert.name.orNull(hasName())
        options = this@convert.options?.let {
            OneofOptions {
                uninterpretedOption += it.uninterpretedOptionList.map { it.convert() }
            }
        }
    }

    private fun DescriptorProtos.FieldDescriptorProto.convert() = FieldDescriptorProto {
        name = this@convert.name.orNull(hasName())
        number = this@convert.number.orNull(hasNumber())
        label = this@convert.label?.number?.let { FieldDescriptorProto.Label.fromValue(it) }
        type = this@convert.type?.number?.let { FieldDescriptorProto.Type.fromValue(it) }
        typeName = this@convert.typeName.orNull(hasTypeName())
        extendee = this@convert.extendee.orNull(hasExtendee())
        defaultValue = this@convert.defaultValue.orNull(hasDefaultValue())
        oneofIndex = this@convert.oneofIndex.orNull(hasOneofIndex())
        jsonName = this@convert.jsonName.orNull(hasJsonName())
        options = this@convert.options?.let {
            FieldOptions {
                ctype = it.ctype?.number?.let { FieldOptions.CType.fromValue(it) }
                packed = it.packed.orNull(it.hasPacked())
                jstype = it.jstype?.number?.let { FieldOptions.JSType.fromValue(it) }
                lazy = it.lazy.orNull(it.hasLazy())
                deprecated = it.deprecated.orNull(it.hasDeprecated())
                weak = it.weak.orNull(it.hasWeak())
                uninterpretedOption += it.uninterpretedOptionList.map { it.convert() }
            }
        }
    }

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