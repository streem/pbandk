package pbandk.internal.types.wkt

import pbandk.internal.binary.Sizer
import pbandk.wkt.StringValue

internal object StringValue : WktWrapperValueType<String, StringValue>(
    pbandk.internal.types.primitive.String,
    Sizer::stringSize,
    StringValue::value,
)