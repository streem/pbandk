package pbandk.internal.binary

import com.google.protobuf.CodedOutputStream

internal actual object Sizer : AbstractSizer() {
    actual override fun stringSize(value: String) = CodedOutputStream.computeStringSizeNoTag(value)
}
