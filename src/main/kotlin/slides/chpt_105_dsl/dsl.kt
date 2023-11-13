package slides.chpt_105_dsl

class Items {
    private val _products = mutableListOf<Product>()
    fun product(f: (Product) -> Unit): Product {
        val product = Product()
        _products.add(product)
        return product
    }
}

class Product {
    private var _name: String = ""
    val name: String
        get() = _name

    fun name(n: String) {
        _name = n
    }

    fun id(id: String) {
    }
}

fun items(f: (Items) -> Unit): Items {
    val items = Items()
    f(items)
    return items
}

fun main() {
    items {
        it.product {
            it.name("The Product")
            it.id("123-333")
        }
    }
}