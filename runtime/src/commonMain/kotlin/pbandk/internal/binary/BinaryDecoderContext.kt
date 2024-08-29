package pbandk.internal.binary

import pbandk.InvalidProtocolBufferException
import pbandk.binary.BinaryFieldValueDecoder
import pbandk.binary.WireType
import pbandk.internal.binary.kotlin.LimitingWireReader
import pbandk.internal.binary.kotlin.WireReader

internal class BinaryDecoderContext(wireReader: WireReader) {
    val wireReader = LimitingWireReader(wireReader)
    val fieldDecoder = BinaryFieldDecoder.fromContext(this)

    val varintValueDecoder: BinaryFieldValueDecoder.Varint = BinaryFieldValueDecoder.VarintFromReader(this.wireReader)
    val i32ValueDecoder: BinaryFieldValueDecoder.I32 = BinaryFieldValueDecoder.I32FromReader(this.wireReader)
    val i64ValueDecoder: BinaryFieldValueDecoder.I64 = BinaryFieldValueDecoder.I64FromReader(this.wireReader)
    val lenValueDecoder: BinaryFieldValueDecoder.Len = BinaryFieldValueDecoder.LenFromReader(this)
    val groupValueDecoder: BinaryFieldValueDecoder.Group = BinaryFieldValueDecoder.GroupFromReader(fieldDecoder)

    fun valueDecoder(wireType: WireType): BinaryFieldValueDecoder = when (wireType) {
        WireType.VARINT -> varintValueDecoder
        WireType.FIXED32 -> i32ValueDecoder
        WireType.FIXED64 -> i64ValueDecoder
        WireType.LENGTH_DELIMITED -> lenValueDecoder
        WireType.START_GROUP -> groupValueDecoder
        WireType.END_GROUP -> BinaryFieldValueDecoder.EndGroup
        else -> throw InvalidProtocolBufferException.invalidWireType()
    }
}