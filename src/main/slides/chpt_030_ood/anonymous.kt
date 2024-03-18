package slides.chpt_030_ood

fun main() {
    createPrintlnRunnable("Hola!").run()
}


fun createPrintlnRunnable(output: String): Runnable {
    return object : Runnable {
        override fun run() {
            println(output)
        }
    }
}