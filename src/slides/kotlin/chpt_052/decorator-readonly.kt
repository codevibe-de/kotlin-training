package chpt_052

import chpt_030_ood.delegation.*

class ReadOnlyRepository(
    private val inner: ProductRepository
) : ProductRepository by inner {
    override fun save(p: Product) =
        error("read-only: $p not saved")
    override fun delete(id: Int) =
        error("read-only: $id not deleted")
}

fun main() {
    val db = InMemoryRepository()
    val logged = LoggingRepository(db)
    val demo = ReadOnlyRepository(logged)

    logged.save(Product(1, "Mug"))  // logged
    println(demo.findById(1))       // reads work
    demo.save(Product(2, "Kettle")) // throws
}
