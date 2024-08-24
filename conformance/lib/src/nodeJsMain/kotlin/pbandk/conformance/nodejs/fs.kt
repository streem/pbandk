@file:JsModule("fs")

package pbandk.conformance.nodejs

import pbandk.conformance.ArrayBufferView
import pbandk.conformance.JsModule

internal external fun closeSync(fd: Int)

internal external fun readSync(
    fd: Int,
    buffer: ArrayBufferView,
    offset: Int,
    length: Int,
    position: Int?,
): Int

internal external fun writeSync(
    fd: Int,
    buffer: ArrayBufferView,
    offset: Int,
    length: Int,
    position: Int?,
): Int