package exrc.chpt_030

fun main() {
    println(romanToInt("I"))
    println(romanToInt("II"))
    println(romanToInt("LXIV"))
    println(romanToInt("XCIX"))
    println(romanToInt("MCMIX"))
}

private fun romanToInt(roman: String): Int {
    var result = 0
    var prevValue: Int = -1
    for (c in roman.toCharArray()) {
        val value = valueOf(c)
        result += value

        // subtraction rule -- if we were preceded by a smaller value then it should have been subtracted
        // so undo addition and add subtraction by removing its value twice
        if (prevValue != -1 && value > prevValue) {
            result -= prevValue * 2
        }
        prevValue = value
    }
    return result
}

fun valueOf(c: Char): Int {
    return when (c) {
        'M' -> 1000
        'C' -> 100
        'L' -> 50
        'X' -> 10
        'V' -> 5
        'I' -> 1
        else -> throw IllegalArgumentException(c.toString())
    }
}
