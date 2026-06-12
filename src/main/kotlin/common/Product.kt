package common

data class Product(
    val id: Int,
    val name: String = id.toString(),
    val price: Float = 0.00f,
    var createdMillis: Long? = null, // set when saved
)


interface ProductRepository {
    fun findById(id: Int): Product?
    fun save(p: Product): Product
}