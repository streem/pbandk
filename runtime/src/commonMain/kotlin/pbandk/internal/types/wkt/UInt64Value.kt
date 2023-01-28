package pbandk.internal.types.wkt

import pbandk.wkt.UInt64Value

internal object UInt64Value : WktWrapperValueType<Long, UInt64Value>(
    wrapperFieldDescriptor = UInt64Value.FieldDescriptors.value,
    wrappedValueType = pbandk.internal.types.primitive.UInt64,
)