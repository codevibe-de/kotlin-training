package exrc.chpt_020

fun main() {
    println(addUp(3))
    println(addUp(10))
    println(addUp(100))
}

// a solution without using lambdas
fun addUp(limit: Int): Int {
    var result = 0
    for (n in 1 until limit) {
        result += if (n % 3 == 0 || n % 5 == 0) n else 0
    }
    return result
}
