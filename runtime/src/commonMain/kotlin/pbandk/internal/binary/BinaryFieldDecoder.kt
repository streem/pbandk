package pbandk.internal.binary

import pbandk.InvalidProtocolBufferException
import pbandk.binary.BinaryFieldValueDecoder
import pbandk.binary.WireType
import pbandk.internal.binary.kotlin.LimitingWireReader
import pbandk.internal.binary.kotlin.WireReader

internal class BinaryFieldDecoder(wireReader: WireReader) {
    private val wireReader = LimitingWireReader(wireReader)

    internal val varintValueDecoder: BinaryFieldValueDecoder.Varint =
        BinaryFieldValueDecoder.VarintFromReader(this.wireReader)
    internal val i32ValueDecoder: BinaryFieldValueDecoder.I32 = BinaryFieldValueDecoder.I32FromReader(this.wireReader)
    internal val i64ValueDecoder: BinaryFieldValueDecoder.I64 = BinaryFieldValueDecoder.I64FromReader(this.wireReader)
    internal val lenValueDecoder: BinaryFieldValueDecoder.Len = BinaryFieldValueDecoder.Len(this.wireReader, this)

    private var lastTag: Tag = Tag.Zero

    internal fun valueDecoder(wireType: WireType): BinaryFieldValueDecoder {
        return when (wireType) {
            WireType.VARINT -> varintValueDecoder
            WireType.FIXED32 -> i32ValueDecoder
            WireType.FIXED64 -> i64ValueDecoder
            WireType.LENGTH_DELIMITED -> lenValueDecoder
            WireType.START_GROUP -> throw IllegalStateException("Group tags should have been processed outside of this function")
            WireType.END_GROUP -> BinaryFieldValueDecoder.EndGroup
            else -> throw InvalidProtocolBufferException.invalidWireType()
        }
    }

    inline fun forEachField(action: (Int, BinaryFieldValueDecoder) -> Unit) {
        while (true) {
            if (wireReader.isAtEnd()) {
                lastTag = Tag.Zero
                return
            }

            lastTag = Tag(varintValueDecoder.decodeValue().decodeUnsignedInt)
            if (lastTag.fieldNumber == 0) {
                // If we actually read zero (or any tag number corresponding to field
                // number zero), that's not a valid tag.
                throw InvalidProtocolBufferException.invalidTag()
            }

            val valueDecoder = when (lastTag.wireType) {
                WireType.START_GROUP -> BinaryFieldValueDecoder.GroupFromReader(this, lastTag.fieldNumber)
                else -> valueDecoder(lastTag.wireType)
            }

            action(lastTag.fieldNumber, valueDecoder)
        }
    }
}