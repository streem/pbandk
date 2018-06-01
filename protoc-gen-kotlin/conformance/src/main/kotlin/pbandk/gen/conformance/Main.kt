package pbandk.gen.conformance

import java.io.BufferedInputStream
import java.nio.ByteBuffer
import java.nio.ByteOrder

fun main(args: Array<String>) {
    System.err.println("STARTING!!")
    doTestIo(System.`in`.buffered())
}

fun doTestIo(stdin: BufferedInputStream) {
    // Read LE int
    val messageSize = stdin.readIntLE()
    System.err.println("SIZE: $messageSize")
    // Read full set of bytes
    val messageBytes = ByteArray(messageSize).also(stdin::readFull)
    System.err.println("READ ALL BYTES!: $messageSize")
    val req = ConformanceRequest.unmarshal(messageBytes)
    System.err.println("READ: $req")
    error("NO!!")
}

fun BufferedInputStream.readIntLE() =
    ByteBuffer.wrap(ByteArray(4).also { require(read(it) == 4) }).order(ByteOrder.LITTLE_ENDIAN).int

fun BufferedInputStream.readFull(arr: ByteArray) =
    require(read(arr) == arr.size) { "Unable to read full byte array" }