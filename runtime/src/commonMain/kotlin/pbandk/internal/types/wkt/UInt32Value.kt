package pbandk.internal.types.wkt

import pbandk.internal.binary.Sizer
import pbandk.wkt.UInt32Value

internal object UInt32Value : WktWrapperValueType<Int, UInt32Value>(
    pbandk.internal.types.primitive.UInt32,
    Sizer::uInt32Size,
    UInt32Value::value,
)