package pbandk.protobufjs

object Sizer : pbandk.impl.Sizer() {
    override fun stringSize(value: String) = util.utf8.length(value).let { it + uInt32Size(it) }
}