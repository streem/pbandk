@file:Suppress("RemoveRedundantQualifierName", "RedundantVisibilityModifier")
@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.testpb

public val pbandk.wkt.FieldOptions.nonOptionalInt32: Int?
    get() = getExtension(pbandk.testpb.nonOptionalInt32)

public var pbandk.wkt.MutableFieldOptions.nonOptionalInt32: Int?
    get() = getExtension(pbandk.testpb.nonOptionalInt32)
    set(value) = setExtension(pbandk.testpb.nonOptionalInt32, value)

@pbandk.Export
public val nonOptionalInt32: pbandk.FieldDescriptor<pbandk.wkt.FieldOptions, Int?> = 
    pbandk.FieldDescriptor.ofExtension(
        messageDescriptor = pbandk.wkt.FieldOptions.Companion::descriptor,
        fullName = "pbandk.testpb.non_optional_int32",
        number = 50000,
        type = pbandk.FieldDescriptor.Type.int32(hasPresence = true),
        jsonName = "nonOptionalInt32",
    )

public val pbandk.wkt.FieldOptions.optionalInt32: Int?
    get() = getExtension(pbandk.testpb.optionalInt32)

public var pbandk.wkt.MutableFieldOptions.optionalInt32: Int?
    get() = getExtension(pbandk.testpb.optionalInt32)
    set(value) = setExtension(pbandk.testpb.optionalInt32, value)

@pbandk.Export
public val optionalInt32: pbandk.FieldDescriptor<pbandk.wkt.FieldOptions, Int?> = 
    pbandk.FieldDescriptor.ofExtension(
        messageDescriptor = pbandk.wkt.FieldOptions.Companion::descriptor,
        fullName = "pbandk.testpb.optional_int32",
        number = 50001,
        type = pbandk.FieldDescriptor.Type.int32(hasPresence = true),
        jsonName = "optionalInt32",
    )

public val pbandk.wkt.FieldOptions.repeatedInt32: List<Int>
    get() = getRepeatedExtension(pbandk.testpb.repeatedInt32)

public val pbandk.wkt.MutableFieldOptions.repeatedInt32: MutableList<Int>
    get() = getRepeatedExtension(pbandk.testpb.repeatedInt32)

@pbandk.Export
public val repeatedInt32: pbandk.FieldDescriptor<pbandk.wkt.FieldOptions, List<Int>> = 
    pbandk.FieldDescriptor.ofRepeatedExtension(
        messageDescriptor = pbandk.wkt.FieldOptions.Companion::descriptor,
        fullName = "pbandk.testpb.repeated_int32",
        number = 50002,
        type = pbandk.FieldDescriptor.Type.repeated(valueType = pbandk.FieldDescriptor.Type.int32(), packed = true),
        jsonName = "repeatedInt32",
    )
