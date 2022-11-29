package pbandk.internal.types.wkt

import pbandk.internal.binary.Sizer
import pbandk.wkt.FloatValue

internal object FloatValue : WktWrapperValueType<Float, FloatValue>(
    wrappedValueType = pbandk.internal.types.primitive.Float,
    wrappedValueSizerFn = Sizer::floatSize,
    wrappedValueAccessor = FloatValue::value,
)