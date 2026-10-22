package chpt_040_functional

fun findProducts(items: List<Product>,
    onlyCheap: Boolean, onlyInStock: Boolean, prefix: String?
): List<Product> {
    val result = mutableListOf<Product>()
    for (p in items) {
        if (onlyCheap && p.price >= 10.0) continue
        if (onlyInStock && !p.inStock) continue
        if (prefix != null && !p.name.startsWith(prefix)) continue
        result.add(p)
    }
    return result
}

val r = findProducts(products, true, false, null)
