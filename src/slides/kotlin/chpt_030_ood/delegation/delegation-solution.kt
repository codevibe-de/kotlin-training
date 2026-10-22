package chpt_030_ood.delegation

class LoggingRepository(
    private val inner: ProductRepository
) : ProductRepository by inner {
    override fun save(p: Product) {
        println("saving $p")
        inner.save(p)
    }
}

fun main() {
    val repo = LoggingRepository(InMemoryRepository())
    repo.save(Product(1, "Mug"))  // saving …
    println(repo.findById(1))     // just forwarded
}
