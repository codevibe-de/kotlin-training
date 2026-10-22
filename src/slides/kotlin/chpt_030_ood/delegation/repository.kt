package chpt_030_ood.delegation

data class Product(val id: Int, val name: String)

interface ProductRepository {
    fun findAll(): List<Product>
    fun findById(id: Int): Product?
    fun save(p: Product)
    fun delete(id: Int)
}

class InMemoryRepository : ProductRepository {
    private val products = mutableMapOf<Int, Product>()
    override fun findAll() = products.values.toList()
    override fun findById(id: Int) = products[id]
    override fun save(p: Product) {
        products[p.id] = p
    }
    override fun delete(id: Int) {
        products.remove(id)
    }
}
