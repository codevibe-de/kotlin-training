package chpt_045

fun main() {
    val r: IntRange = 1..3; // 1, 2, 3
    val r2 = 1 until 5 // 1, 2, 3, 4
    val countdown = 10 downTo 0
    println("${countdown.first} ${countdown.last} ${countdown.step}")

    for (c in 'a'..'f') {
        print(c)
    }
}