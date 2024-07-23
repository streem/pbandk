package pbandk.internal

import kotlin.native.concurrent.freeze

private class NativeAtomicReference<T>(value: T) : AtomicReference<T> {
    private val atomicReference = kotlin.concurrent.AtomicReference(value)

    override fun set(value: T) {
        value.freeze()
        atomicReference.value = value
    }

    override fun get(): T = atomicReference.value
}

internal actual fun <T> AtomicReference(value: T): AtomicReference<T> = NativeAtomicReference(value)