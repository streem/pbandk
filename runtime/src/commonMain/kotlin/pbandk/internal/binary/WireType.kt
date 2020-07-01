package pbandk.internal.binary

internal object WireType {
    const val VARINT: Int = 0
    const val FIXED64: Int = 1
    const val LENGTH_DELIMITED: Int = 2
    const val START_GROUP: Int = 3
    const val END_GROUP: Int = 4
    const val FIXED32: Int = 5
}