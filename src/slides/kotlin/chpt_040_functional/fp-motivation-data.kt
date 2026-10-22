package chpt_040_functional

data class Product(
    val name: String,
    val price: Double,
    val inStock: Boolean
)

val products = listOf(
    Product("Kettle", 29.99, true),
    Product("Knife", 8.50, false),
    Product("Mug", 4.99, true),
    Product("Toaster", 39.00, true)
)
