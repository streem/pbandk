/*
 * Copyright (C) 2017 Square, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package pbandk.internal.binary

// Courtesy of https://github.com/square/okio/blob/37e2f284cf62a1253633ae40e5f84b976c57ea0d/okio/src/commonMain/kotlin/okio/Utf8.kt#L77
internal fun utf8Len(value: String): Int {
    val endIndex = value.length

    var result = 0
    var i = 0
    while (i < endIndex) {
        val c = value[i].code

        if (c < 0x80) {
            // A 7-bit character with 1 byte.
            result++
            i++
        } else if (c < 0x800) {
            // An 11-bit character with 2 bytes.
            result += 2
            i++
        } else if (c < 0xd800 || c > 0xdfff) {
            // A 16-bit character with 3 bytes.
            result += 3
            i++
        } else {
            val low = if (i + 1 < endIndex) value[i + 1].code else 0
            if (c > 0xdbff || low < 0xdc00 || low > 0xdfff) {
                // A malformed surrogate, which yields '?'.
                result++
                i++
            } else {
                // A 21-bit character with 4 bytes.
                result += 4
                i += 2
            }
        }
    }

    return result
}