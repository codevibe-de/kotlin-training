package chpt_080.mock

import io.mockk.every
import io.mockk.mockk
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.util.function.Supplier

class SimpleMockTest {

    @Test
    fun `tests a simple mock`() {
        // given
        val mock = mockk<Supplier<String>>()
        every { mock.get() } returns "abc"

        // when
        val result = mock.get()

        // then
        assertThat(result).isEqualTo("abc")
    }
}