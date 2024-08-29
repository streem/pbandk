package pbandk.internal.binary

import pbandk.binary.BinaryFieldValueEncoder
import pbandk.binary.WireType
import pbandk.binary.WireValue
import pbandk.internal.binary.kotlin.WireWriter

internal class BinaryFieldEncoder(wireWriter: WireWriter) {
    internal val valueEncoder = BinaryFieldValueEncoder(wireWriter, this)

    inline fun encodeField(fieldNumber: Int, wireType: WireType, valueBlock: (BinaryFieldValueEncoder) -> Unit) {
        valueEncoder.encodeVarint(WireValue.Varint.encodeUnsignedInt(Tag(fieldNumber, wireType).value))
        valueBlock(valueEncoder)
        if (wireType == WireType.START_GROUP) {
            valueEncoder.encodeVarint(
                WireValue.Varint.encodeUnsignedInt(Tag(fieldNumber, WireType.END_GROUP).value)
            )
        }
    }
}