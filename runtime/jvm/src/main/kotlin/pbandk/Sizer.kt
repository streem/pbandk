package pbandk

import com.google.protobuf.CodedOutputStream

actual object Sizer {
    actual inline fun tagSize(fieldNum: Int) = CodedOutputStream.computeTagSize(fieldNum)
    actual inline fun doubleSize(value: Double) = CodedOutputStream.computeDoubleSizeNoTag(value)
    actual inline fun floatSize(value: Float) = CodedOutputStream.computeFloatSizeNoTag(value)
    actual inline fun int32Size(value: Int) = CodedOutputStream.computeInt32SizeNoTag(value)
    actual inline fun int64Size(value: Long) = CodedOutputStream.computeInt64SizeNoTag(value)
    actual inline fun uInt32Size(value: Int) = CodedOutputStream.computeUInt32SizeNoTag(value)
    actual inline fun uInt64Size(value: Long) = CodedOutputStream.computeUInt64SizeNoTag(value)
    actual inline fun sInt32Size(value: Int) = CodedOutputStream.computeSInt32SizeNoTag(value)
    actual inline fun sInt64Size(value: Long) = CodedOutputStream.computeSInt64SizeNoTag(value)
    actual inline fun fixed32Size(value: Int) = CodedOutputStream.computeFixed32SizeNoTag(value)
    actual inline fun fixed64Size(value: Long) = CodedOutputStream.computeFixed64SizeNoTag(value)
    actual inline fun sFixed32Size(value: Int) = CodedOutputStream.computeSFixed32SizeNoTag(value)
    actual inline fun sFixed64Size(value: Long) = CodedOutputStream.computeSFixed64SizeNoTag(value)
    actual inline fun stringSize(value: String) = CodedOutputStream.computeStringSizeNoTag(value)
    actual inline fun byteArrSize(value: ByteArr) = CodedOutputStream.computeByteArraySizeNoTag(value.array)
    actual inline fun enumSize(value: Int) = CodedOutputStream.computeEnumSizeNoTag(value)
}