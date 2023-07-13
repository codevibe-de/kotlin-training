package chpt_060

// public inline fun <T, R> with(receiver: T, block: T.() -> R): R

fun main() {
    with(Computer()) {
        installOs()
        installKotlinSdk()
    }
}
