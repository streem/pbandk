package pbandk.internal.binary

import pbandk.internal.binary.kotlin.WireWriter

internal class BinaryFieldEncoder(private val wireWriter: WireWriter) {
    private val valueEncoder = BinaryFieldValueEncoder(wireWriter, this)

    inline fun encodeField(tag: Tag, valueBlock: (BinaryFieldValueEncoder) -> Unit) {
        valueEncoder.encodeVarintUnsignedInt(tag.value)
        valueBlock(valueEncoder)
    }

    fun encodeUnknownField(tag: Tag, bytes: ByteArray) {
        if (tag.wireType == WireType.START_GROUP || tag.wireType == WireType.END_GROUP) {
            throw UnsupportedOperationException()
        }
        valueEncoder.encodeVarintUnsignedInt(tag.value)
        wireWriter.write(bytes, 0, bytes.size)
    }
}