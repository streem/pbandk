package pbandk.internal

private class JvmAtomicReference<T>(value: T) : AtomicReference<T> {
    private val atomicReference = java.util.concurrent.atomic.AtomicReference(value)

    override fun set(value: T) {
        atomicReference.set(value)
    }

    override fun get(): T = atomicReference.get()
}

internal actual fun <T> AtomicReference(value: T): AtomicReference<T> = JvmAtomicReference(value)