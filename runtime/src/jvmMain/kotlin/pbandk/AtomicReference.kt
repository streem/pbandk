package pbandk

actual class AtomicReference<T> actual constructor(value_: T) {
    private val atomicReference = java.util.concurrent.atomic.AtomicReference<T>(value_)
    actual fun set(value: T) {atomicReference.set(value)}
    actual fun get(): T = atomicReference.get()
}