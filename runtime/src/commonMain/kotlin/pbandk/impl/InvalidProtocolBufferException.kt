// Protocol Buffers - Google's data interchange format
// Copyright 2008 Google Inc.  All rights reserved.
// https://developers.google.com/protocol-buffers/
//
// Redistribution and use in source and binary forms, with or without
// modification, are permitted provided that the following conditions are
// met:
//
//     * Redistributions of source code must retain the above copyright
// notice, this list of conditions and the following disclaimer.
//     * Redistributions in binary form must reproduce the above
// copyright notice, this list of conditions and the following disclaimer
// in the documentation and/or other materials provided with the
// distribution.
//     * Neither the name of Google Inc. nor the names of its
// contributors may be used to endorse or promote products derived from
// this software without specific prior written permission.
//
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
// "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
// LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
// A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
// OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
// SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
// LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
// DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
// THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
// (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
// OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

package pbandk.impl

import pbandk.Message

/**
 * Thrown when a protocol message being parsed is invalid in some way, e.g. it contains a malformed
 * varint or a negative byte length.
 *
 * @author kenton@google.com Kenton Varda
 */
open class InvalidProtocolBufferException : Exception {
    var unfinishedMessage: Message<*>? = null

    constructor(description: String) : super(description)

    constructor(e: Exception) : super(e.message, e)

    constructor(description: String, e: Exception) : super(description, e) {}

    /** Exception indicating that and unexpected wire type was encountered for a field.  */
    class InvalidWireTypeException(description: String)
        : InvalidProtocolBufferException(description)

    companion object {
        internal fun truncatedMessage(): InvalidProtocolBufferException {
            return InvalidProtocolBufferException(
                    "While parsing a protocol message, the input ended unexpectedly "
                            + "in the middle of a field.  This could mean either that the "
                            + "input has been truncated or that an embedded message "
                            + "misreported its own length.")
        }

        internal fun negativeSize(): InvalidProtocolBufferException {
            return InvalidProtocolBufferException(
                    ("CodedInputStream encountered an embedded string or message " + "which claimed to have negative size."))
        }

        internal fun malformedVarint(): InvalidProtocolBufferException {
            return InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.")
        }

        internal fun invalidTag(): InvalidProtocolBufferException {
            return InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).")
        }

        internal fun invalidEndTag(): InvalidProtocolBufferException {
            return InvalidProtocolBufferException(
                    "Protocol message end-group tag did not match expected tag.")
        }

        internal fun invalidWireType(): InvalidWireTypeException {
            return InvalidWireTypeException("Protocol message tag had invalid wire type.")
        }

        internal fun recursionLimitExceeded(): InvalidProtocolBufferException {
            return InvalidProtocolBufferException(
                    ("Protocol message had too many levels of nesting.  May be malicious.  " + "Use CodedInputStream.setRecursionLimit() to increase the depth limit."))
        }

        internal fun sizeLimitExceeded(): InvalidProtocolBufferException {
            return InvalidProtocolBufferException(
                    ("Protocol message was too large.  May be malicious.  " + "Use CodedInputStream.setSizeLimit() to increase the size limit."))
        }

        internal fun parseFailure(): InvalidProtocolBufferException {
            return InvalidProtocolBufferException("Failed to parse the message.")
        }

        internal fun invalidUtf8(): InvalidProtocolBufferException {
            return InvalidProtocolBufferException("Protocol message had invalid UTF-8.")
        }
    }
}