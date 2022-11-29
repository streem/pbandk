package pbandk.internal.types.wkt

import pbandk.internal.binary.Sizer
import pbandk.wkt.BoolValue

internal object BoolValue : WktWrapperValueType<Boolean, BoolValue>(
    wrappedValueType = pbandk.internal.types.primitive.Bool,
    wrappedValueSizerFn = Sizer::boolSize,
    wrappedValueAccessor = BoolValue::value,
)