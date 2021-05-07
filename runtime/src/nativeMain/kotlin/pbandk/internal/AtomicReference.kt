package pbandk.internal

import kotlin.native.concurrent.freeze

internal actual class AtomicReference<T> actual constructor(value_: T) {
    private val atomicReference = kotlin.native.concurrent.AtomicReference<T>(value_)

    actual fun set(value: T) {
        value.freeze()
        atomicReference.value = value
    }

    actual fun get(): T = atomicReference.value
}