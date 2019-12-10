@file:UseSerializers(pbandk.ser.TimestampSerializer::class)

package pbandk.gen.pb

import kotlinx.serialization.*
import kotlinx.serialization.json.*

data class Version(
    val major: Int? = null,
    val minor: Int? = null,
    val patch: Int? = null,
    val suffix: String? = null,
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<Version> {
    override operator fun plus(other: Version?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<Version> {
        val defaultInstance by lazy { Version() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = Version.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = Version.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("major")
        val major: Int? = null,
        @SerialName("minor")
        val minor: Int? = null,
        @SerialName("patch")
        val patch: Int? = null,
        @SerialName("suffix")
        val suffix: String? = null
    ) {
        fun toMessage() = toMessageImpl()
    }
}

data class CodeGeneratorRequest(
    val fileToGenerate: List<String> = emptyList(),
    val parameter: String? = null,
    val protoFile: List<pbandk.wkt.FileDescriptorProto> = emptyList(),
    val compilerVersion: pbandk.gen.pb.Version? = null,
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<CodeGeneratorRequest> {
    override operator fun plus(other: CodeGeneratorRequest?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<CodeGeneratorRequest> {
        val defaultInstance by lazy { CodeGeneratorRequest() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = CodeGeneratorRequest.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = CodeGeneratorRequest.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("file_to_generate")
        val fileToGenerate: List<String> = emptyList(),
        @SerialName("parameter")
        val parameter: String? = null,
        @SerialName("compiler_version")
        val compilerVersion: pbandk.gen.pb.Version.JsonMapper? = null,
        @SerialName("proto_file")
        val protoFile: List<pbandk.wkt.FileDescriptorProto.JsonMapper> = emptyList()
    ) {
        fun toMessage() = toMessageImpl()
    }
}

data class CodeGeneratorResponse(
    val error: String? = null,
    val file: List<pbandk.gen.pb.CodeGeneratorResponse.File> = emptyList(),
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<CodeGeneratorResponse> {
    override operator fun plus(other: CodeGeneratorResponse?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
    fun toJsonMapper() = toJsonMapperImpl()
    companion object : pbandk.Message.Companion<CodeGeneratorResponse> {
        val defaultInstance by lazy { CodeGeneratorResponse() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = CodeGeneratorResponse.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String) = CodeGeneratorResponse.jsonUnmarshalImpl(json, data)
    }

    @Serializable
    data class JsonMapper (
        @SerialName("error")
        val error: String? = null,
        @SerialName("file")
        val file: List<pbandk.gen.pb.CodeGeneratorResponse.File.JsonMapper> = emptyList()
    ) {
        fun toMessage() = toMessageImpl()
    }

    data class File(
        val name: String? = null,
        val insertionPoint: String? = null,
        val content: String? = null,
        val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message<File> {
        override operator fun plus(other: File?) = protoMergeImpl(other)
        override val protoSize by lazy { protoSizeImpl() }
        override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
        override fun jsonMarshal(json: Json) = jsonMarshalImpl(json)
        fun toJsonMapper() = toJsonMapperImpl()
        companion object : pbandk.Message.Companion<File> {
            val defaultInstance by lazy { File() }
            override fun protoUnmarshal(u: pbandk.Unmarshaller) = File.protoUnmarshalImpl(u)
            override fun jsonUnmarshal(json: Json, data: String) = File.jsonUnmarshalImpl(json, data)
        }

        @Serializable
        data class JsonMapper (
            @SerialName("name")
            val name: String? = null,
            @SerialName("insertion_point")
            val insertionPoint: String? = null,
            @SerialName("content")
            val content: String? = null
        ) {
            fun toMessage() = toMessageImpl()
        }
    }
}

fun Version?.orDefault() = this ?: Version.defaultInstance

private fun Version.protoMergeImpl(plus: Version?): Version = plus?.copy(
    major = plus.major ?: major,
    minor = plus.minor ?: minor,
    patch = plus.patch ?: patch,
    suffix = plus.suffix ?: suffix,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun Version.protoSizeImpl(): Int {
    var protoSize = 0
    if (major != null) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.int32Size(major)
    if (minor != null) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.int32Size(minor)
    if (patch != null) protoSize += pbandk.Sizer.tagSize(3) + pbandk.Sizer.int32Size(patch)
    if (suffix != null) protoSize += pbandk.Sizer.tagSize(4) + pbandk.Sizer.stringSize(suffix)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun Version.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (major != null) protoMarshal.writeTag(8).writeInt32(major)
    if (minor != null) protoMarshal.writeTag(16).writeInt32(minor)
    if (patch != null) protoMarshal.writeTag(24).writeInt32(patch)
    if (suffix != null) protoMarshal.writeTag(34).writeString(suffix)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun Version.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): Version {
    var major: Int? = null
    var minor: Int? = null
    var patch: Int? = null
    var suffix: String? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return Version(major, minor, patch, suffix, protoUnmarshal.unknownFields())
        8 -> major = protoUnmarshal.readInt32()
        16 -> minor = protoUnmarshal.readInt32()
        24 -> patch = protoUnmarshal.readInt32()
        34 -> suffix = protoUnmarshal.readString()
        else -> protoUnmarshal.unknownField()
    }
}

private fun Version.toJsonMapperImpl(): Version.JsonMapper =
    Version.JsonMapper(
        major,
        minor,
        patch,
        suffix
    )

private fun Version.JsonMapper.toMessageImpl(): Version =
    Version(
        major = major ?: null,
        minor = minor ?: null,
        patch = patch ?: null,
        suffix = suffix ?: null
    )

private fun Version.jsonMarshalImpl(json: Json): String =
    json.stringify(Version.JsonMapper.serializer(), toJsonMapper())

private fun Version.Companion.jsonUnmarshalImpl(json: Json, data: String): Version {
    val mapper = json.parse(Version.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun CodeGeneratorRequest?.orDefault() = this ?: CodeGeneratorRequest.defaultInstance

private fun CodeGeneratorRequest.protoMergeImpl(plus: CodeGeneratorRequest?): CodeGeneratorRequest = plus?.copy(
    fileToGenerate = fileToGenerate + plus.fileToGenerate,
    parameter = plus.parameter ?: parameter,
    protoFile = protoFile + plus.protoFile,
    compilerVersion = compilerVersion?.plus(plus.compilerVersion) ?: plus.compilerVersion,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun CodeGeneratorRequest.protoSizeImpl(): Int {
    var protoSize = 0
    if (fileToGenerate.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(1) * fileToGenerate.size) + fileToGenerate.sumBy(pbandk.Sizer::stringSize)
    if (parameter != null) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.stringSize(parameter)
    if (protoFile.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(15) * protoFile.size) + protoFile.sumBy(pbandk.Sizer::messageSize)
    if (compilerVersion != null) protoSize += pbandk.Sizer.tagSize(3) + pbandk.Sizer.messageSize(compilerVersion)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun CodeGeneratorRequest.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (fileToGenerate.isNotEmpty()) fileToGenerate.forEach { protoMarshal.writeTag(10).writeString(it) }
    if (parameter != null) protoMarshal.writeTag(18).writeString(parameter)
    if (compilerVersion != null) protoMarshal.writeTag(26).writeMessage(compilerVersion)
    if (protoFile.isNotEmpty()) protoFile.forEach { protoMarshal.writeTag(122).writeMessage(it) }
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun CodeGeneratorRequest.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): CodeGeneratorRequest {
    var fileToGenerate: pbandk.ListWithSize.Builder<String>? = null
    var parameter: String? = null
    var protoFile: pbandk.ListWithSize.Builder<pbandk.wkt.FileDescriptorProto>? = null
    var compilerVersion: pbandk.gen.pb.Version? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return CodeGeneratorRequest(pbandk.ListWithSize.Builder.fixed(fileToGenerate), parameter, pbandk.ListWithSize.Builder.fixed(protoFile), compilerVersion, protoUnmarshal.unknownFields())
        10 -> fileToGenerate = protoUnmarshal.readRepeated(fileToGenerate, protoUnmarshal::readString, true)
        18 -> parameter = protoUnmarshal.readString()
        26 -> compilerVersion = protoUnmarshal.readMessage(pbandk.gen.pb.Version.Companion)
        122 -> protoFile = protoUnmarshal.readRepeatedMessage(protoFile, pbandk.wkt.FileDescriptorProto.Companion, true)
        else -> protoUnmarshal.unknownField()
    }
}

private fun CodeGeneratorRequest.toJsonMapperImpl(): CodeGeneratorRequest.JsonMapper =
    CodeGeneratorRequest.JsonMapper(
        fileToGenerate,
        parameter,
        compilerVersion?.toJsonMapper(),
        protoFile.map { it.toJsonMapper() }
    )

private fun CodeGeneratorRequest.JsonMapper.toMessageImpl(): CodeGeneratorRequest =
    CodeGeneratorRequest(
        fileToGenerate = fileToGenerate ?: emptyList(),
        parameter = parameter ?: null,
        protoFile = protoFile.map { it.toMessage() },
        compilerVersion = compilerVersion?.toMessage()
    )

private fun CodeGeneratorRequest.jsonMarshalImpl(json: Json): String =
    json.stringify(CodeGeneratorRequest.JsonMapper.serializer(), toJsonMapper())

private fun CodeGeneratorRequest.Companion.jsonUnmarshalImpl(json: Json, data: String): CodeGeneratorRequest {
    val mapper = json.parse(CodeGeneratorRequest.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun CodeGeneratorResponse?.orDefault() = this ?: CodeGeneratorResponse.defaultInstance

private fun CodeGeneratorResponse.protoMergeImpl(plus: CodeGeneratorResponse?): CodeGeneratorResponse = plus?.copy(
    error = plus.error ?: error,
    file = file + plus.file,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun CodeGeneratorResponse.protoSizeImpl(): Int {
    var protoSize = 0
    if (error != null) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(error)
    if (file.isNotEmpty()) protoSize += (pbandk.Sizer.tagSize(15) * file.size) + file.sumBy(pbandk.Sizer::messageSize)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun CodeGeneratorResponse.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (error != null) protoMarshal.writeTag(10).writeString(error)
    if (file.isNotEmpty()) file.forEach { protoMarshal.writeTag(122).writeMessage(it) }
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun CodeGeneratorResponse.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): CodeGeneratorResponse {
    var error: String? = null
    var file: pbandk.ListWithSize.Builder<pbandk.gen.pb.CodeGeneratorResponse.File>? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return CodeGeneratorResponse(error, pbandk.ListWithSize.Builder.fixed(file), protoUnmarshal.unknownFields())
        10 -> error = protoUnmarshal.readString()
        122 -> file = protoUnmarshal.readRepeatedMessage(file, pbandk.gen.pb.CodeGeneratorResponse.File.Companion, true)
        else -> protoUnmarshal.unknownField()
    }
}

private fun CodeGeneratorResponse.toJsonMapperImpl(): CodeGeneratorResponse.JsonMapper =
    CodeGeneratorResponse.JsonMapper(
        error,
        file.map { it.toJsonMapper() }
    )

private fun CodeGeneratorResponse.JsonMapper.toMessageImpl(): CodeGeneratorResponse =
    CodeGeneratorResponse(
        error = error ?: null,
        file = file.map { it.toMessage() }
    )

private fun CodeGeneratorResponse.jsonMarshalImpl(json: Json): String =
    json.stringify(CodeGeneratorResponse.JsonMapper.serializer(), toJsonMapper())

private fun CodeGeneratorResponse.Companion.jsonUnmarshalImpl(json: Json, data: String): CodeGeneratorResponse {
    val mapper = json.parse(CodeGeneratorResponse.JsonMapper.serializer(), data)
    return mapper.toMessage()
}

fun CodeGeneratorResponse.File?.orDefault() = this ?: CodeGeneratorResponse.File.defaultInstance

private fun CodeGeneratorResponse.File.protoMergeImpl(plus: CodeGeneratorResponse.File?): CodeGeneratorResponse.File = plus?.copy(
    name = plus.name ?: name,
    insertionPoint = plus.insertionPoint ?: insertionPoint,
    content = plus.content ?: content,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun CodeGeneratorResponse.File.protoSizeImpl(): Int {
    var protoSize = 0
    if (name != null) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(name)
    if (insertionPoint != null) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.stringSize(insertionPoint)
    if (content != null) protoSize += pbandk.Sizer.tagSize(15) + pbandk.Sizer.stringSize(content)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun CodeGeneratorResponse.File.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (name != null) protoMarshal.writeTag(10).writeString(name)
    if (insertionPoint != null) protoMarshal.writeTag(18).writeString(insertionPoint)
    if (content != null) protoMarshal.writeTag(122).writeString(content)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun CodeGeneratorResponse.File.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): CodeGeneratorResponse.File {
    var name: String? = null
    var insertionPoint: String? = null
    var content: String? = null
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return CodeGeneratorResponse.File(name, insertionPoint, content, protoUnmarshal.unknownFields())
        10 -> name = protoUnmarshal.readString()
        18 -> insertionPoint = protoUnmarshal.readString()
        122 -> content = protoUnmarshal.readString()
        else -> protoUnmarshal.unknownField()
    }
}

private fun CodeGeneratorResponse.File.toJsonMapperImpl(): CodeGeneratorResponse.File.JsonMapper =
    CodeGeneratorResponse.File.JsonMapper(
        name,
        insertionPoint,
        content
    )

private fun CodeGeneratorResponse.File.JsonMapper.toMessageImpl(): CodeGeneratorResponse.File =
    CodeGeneratorResponse.File(
        name = name ?: null,
        insertionPoint = insertionPoint ?: null,
        content = content ?: null
    )

private fun CodeGeneratorResponse.File.jsonMarshalImpl(json: Json): String =
    json.stringify(CodeGeneratorResponse.File.JsonMapper.serializer(), toJsonMapper())

private fun CodeGeneratorResponse.File.Companion.jsonUnmarshalImpl(json: Json, data: String): CodeGeneratorResponse.File {
    val mapper = json.parse(CodeGeneratorResponse.File.JsonMapper.serializer(), data)
    return mapper.toMessage()
}
