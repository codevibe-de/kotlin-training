package chpt_080.kotest

import common.Product
import common.ProductRepository
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.mockk
import io.mockk.slot

class ProductRepositoryTest : FunSpec({

    test("findById") {
        // given
        val prodRepo = mockk<ProductRepository>()
        val idSlot = slot<Int>()
        every { prodRepo.findById(capture(idSlot)) } answers {
            Product(id = idSlot.captured, name = "Product with id ${idSlot.captured}")
        }

        // when
        val product = prodRepo.findById(123)

        // then
        product.shouldNotBeNull()
        product.name shouldBe "Product with id 123"
    }

})
