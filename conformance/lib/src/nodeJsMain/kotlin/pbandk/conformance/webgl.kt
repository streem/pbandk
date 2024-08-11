package pbandk.conformance

// Copied from the org.khronos.webgl package in the kotlin stdlib, since it's not currently accessible from a shared
// js/wasmJs source set

internal external class ArrayBuffer(length: Int) {
    val byteLength: Int
}

internal external interface ArrayBufferView {
    val buffer: ArrayBuffer
    val byteOffset: Int
    val byteLength: Int
}

internal open external class Int8Array : ArrayBufferView {
    constructor(length: Int)
    constructor(buffer: ArrayBuffer, byteOffset: Int, length: Int)

    open val length: Int
    override val buffer: ArrayBuffer
    override val byteOffset: Int
    override val byteLength: Int

    operator fun get(index: Int): Byte
    operator fun set(index: Int, value: Byte)
    fun subarray(start: Int, end: Int): Int8Array
}

internal open external class Uint8Array : ArrayBufferView {
    constructor(length: Int)
    constructor(buffer: ArrayBuffer, byteOffset: Int, length: Int)

    open val length: Int
    override val buffer: ArrayBuffer
    override val byteOffset: Int
    override val byteLength: Int

    operator fun get(index: Int): Byte
    operator fun set(index: Int, value: Byte)
    fun subarray(start: Int, end: Int): Uint8Array
}