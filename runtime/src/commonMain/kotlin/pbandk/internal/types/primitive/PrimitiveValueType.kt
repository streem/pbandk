package pbandk.internal.types.primitive

import pbandk.types.ValueType

internal abstract class PrimitiveValueType<KotlinType : Any> : ValueType<KotlinType> {
    override fun mergeValues(value: KotlinType, otherValue: KotlinType) = otherValue
}