package pbandk.internal.types.wkt

import pbandk.wkt.StringValue

internal object StringValue : WktWrapperValueType<String, StringValue>(
    wrapperFieldDescriptor = StringValue.FieldDescriptors.value,
    wrappedValueType = pbandk.internal.types.primitive.String,
)