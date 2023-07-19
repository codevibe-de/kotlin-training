package slides.chpt_080.mock

import io.mockk.every
import io.mockk.mockk
import io.mockk.slot
import io.mockk.verify
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class ComplexMockTest {

    lateinit var repoMock: ProductRepository
    lateinit var service: ServiceUnderTest

    @BeforeEach
    fun setup() {
        repoMock = mockk<ProductRepository>(relaxed = true)
        // relaxed mock doesn't require us to stub out save()

        val idSlot = slot<Int>()
        every { repoMock.findById(capture(idSlot)) } answers {
            if (idSlot.captured >= 100) {
                null
            } else {
                Product(idSlot.captured, "Sample Product", 1.99)
            }
        }

//        val prdSlot = slot<Product>()
//        every { repoMock.save(capture(prdSlot))} answers { prdSlot.captured }

        service = ServiceUnderTest(repoMock)
    }

    @Test
    fun `tests that product is saved`() {
        // when
        service.createNew(Product(1234, "New Product", 0.01))

        // then
        verify(exactly = 1) { repoMock.findById(1234) }
        verify(exactly = 0) { repoMock.findById(neq(1234)) }
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
        val existingPrd = productRepository.findById(prd.id)
        if (existingPrd == null) {
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

