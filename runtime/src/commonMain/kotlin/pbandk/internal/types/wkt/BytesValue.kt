package pbandk.internal.types.wkt

import pbandk.ByteArr
import pbandk.internal.json.JsonFieldValueEncoder
import pbandk.internal.binary.Sizer
import pbandk.wkt.BytesValue

internal object BytesValue : WktWrapperValueType<ByteArr, BytesValue>(
    wrappedValueType = pbandk.internal.types.primitive.Bytes,
    wrappedValueSizerFn = Sizer::bytesSize,
    wrappedValueAccessor = BytesValue::value,
)