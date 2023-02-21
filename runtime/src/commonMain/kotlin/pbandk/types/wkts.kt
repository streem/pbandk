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

@PublicForGeneratedCode
public fun any(): ValueType<pbandk.wkt.Any> = Any

@PublicForGeneratedCode
public fun boolValue(): ValueType<Boolean> = BoolValue

@PublicForGeneratedCode
public fun bytesValue(): ValueType<ByteArr> = BytesValue

@PublicForGeneratedCode
public fun doubleValue(): ValueType<Double> = DoubleValue

@PublicForGeneratedCode
public fun duration(): ValueType<pbandk.wkt.Duration> = Duration

@PublicForGeneratedCode
public fun floatValue(): ValueType<Float> = FloatValue

@PublicForGeneratedCode
public fun int32Value(): ValueType<Int> = Int32Value

@PublicForGeneratedCode
public fun int64Value(): ValueType<Long> = Int64Value

@PublicForGeneratedCode
public fun listValue(): ValueType<pbandk.wkt.ListValue> = ListValue

@PublicForGeneratedCode
public fun stringValue(): ValueType<String> = StringValue

@PublicForGeneratedCode
public fun struct(): ValueType<pbandk.wkt.Struct> = Struct

@PublicForGeneratedCode
public fun timestamp(): ValueType<pbandk.wkt.Timestamp> = Timestamp

@PublicForGeneratedCode
public fun uInt32Value(): ValueType<Int> = UInt32Value

@PublicForGeneratedCode
public fun uInt64Value(): ValueType<Long> = UInt64Value

@PublicForGeneratedCode
public fun value(): ValueType<pbandk.wkt.Value> = Value