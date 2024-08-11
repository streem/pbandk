package pbandk.conformance

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual typealias JsModule = kotlin.js.JsModule

private object WasmJsPlatform : NodeJsPlatform() {
    override fun byteArrayToUint8Array(array: ByteArray): Uint8Array =
        Uint8Array(array.size).also { array.forEachIndexed { index, byte -> it[index] = byte } }

    override fun uint8ArrayToByteArray(array: Uint8Array) =
        ByteArray(array.byteLength) { i -> array[i] }

    override suspend fun <R> runHandlingJsExceptions(block: suspend () -> R) = block()
}

actual fun getPlatform(): Platform = WasmJsPlatform