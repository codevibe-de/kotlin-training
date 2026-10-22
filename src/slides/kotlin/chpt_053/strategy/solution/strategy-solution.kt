package chpt_053.strategy.solution

typealias Discount = (Double) -> Double

val regular: Discount = { it }
val student: Discount = { it * 0.8 }
val employee: Discount = { it * 0.7 }

class PriceCalculator(private val discount: Discount) {
    fun price(net: Double) = discount(net)
}

fun main() {
    println(PriceCalculator(student).price(100.0))
    val blackFriday = PriceCalculator { it * 0.5 }
    println(blackFriday.price(100.0))
}
