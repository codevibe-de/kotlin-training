package chpt_080.mock

import io.mockk.every
import io.mockk.mockk
import io.mockk.slot
import org.assertj.core.api.Assertions
import org.junit.Test

class ComplexMockTest {

    @Test
    fun `tests a complex mock`() {
        // given
        val repoMock = mockk<ProductRepository>()
        val idSlot = slot<Int>()
        every { repoMock.findById(less(1000, true)) } returns null
        every { repoMock.findById(capture(idSlot)) } returns Product(idSlot.captured, "Sample Product", 1.99)
        val service = ServiceUnderTest(repoMock)

        // when / then
        Assertions.assertThatExceptionOfType(IllegalStateException::class.java)
            .isThrownBy { service.createNew(Product(1, "New Product", 0.01)) }
    }
}

interface ProductRepository {
    fun findById(id: Int): Product?
    fun save(product: Product)
}

class ServiceUnderTest(private val productRepository: ProductRepository) {
    fun createNew(prd: Product) {
        if (productRepository.findById(prd.id) == null) {
            productRepository.save(prd)
        } else {
            throw IllegalStateException("Product with id ${prd.id} already exists")
        }
    }
}

data class Product(
    val id: Int,
    val title: String,
    val price: Double
)
