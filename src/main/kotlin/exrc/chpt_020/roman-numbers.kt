package exrc.chpt_020

fun main() {
    println(romanToInt("I"))
    println(romanToInt("II"))
    println(romanToInt("LXIV"))
    println(romanToInt("XCIX"))
    println(romanToInt("MCMIX"))
}

private fun romanToInt(roman:String): Int {
    var result = 0
    var prevValue: Int? = null
    for (c in roman.toCharArray()) {
        val value = valueOf(c)
        if (prevValue != null && value > prevValue) {
            result -= prevValue * 2
        }
        result += value
        prevValue = value
    }
    return result
}

fun valueOf(c: Char): Int {
    return when(c) {
        'M' -> 1000
        'C' -> 100
        'L' -> 50
        'X' -> 10
        'V' -> 5
        'I' -> 1
        else -> throw IllegalArgumentException(c.toString())
    }

}
