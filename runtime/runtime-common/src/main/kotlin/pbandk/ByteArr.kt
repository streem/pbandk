package pbandk

import kotlinx.serialization.*

@Serializable
class ByteArr(val array: ByteArray) {
    override fun equals(other: Any?) = other is ByteArr && array.contentEquals(other.array)
    override fun hashCode() = array.contentHashCode()
    override fun toString() = array.contentToString()

    @Serializer(forClass = ByteArr::class)
    companion object : KSerializer<ByteArr> {
        val empty = ByteArr(ByteArray(0))

        override fun serialize(encoder: Encoder, obj: ByteArr) =
            encoder.encodeString(Util.bytesToBase64(obj.array))

        override fun deserialize(decoder: Decoder) =
            ByteArr(Util.base64ToBytes(decoder.decodeString()))
    }
}