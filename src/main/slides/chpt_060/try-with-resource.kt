package chpt_060

import java.io.File
import java.io.FileOutputStream

// fun <T : Closeable?, R> T.use(block: (T) -> R): R

fun main() {
    val file = File("out.txt")
    println(file.absolutePath)

    FileOutputStream(file).use {
        it.write(64)
        Thread.sleep(10_000)
        // since file is closed now, we can delete it in FS
    }

    println("done")
}