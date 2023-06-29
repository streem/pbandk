package pbandk

import kotlin.js.JsExport

@JsExport
public class InvalidProtocolBufferException : RuntimeException {
    internal constructor(message: String) : super(message)
    internal constructor(message: String, cause: Throwable) : super(message, cause)

    public companion object {
        @PublicForGeneratedCode
        public fun missingRequiredField(fieldName: String): InvalidProtocolBufferException =
            InvalidProtocolBufferException("Required field '$fieldName' was not set.")

        internal fun unrecognizedStringInRequiredEnumField() = InvalidProtocolBufferException(
            "Attempted to encode a 'required' enum field with an unknown string value to binary."
        )

        internal fun unrecognizedEnumValue(fieldName: String) =
            InvalidProtocolBufferException("Enum field '$fieldName' did not contain a known enum value.")

        internal fun truncatedMessage() = InvalidProtocolBufferException(
            "While parsing a protocol message, the input ended unexpectedly "
                    + "in the middle of a field. This could mean either that the "
                    + "input has been truncated or that an embedded message "
                    + "misreported its own length."
        )

        internal fun negativeSize() = InvalidProtocolBufferException(
            "Encountered an embedded string or message which claimed to have negative size."
        )

        internal fun malformedVarint() = InvalidProtocolBufferException("Encountered a malformed varint.")

        internal fun invalidTag() = InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).")

        internal fun invalidEndTag() = InvalidProtocolBufferException(
            "Protocol message end-group tag did not match expected tag."
        )

        internal fun invalidWireType() = InvalidProtocolBufferException("Protocol message tag had invalid wire type.")

        internal fun recursionLimitExceeded() = InvalidProtocolBufferException(
            "Protocol message had too many levels of nesting.  May be malicious.  "
                    + "Use a higher recursionLimit when reading the input."
        )

        internal fun sizeLimitExceeded() = InvalidProtocolBufferException(
            "Protocol message was too large.  May be malicious.  Use a higher sizeLimit when reading the input."
        )

        internal fun parseFailure() = InvalidProtocolBufferException("Failed to parse the message.")

        internal fun invalidUtf8() = InvalidProtocolBufferException("Protocol message had invalid UTF-8.")

        internal fun invalidJsonType() = InvalidProtocolBufferException("Protocol message JSON field had invalid type.")
    }
}