package pbandk.internal.types.wkt

import pbandk.internal.binary.Sizer
import pbandk.wkt.UInt64Value

internal object UInt64Value : WktWrapperValueType<Long, UInt64Value>(
    pbandk.internal.types.primitive.UInt64,
    Sizer::uInt64Size,
    UInt64Value::value,
)