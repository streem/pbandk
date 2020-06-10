package pbandk

import com.google.protobuf.CodedOutputStream

actual object SizerImpl : pbandk.impl.SizerImpl(), Sizer {
    override fun stringSize(value: String) = CodedOutputStream.computeStringSizeNoTag(value)
}