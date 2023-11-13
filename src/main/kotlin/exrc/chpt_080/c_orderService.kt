package exrc.chpt_080

interface ProductApiClient {
    fun isAvailable(): Boolean
    fun getProduct(id: String): Product
}

data class Product(
    val id: String,
    val price: Double
)

class OrderService(private val productApiClient: ProductApiClient) {
    fun calculateOrderTotal(productIds: List<String>): Double {
        // check client
        if (!productApiClient.isAvailable()) {
            throw IllegalStateException("API-Client not available")
        }
        // TODO calculate total by adding each product's price
        return 0.0
    }
}
