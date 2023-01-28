package pbandk.internal.types.wkt

import pbandk.ByteArr
import pbandk.wkt.BytesValue

internal object BytesValue : WktWrapperValueType<ByteArr, BytesValue>(
    wrapperFieldDescriptor = BytesValue.FieldDescriptors.value,
    wrappedValueType = pbandk.internal.types.primitive.Bytes,
)