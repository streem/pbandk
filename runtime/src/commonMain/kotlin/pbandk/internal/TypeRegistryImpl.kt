package pbandk.internal

import pbandk.MessageDescriptor
import pbandk.TypeRegistry
import pbandk.internal.types.FieldType
import pbandk.internal.types.wkt.WktValueType

internal class TypeRegistryImpl : TypeRegistry.Builder {
    private val registry = mutableMapOf<String, MessageDescriptor<*>>()

    override operator fun contains(typeName: String) = typeName in registry

    override operator fun get(typeName: String) = registry[typeName]

    override fun add(descriptor: MessageDescriptor<*>) {
        if (descriptor.fullName in registry) return

        registry[descriptor.fullName] = descriptor
        for (fieldType in descriptor.fields.map { it.fieldType }) {
            when (fieldType) {
                is FieldType.Map<*, *> -> add(fieldType.entryCompanion.descriptor)
                is FieldType.Repeated<*> -> (fieldType.valueType as? WktValueType<*, *>)?.let {
                    add(it.companion.descriptor)
                }

                is FieldType.Optional<*> -> (fieldType.valueType as? WktValueType<*, *>)?.let {
                    add(it.companion.descriptor)
                }

                is FieldType.Singular<*> -> (fieldType.valueType as? WktValueType<*, *>)?.let {
                    add(it.companion.descriptor)
                }

                is FieldType.Required<*> -> (fieldType.valueType as? WktValueType<*, *>)?.let {
                    add(it.companion.descriptor)
                }
            }
        }
    }
}