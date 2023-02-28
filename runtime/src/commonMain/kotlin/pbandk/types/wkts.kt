package pbandk.types

import pbandk.ByteArr
import pbandk.PublicForGeneratedCode
import pbandk.internal.types.wkt.Any
import pbandk.internal.types.wkt.BoolValue
import pbandk.internal.types.wkt.BytesValue
import pbandk.internal.types.wkt.DoubleValue
import pbandk.internal.types.wkt.Duration
import pbandk.internal.types.wkt.FloatValue
import pbandk.internal.types.wkt.Int32Value
import pbandk.internal.types.wkt.Int64Value
import pbandk.internal.types.wkt.ListValue
import pbandk.internal.types.wkt.StringValue
import pbandk.internal.types.wkt.Struct
import pbandk.internal.types.wkt.Timestamp
import pbandk.internal.types.wkt.UInt32Value
import pbandk.internal.types.wkt.UInt64Value
import pbandk.internal.types.wkt.Value
import kotlin.js.JsExport

@PublicForGeneratedCode
@JsExport
public fun any(): ValueType<pbandk.wkt.Any> = Any

@PublicForGeneratedCode
@JsExport
public fun boolValue(): ValueType<Boolean> = BoolValue

@PublicForGeneratedCode
@JsExport
public fun bytesValue(): ValueType<ByteArr> = BytesValue

@PublicForGeneratedCode
@JsExport
public fun doubleValue(): ValueType<Double> = DoubleValue

@PublicForGeneratedCode
@JsExport
public fun duration(): ValueType<pbandk.wkt.Duration> = Duration

@PublicForGeneratedCode
@JsExport
public fun floatValue(): ValueType<Float> = FloatValue

@PublicForGeneratedCode
@JsExport
public fun int32Value(): ValueType<Int> = Int32Value

@PublicForGeneratedCode
@JsExport
public fun int64Value(): ValueType<Long> = Int64Value

@PublicForGeneratedCode
@JsExport
public fun listValue(): ValueType<pbandk.wkt.ListValue> = ListValue

@PublicForGeneratedCode
@JsExport
public fun stringValue(): ValueType<String> = StringValue

@PublicForGeneratedCode
@JsExport
public fun struct(): ValueType<pbandk.wkt.Struct> = Struct

@PublicForGeneratedCode
@JsExport
public fun timestamp(): ValueType<pbandk.wkt.Timestamp> = Timestamp

@PublicForGeneratedCode
@JsExport
public fun uInt32Value(): ValueType<Int> = UInt32Value

@PublicForGeneratedCode
@JsExport
public fun uInt64Value(): ValueType<Long> = UInt64Value

@PublicForGeneratedCode
@JsExport
public fun value(): ValueType<pbandk.wkt.Value> = Value