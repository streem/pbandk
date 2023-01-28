package pbandk.internal.types.wkt

import pbandk.wkt.BoolValue

internal object BoolValue : WktWrapperValueType<Boolean, BoolValue>(
    wrapperFieldDescriptor = BoolValue.FieldDescriptors.value,
    wrappedValueType = pbandk.internal.types.primitive.Bool,
)