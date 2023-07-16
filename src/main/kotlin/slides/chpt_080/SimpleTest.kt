package chpt_080

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class SimpleTest {

    @Test
    fun `simple integer division`() {
        // given
        val a = 10
        val b = 5

        // when
        val res = a / b

        // then
        Assertions.assertThat(res).isEqualTo(2)
    }

}