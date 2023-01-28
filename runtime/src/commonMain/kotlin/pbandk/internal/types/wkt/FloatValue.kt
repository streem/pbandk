package pbandk.internal.types.wkt

import pbandk.wkt.FloatValue

internal object FloatValue : WktWrapperValueType<Float, FloatValue>(
    wrapperFieldDescriptor = FloatValue.FieldDescriptors.value,
    wrappedValueType = pbandk.internal.types.primitive.Float,
)