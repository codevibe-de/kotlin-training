package chpt_030_ood

import java.io.ByteArrayOutputStream
import java.io.OutputStream

//interface Writable {
//    fun getWriteProgress(): Int
//
//    fun write(out: OutputStream)
//
//    fun init() {
//        println("Initializing...")
//    }
//}

interface Writable {
    val writeProgress: Int
    val isDone: Boolean
        get() = writeProgress >= 100

    fun write(out: OutputStream)

    fun init() {
        println("Initializing...")
    }
}

class WritableString(val value: String) : Writable {

    private var byteWriteCount = 0

    override val writeProgress: Int
        get() = byteWriteCount * 100 / value.length

    override fun write(out: OutputStream) {
        val bytes = value.toByteArray()
        for (i in bytes.indices) {
            byteWriteCount++
            out.write(bytes[i].toInt())
        }
    }
}

fun main() {
    val ws = WritableString("abc")
    ws.write(ByteArrayOutputStream())
    println(ws.isDone) // true, inherited
}