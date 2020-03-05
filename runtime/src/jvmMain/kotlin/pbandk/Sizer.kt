package pbandk

import com.google.protobuf.CodedOutputStream

actual object Sizer : pbandk.impl.Sizer() {
    actual override fun stringSize(value: String) = CodedOutputStream.computeStringSizeNoTag(value)
}