package pbandk.internal.binary.kotlin

import pbandk.InvalidProtocolBufferException

internal interface WireReader {
    /**
     * Read [length] bytes from the input.
     *
     * @throws InvalidProtocolBufferException The end of the stream or the current limit was reached.
     */
    fun read(length: Int): ByteArray

    /**
     * Returns true if the stream has reached the end of the input. This function may get blocked when using an
     * `InputStream` as it will try to read bytes from input.
     */
    fun isAtEnd(): Boolean

    /**
     * Reads and discards [length] bytes.
     *
     * @throws InvalidProtocolBufferException The end of the stream or the current limit was reached.
     */
    fun skipRawBytes(length: Int)
}