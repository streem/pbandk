package pbandk

import pbandk.internal.TypeRegistryImpl

@DslMarker
public annotation class TypeRegistryDsl

/**
 * A `TypeRegistry` is used to resolve `Any` messages in the JSON conversion. You must provide a `TypeRegistry`
 * containing all message types used in `Any` message fields, or the JSON conversion will fail because data in `Any`
 * message fields is unrecognizable. You don't need to supply a `TypeRegistry` if you don't use `Any` message fields.
 */
public interface TypeRegistry {
    public operator fun contains(typeName: String): Boolean

    /**
     * Get a type by its full name. Returns null if it cannot be found in this [TypeRegistry].
     */
    public operator fun get(typeName: String): MessageDescriptor<*>?

    @TypeRegistryDsl
    public interface Builder : TypeRegistry {
        /**
         * Add message [descriptor] to the registry and recursively add the descriptors of all fields referenced by
         * this message descriptor.
         */
        public fun add(descriptor: MessageDescriptor<*>)
    }

    public companion object {
        public val EMPTY: TypeRegistry = TypeRegistryImpl()
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
public fun TypeRegistry.containsTypeUrl(typeUrl: String): Boolean = contains(getTypeNameFromTypeUrl(typeUrl))

/**
 * Returns the type represented by [typeUrl] from this registry, or `null` if not found.
 */
public fun TypeRegistry.getTypeUrl(typeUrl: String): MessageDescriptor<*>? = get(getTypeNameFromTypeUrl(typeUrl))

public operator fun TypeRegistry.contains(descriptor: MessageDescriptor<*>): Boolean =
    get(descriptor.fullName) == descriptor

public operator fun TypeRegistry.contains(messageCompanion: Message.Companion<*>): Boolean =
    contains(messageCompanion.descriptor)

/**
 * Add the descriptor from [messageCompanion] to the registry and recursively add the descriptors of all fields
 * referenced by this message descriptor.
 */
public fun TypeRegistry.Builder.add(messageCompanion: Message.Companion<*>) {
    add(messageCompanion.descriptor)
}

public fun typeRegistry(builderAction: TypeRegistry.Builder.() -> Unit): TypeRegistry {
    val typeRegistry = TypeRegistryImpl()
    typeRegistry.builderAction()
    return typeRegistry
}