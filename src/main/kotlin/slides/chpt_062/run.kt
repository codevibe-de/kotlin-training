package slides.chpt_062

// public inline fun <T, R> T.run(block: T.() -> R): R

fun main() {
    Computer().run {
        installOs()
    }.run {
        // context is now "Unit", not "Computer" anymore
    }
}

class Computer {
    fun installOs() {}
    fun installKotlinSdk() {}
}