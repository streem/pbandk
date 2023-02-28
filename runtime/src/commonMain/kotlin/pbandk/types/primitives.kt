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
import kotlin.js.JsExport

// These functions provide a level of indirection for generated code, so we can change the underlying implementation
// used for the primitive value types without breaking backward compatibility.

@PublicForGeneratedCode
@JsExport
public fun bool(): ValueType<Boolean> = Bool

@PublicForGeneratedCode
@JsExport
public fun bytes(): ValueType<ByteArr> = Bytes

@PublicForGeneratedCode
@JsExport
public fun double(): ValueType<Double> = pbandk.internal.types.primitive.Double

@PublicForGeneratedCode
@JsExport
public fun fixed32(): ValueType<Int> = Fixed32

@PublicForGeneratedCode
@JsExport
public fun fixed64(): ValueType<Long> = Fixed64

@PublicForGeneratedCode
@JsExport
public fun float(): ValueType<Float> = pbandk.internal.types.primitive.Float

@PublicForGeneratedCode
@JsExport
public fun int32(): ValueType<Int> = Int32

@PublicForGeneratedCode
@JsExport
public fun int64(): ValueType<Long> = Int64

@PublicForGeneratedCode
@JsExport
public fun sfixed32(): ValueType<Int> = SFixed32

@PublicForGeneratedCode
@JsExport
public fun sfixed64(): ValueType<Long> = SFixed64

@PublicForGeneratedCode
@JsExport
public fun sint32(): ValueType<Int> = SInt32

@PublicForGeneratedCode
@JsExport
public fun sint64(): ValueType<Long> = SInt64

@PublicForGeneratedCode
@JsExport
public fun string(): ValueType<String> = pbandk.internal.types.primitive.String

@PublicForGeneratedCode
@JsExport
public fun uint32(): ValueType<Int> = UInt32

@PublicForGeneratedCode
@JsExport
public fun uint64(): ValueType<Long> = UInt64

@PublicForGeneratedCode
@JsExport
public fun <E : Message.Enum> enum(enumCompanion: Message.Enum.Companion<E>): ValueType<E> =
    enumCompanion.descriptor.enumValueType

@PublicForGeneratedCode
@JsExport
public fun <M : Message> message(
    messageCompanion: Message.Companion<M>,
    // TODO: add docs
    recursive: Boolean = false,
): ValueType<M> = if (recursive) {
    MessageValueType(messageCompanion)
} else {
    messageCompanion.messageValueType
}