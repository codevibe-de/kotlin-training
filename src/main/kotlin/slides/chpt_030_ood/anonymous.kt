package slides.chpt_030_ood

import exrc.chpt_030.Task

fun main() {
    createPrintlnRunnable("Hola!").run()
}


fun createPrintlnRunnable(output:String): Runnable {
    return object : Runnable {
        override fun run() {
            println(output)
        }
    }
}


abstract class Supi