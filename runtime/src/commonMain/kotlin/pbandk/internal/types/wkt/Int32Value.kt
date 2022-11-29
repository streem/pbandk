package pbandk.internal.types.wkt

import pbandk.internal.binary.Sizer
import pbandk.wkt.Int32Value

internal object Int32Value : WktWrapperValueType<Int, Int32Value>(
    wrappedValueType = pbandk.internal.types.primitive.Int32,
    wrappedValueSizerFn = Sizer::int32Size,
    wrappedValueAccessor = Int32Value::value,
)