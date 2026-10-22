package chpt_053.strategy.problem

class PriceCalculator(
    private val customerType: String
) {
    fun price(net: Double): Double =
        when (customerType) {
            "regular" -> net
            "student" -> net * 0.8
            "employee" -> net * 0.7
            else -> error("unknown: $customerType")
        }
}

fun main() {
    val calc = PriceCalculator("studnet")
    println(calc.price(100.0)) // fails at runtime
}
