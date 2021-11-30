package pbandk.internal

import pbandk.FieldDescriptor
import pbandk.MessageDescriptor
import pbandk.TypeRegistry

internal class TypeRegistryImpl : TypeRegistry.Builder {
    private val registry = mutableMapOf<String, MessageDescriptor<*>>()

    override operator fun contains(typeName: String) = typeName in registry

    override operator fun get(typeName: String) = registry[typeName]

    override fun add(descriptor: MessageDescriptor<*>) {
        if (descriptor.fullName in registry) return

        registry[descriptor.fullName] = descriptor
        for (fieldType in descriptor.fields.map { it.type }) {
            when (fieldType) {
                is FieldDescriptor.Type.Message<*> -> add(fieldType.messageCompanion.descriptor)
                is FieldDescriptor.Type.Repeated<*> -> {
                    if (fieldType.valueType is FieldDescriptor.Type.Message<*>) {
                        add(fieldType.valueType.messageCompanion.descriptor)
                    }
                }
                is FieldDescriptor.Type.Map<*, *> -> add(fieldType.entryCompanion.descriptor)
                else -> {}
            }
        }
    }
}