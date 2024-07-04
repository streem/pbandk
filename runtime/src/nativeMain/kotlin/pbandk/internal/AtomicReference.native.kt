package pbandk.internal

private class NativeAtomicReference<T>(value: T) : AtomicReference<T> {
    private val atomicReference = kotlin.concurrent.AtomicReference(value)

    override fun set(value: T) {
        atomicReference.value = value
    }

    override fun get(): T = atomicReference.value
}

internal actual fun <T> AtomicReference(value: T): AtomicReference<T> = NativeAtomicReference(value)