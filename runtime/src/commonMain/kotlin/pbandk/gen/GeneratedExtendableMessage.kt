package pbandk.gen

import pbandk.ExtendableMessage
import pbandk.ExtensionFieldSet
import pbandk.FieldDescriptor
import pbandk.Message
import pbandk.MutableExtendableMessage
import pbandk.PublicForGeneratedCode
import pbandk.decodeAs

@PublicForGeneratedCode
public abstract class GeneratedExtendableMessage<T : Message> : GeneratedMessage<T>(), ExtendableMessage<T> {
    internal val extensionFields: ExtensionFieldSet = ExtensionFieldSet()

    @Suppress("UNCHECKED_CAST")
    public override fun <V> getExtension(fd: FieldDescriptor<T, V>): V {
        var value = extensionFields[fd.number] as? V
        if (value != null) {
            // If we've already decoded the value of the extension field, then return the cached value
            return value
        } else {
            // Try to find the extension field in the unknown fields and decode it
            value = unknownFields[fd.number]?.decodeAs(fd)
        }

        return if (value != null) {
            // We found the field and were able to decode it. Cache a copy of the decoded value and return it.
            extensionFields[fd.number] = value
            value
        } else if (!fd.type.hasPresence) {
            // A value for this extension field was not provided. If the field type has a non-null default value
            // then return it.
            fd.type.defaultValue as V
        } else {
            // A value was not provided and the default value for this field type is null, so just return null.
            null as V
        }
    }
}

@PublicForGeneratedCode
public abstract class MutableGeneratedExtendableMessage<T : Message> : GeneratedExtendableMessage<T>(),
    MutableExtendableMessage<T> {
    override fun <V> setExtension(fd: FieldDescriptor<T, V>, newValue: V) {
        TODO("Not yet implemented")
    }
}