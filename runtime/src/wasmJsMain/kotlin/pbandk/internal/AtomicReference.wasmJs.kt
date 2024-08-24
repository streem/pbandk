package pbandk.internal

internal actual fun <T> AtomicReference(value: T): AtomicReference<T> = SingleThreadAtomicReference(value)