package chpt_080.mock

import io.mockk.every
import io.mockk.mockk
import io.mockk.slot
import io.mockk.verify
import org.assertj.core.api.Assertions
import org.junit.Test
import org.junit.jupiter.api.BeforeEach

class ComplexMockTest {

    lateinit var repoMock: ProductRepository
    lateinit var service: ServiceUnderTest

    @BeforeEach
    fun setup() {
        repoMock = mockk<ProductRepository>()
        val idSlot = slot<Int>()
        every { repoMock.findById(less(1000, true)) } returns null
        every { repoMock.findById(capture(idSlot)) } answers { Product(idSlot.captured, "Sample Product", 1.99) }
        service = ServiceUnderTest(repoMock)
    }

    @Test
    fun `tests that product is saved`() {
        // when
        service.createNew(Product(1, "New Product", 0.01))

        // then
        verify { repoMock.save(any()) }
    }

    @Test
    fun `tests for an exception when product already exists`() {
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
