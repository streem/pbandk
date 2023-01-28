package pbandk.internal.types.wkt

import pbandk.wkt.UInt32Value

internal object UInt32Value : WktWrapperValueType<Int, UInt32Value>(
    wrapperFieldDescriptor = UInt32Value.FieldDescriptors.value,
    wrappedValueType = pbandk.internal.types.primitive.UInt32,
)