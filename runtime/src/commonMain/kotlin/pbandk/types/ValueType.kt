package pbandk.types

import pbandk.PublicForGeneratedCode
import pbandk.binary.BinaryFieldValueDecoder
import pbandk.binary.BinaryFieldValueEncoder
import pbandk.binary.WireType
import pbandk.json.JsonFieldValueDecoder
import pbandk.json.JsonFieldValueEncoder

@PublicForGeneratedCode
public interface ValueType<KotlinType : Any> {
    /**
     * Returns the default value for this type. Can throw an exception if [KotlinType] is a [pbandk.Message] with
     * `required` fields, since such messages do not have a default value. Prefer [isDefaultValue] over [defaultValue]
     * when you only need to check if another value is the default, as this avoids the possibility of throwing an
     * exception.
     */
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
