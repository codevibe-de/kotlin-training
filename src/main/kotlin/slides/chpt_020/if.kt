package chpt_020

fun main() {
    val a = 3
    val b = 1
    var max: Int

    // with else
    if (a > b) {
        max = a
    } else {
        max = b
    }

    // as expression
    max = if (a > b) a else b
}