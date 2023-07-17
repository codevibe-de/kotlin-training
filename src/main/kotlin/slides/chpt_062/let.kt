package slides.chpt_062

import kotlin.random.Random

// public inline fun <T, R> T.let(block: (T) -> R): R

fun main() {
    val str: String? = generateStringOrNot()

    str?.let {
        println("Hey, we got the string '$it'")
    }

    val hash: Int = str?.let { it.hashCode() } ?: 0
}

fun generateStringOrNot() =
    when (Random.nextBoolean()) {
        true -> "hello!"
        false -> null
    }