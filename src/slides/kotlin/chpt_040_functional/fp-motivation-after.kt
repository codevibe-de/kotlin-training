package chpt_040_functional

fun findProducts(
    items: List<Product>,
    matches: (Product) -> Boolean
): List<Product> {
    val result = mutableListOf<Product>()
    for (p in items) {
        if (matches(p)) result.add(p)
    }
    return result
}

fun main() {
    findProducts(products, { p -> p.price < 10.0 })
    findProducts(products, { p -> p.inStock })
    findProducts(products, { p -> p.name.startsWith("K") })
}
