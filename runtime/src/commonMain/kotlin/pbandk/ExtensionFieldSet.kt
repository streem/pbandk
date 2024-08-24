package pbandk

import pbandk.internal.AtomicReference

@Export
public class ExtensionFieldSet {
    private val map = AtomicReference<Map<Int, Any>>(emptyMap())

    internal operator fun get(fieldNumber: Int): Any? {
        return map.get()[fieldNumber]
    }

    internal operator fun set(fieldNumber: Int, value: Any) {
        map.set(map.get() + (fieldNumber to value))
    }
}