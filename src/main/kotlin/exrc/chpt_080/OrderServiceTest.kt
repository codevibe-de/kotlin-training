package exrc.chpt_080

import io.mockk.mockk
import io.mockk.verify
import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.data.Offset
import org.assertj.core.data.Offset.offset
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class OrderServiceTest {

    @Test
    fun calculateOrderTotal() {
        // given
        val prd1 = Product("P1", 3.50)
        val prd2 = Product("P2", 4.00)
        val productApiClient = mockk<ProductApiClient>()
        // TODO program mock
        val orderService = OrderService(productApiClient)

        // when
        orderService.calculateOrderTotal(listOf("P1", "P2"))    // expect exception
        val total = orderService.calculateOrderTotal(listOf("P1", "P2")) // expect correct total

        // then
        assertThat(total).isCloseTo(7.50, offset(0.1))
        // TODO verify mock
    }
}