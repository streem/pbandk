package pbandk

import pbandk.internal.TypeRegistryImpl

@DslMarker
annotation class TypeRegistryDsl

/**
 * A `TypeRegistry` is used to resolve `Any` messages in the JSON conversion. You must provide a `TypeRegistry`
 * containing all message types used in `Any` message fields, or the JSON conversion will fail because data in `Any`
 * message fields is unrecognizable. You don't need to supply a `TypeRegistry` if you don't use `Any` message fields.
 */
interface TypeRegistry {
    operator fun contains(typeName: String): Boolean

    /**
     * Get a type by its full name. Returns null if it cannot be found in this [TypeRegistry].
     */
    operator fun get(typeName: String): MessageDescriptor<*>?

    @TypeRegistryDsl
    interface Builder : TypeRegistry {
        /**
         * Add message [descriptor] to the registry and recursively add the descriptors of all fields referenced by
         * this message descriptor.
         */
        fun add(descriptor: MessageDescriptor<*>)
    }

    companion object {
        val EMPTY: TypeRegistry = TypeRegistryImpl()
    }
}

/**
 * Returns the type name after the last '/' character in [typeUrl].
 */
internal fun getTypeNameFromTypeUrl(typeUrl: String): String {
    return typeUrl.substringAfterLast('/', "")
}

/**
 * Returns the type prefix before the last '/' character in [typeUrl].
 */
internal fun getTypePrefixFromTypeUrl(typeUrl: String): String {
    return typeUrl.substringBeforeLast('/')
}

/**
 * Checks if the type represented by [typeUrl] is contained in this registry.
 */
fun TypeRegistry.containsTypeUrl(typeUrl: String): Boolean = contains(getTypeNameFromTypeUrl(typeUrl))

/**
 * Returns the type represented by [typeUrl] from this registry, or `null` if not found.
 */
fun TypeRegistry.getTypeUrl(typeUrl: String): MessageDescriptor<*>? = get(getTypeNameFromTypeUrl(typeUrl))

operator fun TypeRegistry.contains(descriptor: MessageDescriptor<*>) = get(descriptor.fullName) == descriptor

operator fun TypeRegistry.contains(messageCompanion: Message.Companion<*>) = contains(messageCompanion.descriptor)

/**
 * Add the descriptor from [messageCompanion] to the registry and recursively add the descriptors of all fields
 * referenced by this message descriptor.
 */
fun TypeRegistry.Builder.add(messageCompanion: Message.Companion<*>) {
    add(messageCompanion.descriptor)
}

fun typeRegistry(builderAction: TypeRegistry.Builder.() -> Unit): TypeRegistry {
    val typeRegistry = TypeRegistryImpl()
    typeRegistry.builderAction()
    return typeRegistry
}