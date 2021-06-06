package pbandk

import kotlin.js.JsExport

@JsExport
interface MessageEncoder {
    fun <T : Message> writeMessage(message: T)
}
