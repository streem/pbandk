package pbandk.types

import pbandk.PublicForGeneratedCode
import pbandk.binary.BinaryFieldValueDecoder
import pbandk.json.JsonFieldValueEncoder
import pbandk.binary.BinaryFieldValueEncoder
import pbandk.binary.WireType
import pbandk.json.JsonFieldValueDecoder
import kotlin.js.JsExport

@PublicForGeneratedCode
@JsExport
public interface ValueType<KotlinType : Any> {
    public val defaultValue: KotlinType
    public fun isDefaultValue(value: KotlinType): Boolean
    public fun mergeValues(currentValue: KotlinType, newValue: KotlinType): KotlinType

    public val binaryWireType: WireType
    public fun binarySize(value: KotlinType): Int
    public fun encodeToBinary(value: KotlinType, encoder: BinaryFieldValueEncoder)
    public fun decodeFromBinary(decoder: BinaryFieldValueDecoder): KotlinType

    public fun encodeToJson(value: KotlinType, encoder: JsonFieldValueEncoder)
    public fun encodeToJsonMapKey(value: KotlinType): String
    public fun decodeFromJson(decoder: JsonFieldValueDecoder): KotlinType
    public fun decodeFromJsonMapKey(decoder: JsonFieldValueDecoder.String): KotlinType
}