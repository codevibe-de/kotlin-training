package chpt_030_ood

fun main() {
    val r: Runnable = object : Runnable {
        override fun run() {
            println("Hello")
        }
    }
    r.run()
}