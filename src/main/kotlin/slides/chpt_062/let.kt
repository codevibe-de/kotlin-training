package slides.chpt_062

import kotlin.random.Random

// public inline fun <T, R> T.let(block: (T) -> R): R

fun main() {
    val hashCode = generateStringOrNull()
        ?.let { it.hashCode() } ?: 0
}

fun generateStringOrNull() =
    when (Random.nextBoolean()) {
        true -> "hello!"
        false -> null
    }