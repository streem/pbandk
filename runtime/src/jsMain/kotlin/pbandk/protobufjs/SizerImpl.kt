package pbandk.protobufjs

object SizerImpl : pbandk.impl.SizerImpl(), pbandk.Sizer {
    override fun stringSize(value: String) = util.utf8.length(value).let { it + uInt32Size(it) }
}