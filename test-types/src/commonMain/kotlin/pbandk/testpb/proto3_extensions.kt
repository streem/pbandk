@file:Suppress("RemoveRedundantQualifierName", "RedundantVisibilityModifier")
@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.testpb

public val pbandk.wkt.FieldOptions.nonOptionalInt32: Int?
    get() = pbandk.testpb.nonOptionalInt32.getValue(this)

public var pbandk.wkt.MutableFieldOptions.nonOptionalInt32: Int?
    get() = pbandk.testpb.nonOptionalInt32.getValue(this)
    set(value) = pbandk.testpb.nonOptionalInt32.setValue(this, value)

@pbandk.Export
public val nonOptionalInt32: pbandk.FieldDescriptor<pbandk.wkt.FieldOptions, Int?> = 
    pbandk.FieldDescriptor.ofExtension(
        messageDescriptor = pbandk.wkt.FieldOptions::descriptor,
        fullName = "pbandk.testpb.non_optional_int32",
        number = 50000,
        valueType = pbandk.types.int32(),
        jsonName = "nonOptionalInt32",
    )

public val pbandk.wkt.FieldOptions.optionalInt32: Int?
    get() = pbandk.testpb.optionalInt32.getValue(this)

public var pbandk.wkt.MutableFieldOptions.optionalInt32: Int?
    get() = pbandk.testpb.optionalInt32.getValue(this)
    set(value) = pbandk.testpb.optionalInt32.setValue(this, value)

@pbandk.Export
public val optionalInt32: pbandk.FieldDescriptor<pbandk.wkt.FieldOptions, Int?> = 
    pbandk.FieldDescriptor.ofExtension(
        messageDescriptor = pbandk.wkt.FieldOptions::descriptor,
        fullName = "pbandk.testpb.optional_int32",
        number = 50001,
        valueType = pbandk.types.int32(),
        jsonName = "optionalInt32",
    )

public val pbandk.wkt.FieldOptions.repeatedInt32: List<Int>
    get() = pbandk.testpb.repeatedInt32.getValue(this)

public val pbandk.wkt.MutableFieldOptions.repeatedInt32: MutableList<Int>
    get() = pbandk.testpb.repeatedInt32.getMutableValue(this)

@pbandk.Export
public val repeatedInt32: pbandk.FieldDescriptor.MutableValue<pbandk.wkt.FieldOptions, List<Int>, MutableList<Int>> = 
    pbandk.FieldDescriptor.ofRepeatedExtension(
        messageDescriptor = pbandk.wkt.FieldOptions::descriptor,
        fullName = "pbandk.testpb.repeated_int32",
        number = 50002,
        valueType = pbandk.types.int32(),
        jsonName = "repeatedInt32",
    )
