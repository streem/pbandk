package pbandk

import com.google.protobuf.CodedOutputStream

actual object Sizer : pbandk.impl.Sizer.Simple() {
    actual fun stringSize(value: String) = CodedOutputStream.computeStringSizeNoTag(value)
}