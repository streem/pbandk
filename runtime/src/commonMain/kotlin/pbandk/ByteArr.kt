package pbandk

import kotlin.js.JsExport

@JsExport
class ByteArr(val array: ByteArray) {
    override fun equals(other: Any?) = other is ByteArr && array.contentEquals(other.array)
    override fun hashCode() = array.contentHashCode()
    override fun toString() = array.contentToString()

    companion object {
        val empty = ByteArr(ByteArray(0))
    }
}
