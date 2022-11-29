package pbandk.internal.types.wkt

import pbandk.internal.binary.Sizer
import pbandk.wkt.DoubleValue

internal object DoubleValue : WktWrapperValueType<Double, DoubleValue>(
    wrappedValueType = pbandk.internal.types.primitive.Double,
    wrappedValueSizerFn = Sizer::doubleSize,
    wrappedValueAccessor = DoubleValue::value,
)