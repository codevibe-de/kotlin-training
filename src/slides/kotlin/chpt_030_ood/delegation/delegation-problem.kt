package chpt_030_ood.delegation

class ManualLoggingRepository(
    private val inner: ProductRepository
) : ProductRepository {
    override fun findAll() = inner.findAll()
    override fun findById(id: Int) = inner.findById(id)
    override fun delete(id: Int) = inner.delete(id)
    override fun save(p: Product) {
        println("saving $p")
        inner.save(p)
    }
}
