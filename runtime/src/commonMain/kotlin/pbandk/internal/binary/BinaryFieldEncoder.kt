package pbandk.internal.binary

import pbandk.binary.BinaryFieldValueEncoder
import pbandk.internal.binary.kotlin.WireWriter

internal class BinaryFieldEncoder(wireWriter: WireWriter) {
    private val valueEncoder = BinaryFieldValueEncoder(wireWriter, this)

    inline fun encodeField(tag: Tag, valueBlock: (BinaryFieldValueEncoder) -> Unit) {
        valueEncoder.encodeVarint(WireValue.Varint.encodeUnsignedInt(tag.value))
        valueBlock(valueEncoder)
    }
}