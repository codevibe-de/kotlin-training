package chpt_062

// public inline fun <T, R> with(receiver: T, block: T.() -> R): R

fun main() {
    val freeDiskSpace = with(Computer()) {
        installOs()
        installKotlinSdk()
        freeDiskSpace // return value
    }
}


class Computer {
    fun installOs() {
    }

    fun installKotlinSdk() {
    }

    val freeDiskSpace = 3 * 1024 * 1024
}