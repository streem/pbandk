package pbandk.internal.types.wkt

import pbandk.wkt.DoubleValue

internal object DoubleValue : WktWrapperValueType<Double, DoubleValue>(
    wrapperFieldDescriptor = DoubleValue.FieldDescriptors.value,
    wrappedValueType = pbandk.internal.types.primitive.Double,
)