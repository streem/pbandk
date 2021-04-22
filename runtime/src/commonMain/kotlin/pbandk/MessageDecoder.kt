package pbandk

import kotlin.js.JsExport

@JsExport
interface MessageDecoder {
    fun <T : Message> readMessage(
        messageCompanion: Message.Companion<T>,
        fieldFn: (Int, Any) -> Unit
    ): Map<Int, UnknownField>
}
