@file:JsModule("buffer")

package pbandk.conformance.nodejs

import pbandk.conformance.JsModule
import pbandk.conformance.Uint8Array

internal external class Buffer : Uint8Array {
    companion object {
        fun allocUnsafe(size: Int): Buffer
    }
}