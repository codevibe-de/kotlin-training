package slides.chpt_020

fun main() {
    val a = 3
    val b = 1

    // as expression
    val max = if (a > b) {
        a
    } else {
        b
    }

    // short version as ternary expression
    val max2 = if (a > b) a else b
}