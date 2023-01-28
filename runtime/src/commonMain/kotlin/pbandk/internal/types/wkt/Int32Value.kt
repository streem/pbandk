package pbandk.internal.types.wkt

import pbandk.wkt.Int32Value

internal object Int32Value : WktWrapperValueType<Int, Int32Value>(
    wrapperFieldDescriptor = Int32Value.FieldDescriptors.value,
    wrappedValueType = pbandk.internal.types.primitive.Int32,
)