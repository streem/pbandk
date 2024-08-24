package pbandk.conformance

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual typealias JsModule = kotlin.js.JsModule

private object JsPlatform : NodeJsPlatform() {
    override fun byteArrayToUint8Array(array: ByteArray) =
        array.unsafeCast<Int8Array>().let { Uint8Array(it.buffer, it.byteOffset, it.byteLength) }

    override fun uint8ArrayToByteArray(array: Uint8Array) =
        Int8Array(array.buffer, array.byteOffset, array.byteLength).unsafeCast<ByteArray>()

    override suspend fun <R> runHandlingJsExceptions(block: suspend () -> R) = try {
        block()
    } catch (e: Throwable) {
        throw e
    } catch (e: dynamic) {
        throw RuntimeException("Unexpected error: $e")
    }
}

actual fun getPlatform(): Platform = JsPlatform