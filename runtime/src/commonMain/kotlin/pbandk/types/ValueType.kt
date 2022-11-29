package pbandk.types

import pbandk.internal.json.JsonFieldValueEncoder
import pbandk.internal.binary.BinaryFieldValueEncoder
import pbandk.internal.binary.WireType

internal interface ValueType<KotlinType> {
    fun isDefaultValue(value: KotlinType): Boolean

    val binaryWireType: WireType
    fun binarySize(value: KotlinType): Int
    fun encodeToBinary(value: KotlinType, encoder: BinaryFieldValueEncoder)

    fun encodeToJson(value: KotlinType, encoder: JsonFieldValueEncoder)
    fun encodeToJsonMapKey(value: KotlinType): String
}