package chpt_020

fun main() {
    val x = "a"
    when (x) {
        "abc" -> print("some string")
        "a", "b", "c" -> print("a single letter string")
        42.toString() -> print("42 as string")
    }

    // checking for number ranges
    when (val n = (0..10).random()) {
        in 0..9 -> print("no luck")
        10 -> print("bingo!")
        else -> print("weird")
    }

    // types
    val something: Any = "foo"
    when (something) {
        is String -> something.startsWith("prefix")
        else -> false
    }
}

enum class Bit {
    ZERO, ONE
}

val numericValue = when (getRandomBit()) {
    Bit.ZERO -> 0
    Bit.ONE -> 1
    // 'else' is not required because all cases are covered
}

fun getRandomBit(): Bit = Bit.ZERO
