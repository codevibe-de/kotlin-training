package exrc.chpt_080

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.catchException
import org.assertj.core.data.Offset.offset
import org.junit.jupiter.api.Test

class OrderServiceTest {

    @Test
    fun calculateOrderTotal() {
        // given
        val prd1 = Product("P1", 3.50)
        val prd2 = Product("P2", 4.00)
        val productApiClient = mockk<ProductApiClient>()
        every { productApiClient.getProduct(prd1.id) } returns prd1
        every { productApiClient.getProduct(prd2.id) } returns prd2
        every { productApiClient.isAvailable() } returnsMany listOf(false, true)

        val orderService = OrderService(productApiClient)

        // when
        catchException { orderService.calculateOrderTotal(listOf("P1", "P2")) }    // expect exception
        val total = orderService.calculateOrderTotal(listOf("P1", "P2")) // expect correct total

        // then
        assertThat(total).isCloseTo(7.50, offset(0.1))
        verify(exactly = 1) { productApiClient.getProduct(prd1.id) }
        verify(exactly = 1) { productApiClient.getProduct(prd2.id) }
        verify(exactly = 2) { productApiClient.isAvailable() }
    }
}