package pbandk.internal

import platform.posix.*

internal class PosixException(val errno: Int) : RuntimeException(
    strerror(errno)?.toString() ?: "Error with unknown errno: $errno"
)

internal actual object Util : AbstractUtil()
