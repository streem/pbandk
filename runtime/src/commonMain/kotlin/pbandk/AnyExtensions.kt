package pbandk

import pbandk.wkt.Any
import pbandk.wkt.any

private const val DEFAULT_TYPE_URL_PREFIX = "type.googleapis.com"

/**
 * Constructs a new [Any] instance by packing [message] using the given [typeUrlPrefix] (or a default prefix if one is
 * not provided). The type URL will be constructed by concatenating the message type's full name to the prefix with an
 * optional "/" separator if the prefix doesn't end with "/" already.
 */
public fun <T : Message> Any.Companion.pack(message: T, typeUrlPrefix: String = DEFAULT_TYPE_URL_PREFIX): Any = any {
    typeUrl = "$typeUrlPrefix${if (typeUrlPrefix.endsWith('/')) "" else "/"}${message.descriptor.fullName}"
    value = ByteArr(message.encodeToByteArray())
}

/**
 * Returns `true` if [Any.typeUrl] matches the fully-qualified type name of [companion].
 */
public fun <T : Message> Any.isA(companion: Message.Companion<T>): Boolean {
    return companion.descriptor.fullName == getTypeNameFromTypeUrl(typeUrl)
}

/**
 * Unpacks the data in [Any.value] using [companion]. Throws [InvalidProtocolBufferException] if [Any.typeUrl] does not
 * match the fully-qualified type name of [companion], or if [Any.value] does not contain a valid message.
 */
public fun <T : Message> Any.unpack(companion: Message.Companion<T>): T {
    if (!isA(companion)) {
        throw InvalidProtocolBufferException("Type of the Any message does not match the given class.")
    }
    // TODO: cache the decoded value
    return companion.decodeFromByteArray(value.array)
}