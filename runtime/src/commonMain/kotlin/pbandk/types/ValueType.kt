package pbandk.types

import pbandk.internal.json.JsonFieldValueEncoder
import pbandk.internal.binary.BinaryFieldValueEncoder
import pbandk.internal.binary.WireType

internal interface ValueType<KotlinType : Any> {
    fun isDefaultValue(value: KotlinType): Boolean
    fun mergeValues(value: KotlinType, otherValue: KotlinType): KotlinType

    val binaryWireType: WireType
    fun binarySize(value: KotlinType): Int
    fun encodeToBinary(value: KotlinType, encoder: BinaryFieldValueEncoder)

    fun encodeToJson(value: KotlinType, encoder: JsonFieldValueEncoder)
    fun encodeToJsonMapKey(value: KotlinType): String
}