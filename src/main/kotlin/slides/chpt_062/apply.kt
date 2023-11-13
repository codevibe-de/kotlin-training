package slides.chpt_062

// public inline fun <T> T.apply(block: T.() -> Unit): T

data class Product(val name: String, val price: Double)


class ProductBuilder {
    private var name: String = "unnamed"
    private var price: Double = 0.0

    fun name(s: String) = this.apply { name = s }
    fun priceInCent(n: Int) = this.apply { price = n / 100.0 }

    fun build() = Product(name, price)
}


fun main() {
    val prd = ProductBuilder()
        .priceInCent(199)
        .build()
}

// ----------------------

fun arrayOfMinusOnes(size: Int) =
    IntArray(size).apply { fill(-1) }