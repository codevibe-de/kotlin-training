package chpt_080.mock

import common.Product
import common.ProductRepository
import io.mockk.every
import io.mockk.mockk
import io.mockk.slot
import io.mockk.verify
import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class ComplexMockTest {

    lateinit var repoMock: ProductRepository
    lateinit var service: ServiceUnderTest

    @BeforeEach
    fun setup() {
        // relaxed mock doesn't require us to stub out save()
        repoMock = mockk<ProductRepository>(relaxed = true)

        // pretend we have existing products
        val idSlot = slot<Int>()
        every { repoMock.findById(capture(idSlot)) } answers { Product(idSlot.captured, "Sample Product", 1.99f) }
        // but not for ids 100 or more
        every { repoMock.findById(more(100, true)) } returns null

        // capture input Product and return it modified
        val prdSlot = slot<Product>()
        every { repoMock.save(capture(prdSlot)) } answers {
            prdSlot.captured
                .copy(createdMillis = System.currentTimeMillis())
        }

        service = ServiceUnderTest(repoMock)
    }

    @Test
    fun `tests that product is saved`() {
        // when
        val newProduct = service.createNew(Product(1234, "New Product", 0.01f))

        // then
        assertThat(newProduct.createdMillis).isNotNull()
        verify(exactly = 1) { repoMock.findById(1234) }
        verify(exactly = 0) { repoMock.findById(neq(1234)) }
        verify { repoMock.save(any()) }
    }


    @Test
    fun `tests for an exception when product already exists`() {
        // when / then
        Assertions.assertThatExceptionOfType(IllegalStateException::class.java)
            .isThrownBy { service.createNew(Product(1, "New Product", 0.01f)) }
    }
}


class ServiceUnderTest(private val productRepository: ProductRepository) {
    fun createNew(prd: Product): Product {
        val existingPrd = productRepository.findById(prd.id)
        if (existingPrd == null) {
            return productRepository.save(prd)
        } else {
            error("Product with id ${prd.id} already exists")
        }
    }
}

