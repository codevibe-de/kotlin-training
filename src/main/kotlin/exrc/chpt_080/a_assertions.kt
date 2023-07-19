package exrc.chpt_080

class FactorialCalculator() {

    fun factorial(n: Int): Int {
        return when {
            n < 0 -> throw IllegalArgumentException("n is < 0")
            n == 0 -> 0
            n == 1 -> 1
            else -> factorial(n - 1) * n
        }
    }
}

fun main() {
    println(FactorialCalculator().factorial(3))
}