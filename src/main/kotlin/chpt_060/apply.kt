package chpt_060

// public inline fun <T> T.apply(block: T.() -> Unit): T

class ProductBuilder {
    private var name: String = "unnamed"
    private var priceInCent: Int = 0

    fun name(s: String) = this.apply { name = s }

    fun priceInCent(n: Int) = this.apply { priceInCent = n }

    fun build() = Product(name, priceInCent)
}

data class Product(val name: String, val priceInCent: Int)

fun main() {
    val prd = ProductBuilder().priceInCent(199).build()
}

// ----------------------

fun arrayOfMinusOnes(size: Int) =
    IntArray(size).apply { fill(-1) }