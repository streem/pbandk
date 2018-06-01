package pbandk

import com.google.protobuf.CodedOutputStream

actual object Sizer {
    actual fun tagSize(fieldNum: Int) = CodedOutputStream.computeTagSize(fieldNum)
    actual fun doubleSize(value: Double) = CodedOutputStream.computeDoubleSizeNoTag(value)
    actual fun floatSize(value: Float) = CodedOutputStream.computeFloatSizeNoTag(value)
    actual fun int32Size(value: Int) = CodedOutputStream.computeInt32SizeNoTag(value)
    actual fun int64Size(value: Long) = CodedOutputStream.computeInt64SizeNoTag(value)
    actual fun uInt32Size(value: Int) = CodedOutputStream.computeUInt32SizeNoTag(value)
    actual fun uInt64Size(value: Long) = CodedOutputStream.computeUInt64SizeNoTag(value)
    actual fun sInt32Size(value: Int) = CodedOutputStream.computeSInt32SizeNoTag(value)
    actual fun sInt64Size(value: Long) = CodedOutputStream.computeSInt64SizeNoTag(value)
    actual fun fixed32Size(value: Int) = CodedOutputStream.computeFixed32SizeNoTag(value)
    actual fun fixed64Size(value: Long) = CodedOutputStream.computeFixed64SizeNoTag(value)
    actual fun sFixed32Size(value: Int) = CodedOutputStream.computeSFixed32SizeNoTag(value)
    actual fun sFixed64Size(value: Long) = CodedOutputStream.computeSFixed64SizeNoTag(value)
    actual fun boolSize(value: Boolean) = CodedOutputStream.computeBoolSizeNoTag(value)
    actual fun stringSize(value: String) = CodedOutputStream.computeStringSizeNoTag(value)
    actual fun bytesSize(value: ByteArr) = CodedOutputStream.computeByteArraySizeNoTag(value.array)
    actual fun enumSize(value: Int) = CodedOutputStream.computeEnumSizeNoTag(value)
}