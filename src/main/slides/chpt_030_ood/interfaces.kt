package chpt_030_ood

import java.io.BufferedOutputStream
import java.io.File
import java.io.FileOutputStream
import java.io.OutputStream

//interface Writable {
//    fun getWriteProgress(): Int
//    fun write(out: Writer)
//}

interface Writable {
    val writeProgress: Int
    fun write(out: OutputStream)
}

class WritableString(val value: String) : Writable {

    private var byteWriteCount = 0

    override val writeProgress: Int = byteWriteCount * 100 / value.length

    override fun write(out: OutputStream) {
        val bytes = value.toByteArray()
        for (i in 0..bytes.size) {
            byteWriteCount++
            out.write(bytes[i].toInt())
        }
    }
}

fun main() {
    WritableString("Hello").write(BufferedOutputStream(FileOutputStream(File("out.txt"))))
}