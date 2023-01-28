package pbandk.internal.types.wkt

import pbandk.wkt.Int64Value

internal object Int64Value : WktWrapperValueType<Long, Int64Value>(
    wrapperFieldDescriptor = Int64Value.FieldDescriptors.value,
    wrappedValueType = pbandk.internal.types.primitive.Int64,
)