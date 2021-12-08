package pbandk.internal

import pbandk.wkt.Duration
import pbandk.wkt.Timestamp
import pbandk.wkt.duration
import pbandk.wkt.timestamp

/*
These functions are adapted from the similarly-named functions in the protobuf C++ library:
https://github.com/protocolbuffers/protobuf/blob/a104dffcb6b1958a424f5fa6f9e6bdc0ab9b6f9e/src/google/protobuf/stubs/time.cc
*/

// The range of timestamp values we support.
private const val MIN_TIME = -62135596800L  // 0001-01-01T00:00:00
private const val MAX_TIME = 253402300799L  // 9999-12-31T23:59:59

// The range of duration values we support.
private const val MAX_DURATION_SECONDS = 315576000000
private const val MIN_DURATION_SECONDS = -315576000000

private const val NANOS_PER_MILLISECOND = 1000000
private const val NANOS_PER_MICROSECOND = 1000

private const val SECONDS_PER_MINUTE = 60L
private const val SECONDS_PER_HOUR = 3600L
private const val SECONDS_PER_DAY = SECONDS_PER_HOUR * 24
private const val SECONDS_PER_400_YEARS = SECONDS_PER_DAY * (400 * 365 + 400 / 4 - 3)

// Seconds from 0001-01-01T00:00:00 to 1970-01-01T:00:00:00
private const val SECONDS_FROM_ERA_TO_EPOCH = 62135596800L

// Count the seconds from the given year (start at Jan 1, 00:00) to 100 years
// after.
private fun secondsPer100Years(year: Int): Long {
    return if (year % 400 == 0 || year % 400 > 300) {
        SECONDS_PER_DAY * (100 * 365 + 100 / 4)
    } else {
        SECONDS_PER_DAY * (100 * 365 + 100 / 4 - 1)
    }
}

// Count the seconds from the given year (start at Jan 1, 00:00) to 4 years
// after.
private fun secondsPer4Years(year: Int): Long {
    return if ((year % 100 == 0 || year % 100 > 96) && !(year % 400 == 0 || year % 400 > 396)) {
        // No leap years.
        SECONDS_PER_DAY * (4 * 365)
    } else {
        // One leap years.
        SECONDS_PER_DAY * (4 * 365 + 1)
    }
}

private fun isLeapYear(year: Int) = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)

private fun secondsPerYear(year: Int): Long = SECONDS_PER_DAY * (if (isLeapYear(year)) 366 else 365)

private val DAYS_IN_MONTH = arrayOf(0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

private fun secondsPerMonth(month: Int, leap: Boolean): Long =
    SECONDS_PER_DAY * (DAYS_IN_MONTH[month] + if (month == 2 && leap) 1 else 0)

private val DAYS_SINCE_JAN = arrayOf(0, 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334)

private data class DateTime(
    val year: Int,
    val month: Int,
    val day: Int,
    val hour: Int,
    val minute: Int,
    val second: Int
) {
    companion object
}

// region timestamp formatting

/**
 * Converts a timestamp (seconds elapsed since 1970-01-01T00:00:00, could be
 * negative to represent time before 1970-01-01) to DateTime. Throws an exception
 * if the timestamp is not in the range between 0001-01-01T00:00:00 and
 * 9999-12-31T23:59:59.
 */
private fun DateTime.Companion.fromSeconds(seconds: Long): DateTime {
    require(seconds in MIN_TIME..MAX_TIME) {
        "Timestamp seconds outside of allowed range: '$seconds' !in $MIN_TIME..$MAX_TIME"
    }
    // It's easier to calculate the DateTime starting from 0001-01-01T00:00:00
    @Suppress("NAME_SHADOWING")
    var seconds = seconds + SECONDS_FROM_ERA_TO_EPOCH

    var year = 1
    if (seconds >= SECONDS_PER_400_YEARS) {
        val count400years = (seconds / SECONDS_PER_400_YEARS).toInt()
        year += 400 * count400years
        seconds %= SECONDS_PER_400_YEARS
    }
    while (seconds >= secondsPer100Years(year)) {
        seconds -= secondsPer100Years(year)
        year += 100
    }
    while (seconds >= secondsPer4Years(year)) {
        seconds -= secondsPer4Years(year)
        year += 4
    }
    while (seconds >= secondsPerYear(year)) {
        seconds -= secondsPerYear(year)
        year += 1
    }
    val leap = isLeapYear(year)
    var month = 1
    while (seconds >= secondsPerMonth(month, leap)) {
        seconds -= secondsPerMonth(month, leap)
        ++month
    }
    val day = 1 + (seconds / SECONDS_PER_DAY).toInt()
    seconds %= SECONDS_PER_DAY
    val hour = (seconds / SECONDS_PER_HOUR).toInt()
    seconds %= SECONDS_PER_HOUR
    val minute = (seconds / SECONDS_PER_MINUTE).toInt()
    seconds %= SECONDS_PER_MINUTE
    return DateTime(year, month, day, hour, minute, seconds.toInt())
}

/**
 * Formats a time string in RFC3339 format.
 *
 * For example, "2015-05-20T13:29:35.120Z". For nanos, 0, 3, 6 or 9 fractional
 * digits will be used depending on how many are required to represent the exact
 * value.
 *
 * Note that "nanos" must in the range of [0, 999999999].
 */
internal fun formatTime(seconds: Long, nanos: Int): String {
    // The range of timestamp values we support.
    require(nanos in 0..999999999) {
        "Timestamp nanos outside of allowed range: '$nanos' !in 0..999999999"
    }
    val time = DateTime.fromSeconds(seconds)

    return buildString(40) {
        // The output string will be yyyy-mm-ddThh:mm:ss.sssssssssZ. The fractional seconds component (with
        // leading period) is optional. If present, it can be up to 9 digits long but can be shorter.
        append(time.year.toString().padStart(4, '0'))
        append('-')
        append(time.month.toString().padStart(2, '0'))
        append('-')
        append(time.day.toString().padStart(2, '0'))
        append('T')
        append(time.hour.toString().padStart(2, '0'))
        append(':')
        append(time.minute.toString().padStart(2, '0'))
        append(':')
        append(time.second.toString().padStart(2, '0'))
        if (nanos != 0) append(".${formatNanos(nanos)}")
        append('Z')
    }
}

private fun formatNanos(nanos: Int): String =
    when {
        nanos % NANOS_PER_MILLISECOND == 0 ->
            (nanos / NANOS_PER_MILLISECOND).toString().padStart(3, '0')
        nanos % NANOS_PER_MICROSECOND == 0 ->
            (nanos / NANOS_PER_MICROSECOND).toString().padStart(6, '0')
        else -> nanos.toString().padStart(9, '0')
    }

// endregion

// region timestamp parsing

private data class ParsePosition(var position: Int = 0)

/**
 * Parses an integer from a string. The method consumes at most [width] chars. Throws `IllegalArgumentException` if
 * the data does not start with an integer or the integer value does not fall in the range of [minValue]..[maxValue].
 * Returns the parsed integer and increments [parsePosition] with the number of characters that were parsed.
 */
private fun parseInt(str: String, parsePosition: ParsePosition, width: Int, minValue: Int, maxValue: Int): Int {
    val position = parsePosition.position
    require(str[position] in '0'..'9') { "Failed to parse integer at: ${str.substring(position)}" }
    var value = 0
    var i = 0
    while (i < width) {
        if (str[position + i] in '0'..'9') {
            value = value * 10 + (str[position + i] - '0')
        } else {
            break
        }
        ++i
    }
    require(value in minValue..maxValue) { "Integer out of range: $value !in $minValue..$maxValue" }
    parsePosition.position += i
    return value
}

/**
 * Consumes the fractional parts of a second into nanos. For example, "010" will be parsed to 10000000 nanos.
 */
private fun parseNanos(str: String, parsePosition: ParsePosition): Int {
    val position = parsePosition.position
    require(str[position] in '0'..'9') { "Failed to parse nanos at: ${str.substring(position)}" }
    var value = 0
    var len = 0
    // Consume as many digits as there are but only take the first 9 into account.
    while (str[position + len] in '0'..'9') {
        if (len < 9) {
            value = value * 10 + (str[position + len] - '0')
        }
        ++len
    }
    parsePosition.position += len
    while (len < 9) {
        value *= 10
        ++len
    }
    return value
}

private fun requireChar(str: String, parsePosition: ParsePosition, char: Char) {
    require(str[parsePosition.position] == char) {
        "Expected '$char' at: ${str.substring(parsePosition.position)}"
    }
    ++parsePosition.position
}

// Accept format "HH:MM". E.g., "08:00"
private fun parseTimezoneOffset(str: String, parsePosition: ParsePosition): Int {
    val hour = parseInt(str, parsePosition, 2, 0, 23)
    requireChar(str, parsePosition, ':')
    val minute = parseInt(str, parsePosition, 2, 0, 59)
    return (hour * 60 + minute) * 60
}

// Count the number of seconds elapsed from 0001-01-01T00:00:00 to the given
// time.
private val DateTime.secondsSinceCommonEra: Long
    get() {
        var result = 0L

        // Years should be between 1 and 9999.
        check(year in 1..9999) { "Year outside of range: '$year' !in 1..9999" }
        var calculatedYear = 1
        if ((year - calculatedYear) >= 400) {
            val count400years = (year - calculatedYear) / 400
            result += SECONDS_PER_400_YEARS * count400years
            calculatedYear += count400years * 400
        }
        while ((year - calculatedYear) >= 100) {
            result += secondsPer100Years(calculatedYear)
            calculatedYear += 100
        }
        while ((year - calculatedYear) >= 4) {
            result += secondsPer4Years(calculatedYear)
            calculatedYear += 4
        }
        while (year > calculatedYear) {
            result += secondsPerYear(calculatedYear)
            ++calculatedYear
        }

        // Months should be between 1 and 12.
        check(month in 1..12) { "Month outside of range: '$month' !in 1..12" }
        result += SECONDS_PER_DAY * DAYS_SINCE_JAN[month]
        if (month > 2 && isLeapYear(calculatedYear)) {
            result += SECONDS_PER_DAY
        }

        check(day in 1..(DAYS_IN_MONTH[month] + if (month == 2 && isLeapYear(calculatedYear)) 1 else 0)) {
            "Day outside of range: '$day' !in 1..${(DAYS_IN_MONTH[month] + if (month == 2 && isLeapYear(calculatedYear)) 1 else 0)}"
        }
        result += SECONDS_PER_DAY * (this.day - 1)
        result += SECONDS_PER_HOUR * this.hour +
                SECONDS_PER_MINUTE * this.minute +
                this.second
        return result
    }

private fun DateTime.validate(): Boolean {
    if (year !in 1..9999 ||
        month !in 1..12 ||
        day !in 1..31 ||
        hour !in 0..23 ||
        minute !in 0..59 ||
        second !in 0..59
    ) {
        return false
    }
    return if (month == 2 && isLeapYear(year)) {
        day <= DAYS_IN_MONTH[month] + 1
    } else {
        day <= DAYS_IN_MONTH[month]
    }
}

/**
 * Converts DateTime to a timestamp (seconds since 1970-01-01T00:00:00).
 * Throws an exception if the DateTime is not valid or is not in the valid range.
 */
private fun DateTime.toSeconds(): Long {
    require(validate()) { "Invalid date/time values" }
    return secondsSinceCommonEra - SECONDS_FROM_ERA_TO_EPOCH
}

/**
 * Parses a time string. This method accepts RFC3339 date/time string with UTC
 * offset. For example, "2015-05-20T13:29:35.120-08:00".
 */
internal fun parseTime(str: String): Timestamp {
    // We only accept:
    //   Z-normalized: 2015-05-20T13:29:35.120Z
    //   With UTC offset: 2015-05-20T13:29:35.120-08:00

    val parsePosition = ParsePosition()

    // Parse year
    val year = parseInt(str, parsePosition, 4, 1, 9999)
    // Expect '-'
    requireChar(str, parsePosition, '-')
    // Parse month
    val month = parseInt(str, parsePosition, 2, 1, 12)
    // Expect '-'
    requireChar(str, parsePosition, '-')
    // Parse day
    val day = parseInt(str, parsePosition, 2, 1, 31)
    // Expect 'T'
    requireChar(str, parsePosition, 'T')
    // Parse hour
    val hour = parseInt(str, parsePosition, 2, 0, 23)
    // Expect ':'
    requireChar(str, parsePosition, ':')
    // Parse minute
    val minute = parseInt(str, parsePosition, 2, 0, 59)
    // Expect ':'
    requireChar(str, parsePosition, ':')
    // Parse second
    val second = parseInt(str, parsePosition, 2, 0, 59)

    val seconds = DateTime(year, month, day, hour, minute, second).toSeconds()

    // Parse nanoseconds.
    val nanos = if (str[parsePosition.position] == '.') {
        ++parsePosition.position
        // Parse nanoseconds.
        parseNanos(str, parsePosition)
    } else {
        0
    }

    // Parse UTC offsets.
    val secondsOffset = when (str[parsePosition.position++]) {
        'Z' -> 0
        '+' -> -parseTimezoneOffset(str, parsePosition)
        '-' -> parseTimezoneOffset(str, parsePosition)
        else -> throw IllegalArgumentException(
            "Expected 'Z' or timezone offset at: ${str.substring(parsePosition.position - 1)}"
        )
    }
    require(parsePosition.position == str.length) {
        "Didn't parse entire string: position=${parsePosition.position}, length=${str.length}"
    }

    return timestamp {
        this.seconds = seconds + secondsOffset
        this.nanos = nanos
    }
}

// endregion

// region duration

internal fun formatDuration(dur: Duration): String {
    var seconds = dur.seconds
    var nanos = dur.nanos

    require(seconds in MIN_DURATION_SECONDS..MAX_DURATION_SECONDS) {
        "Duration seconds outside of allowed range: '$seconds' !in $MIN_DURATION_SECONDS..$MAX_DURATION_SECONDS"
    }
    require(nanos in -999999999..999999999) {
        "Duration nanos outside of allowed range: '$nanos' !in -999999999..999999999"
    }

    // Max String Length: -315576000000.999999999s
    return buildString(24) {
        if (seconds < 0 || nanos < 0) {
            append('-')
            seconds = -seconds
            nanos = -nanos
        }

        append(seconds)
        if (nanos != 0) append(".${formatNanos(nanos)}")
        append('s')
    }
}

internal fun parseDuration(str: String): Duration {
    require(str.isNotEmpty() && str.last() == 's') { "Expected duration to end with s" }

    val negative = str.first() == '-'
    val signLength = if (negative) 1 else 0

    var seconds: Long
    var nanos: Int
    val nanosPos = ParsePosition(str.lastIndexOf('.') + 1)
    if (nanosPos.position == 0) {
        seconds = str.substring(signLength, str.length - 1).toLong()
        nanos = 0
    } else {
        seconds = str.substring(signLength, nanosPos.position - 1).toLong()
        nanos = parseNanos(str, nanosPos)
        // Catch garbage between nanos and ending 's'
        require(nanosPos.position == str.length - 1)
    }

    if (negative) {
        seconds = -seconds
        nanos = -nanos
    }

    require(seconds in -MAX_DURATION_SECONDS..MAX_DURATION_SECONDS) {
        "Duration seconds outside of allowed range: '$seconds' !in -$MAX_DURATION_SECONDS..$MAX_DURATION_SECONDS"
    }
    require(nanos in -999999999..999999999) {
        "Duration nanos outside of allowed range: '$nanos' !in -999999999..999999999"
    }

    return duration {
        this.seconds = seconds
        this.nanos = nanos
    }
}

// endregion