package exrc.chpt_040

import java.io.File

fun main() {
    val div = 2
    val outputFile = File("output.txt")

    (1..10)
        .filter { it % div == 0 }
        .map { it.toString(2) }
        .forEach { outputFile.appendText(it + "\n") }
}
