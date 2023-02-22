package pbandk.types

import pbandk.ByteArr
import pbandk.Message
import pbandk.PublicForGeneratedCode
import pbandk.internal.types.MessageValueType
import pbandk.internal.types.primitive.Bool
import pbandk.internal.types.primitive.Bytes
import pbandk.internal.types.primitive.Fixed32
import pbandk.internal.types.primitive.Fixed64
import pbandk.internal.types.primitive.Int32
import pbandk.internal.types.primitive.Int64
import pbandk.internal.types.primitive.SFixed32
import pbandk.internal.types.primitive.SFixed64
import pbandk.internal.types.primitive.SInt32
import pbandk.internal.types.primitive.SInt64
import pbandk.internal.types.primitive.UInt32
import pbandk.internal.types.primitive.UInt64

// These functions provide a level of indirection for generated code, so we can change the underlying implementation
// used for the primitive value types without breaking backward compatibility.

@PublicForGeneratedCode
public fun bool(): ValueType<Boolean> = Bool

@PublicForGeneratedCode
public fun bytes(): ValueType<ByteArr> = Bytes

@PublicForGeneratedCode
public fun double(): ValueType<Double> = pbandk.internal.types.primitive.Double

@PublicForGeneratedCode
public fun fixed32(): ValueType<Int> = Fixed32

@PublicForGeneratedCode
public fun fixed64(): ValueType<Long> = Fixed64

@PublicForGeneratedCode
public fun float(): ValueType<Float> = pbandk.internal.types.primitive.Float

@PublicForGeneratedCode
public fun int32(): ValueType<Int> = Int32

@PublicForGeneratedCode
public fun int64(): ValueType<Long> = Int64

@PublicForGeneratedCode
public fun sfixed32(): ValueType<Int> = SFixed32

@PublicForGeneratedCode
public fun sfixed64(): ValueType<Long> = SFixed64

@PublicForGeneratedCode
public fun sint32(): ValueType<Int> = SInt32

@PublicForGeneratedCode
public fun sint64(): ValueType<Long> = SInt64

@PublicForGeneratedCode
public fun string(): ValueType<String> = pbandk.internal.types.primitive.String

@PublicForGeneratedCode
public fun uint32(): ValueType<Int> = UInt32

@PublicForGeneratedCode
public fun uint64(): ValueType<Long> = UInt64

@PublicForGeneratedCode
public fun <E : Message.Enum> enum(enumCompanion: Message.Enum.Companion<E>): ValueType<E> =
    enumCompanion.descriptor.enumValueType

@PublicForGeneratedCode
public fun <M : Message> message(
    messageCompanion: Message.Companion<M>,
    // TODO: add docs
    recursive: Boolean = false,
): ValueType<M> = if (recursive) {
    MessageValueType(messageCompanion)
} else {
    messageCompanion.messageValueType
}