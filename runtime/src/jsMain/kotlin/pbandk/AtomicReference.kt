package pbandk

actual class AtomicReference<T> actual constructor(value_: T) {
    var value = value_
    actual fun set(value: T) {
        this.value = value
    }

    actual fun get(): T {
        return value
    }
}