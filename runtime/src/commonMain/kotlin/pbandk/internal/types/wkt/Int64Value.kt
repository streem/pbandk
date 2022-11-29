package pbandk.internal.types.wkt

import pbandk.internal.binary.Sizer
import pbandk.wkt.Int64Value

internal object Int64Value : WktWrapperValueType<Long, Int64Value>(
    wrappedValueType = pbandk.internal.types.primitive.Int64,
    wrappedValueSizerFn = Sizer::int64Size,
    wrappedValueAccessor = Int64Value::value,
)