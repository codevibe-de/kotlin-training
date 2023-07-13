package chpt_080

import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.assertAll
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import java.util.function.Supplier

@DisplayName("aksdakljds")
@ExtendWith(MockKExtension::class)
class SimpleTest {

    @MockK
    private lateinit var prd: Supplier<String>

    @Test
    @Tag("just")
    @Tag("foo")
    fun `just a test`() {
        every { prd.get() } returns "abc"

        assertAll(
            { assertThat(true).isTrue() },
            { assertThat(prd.get()).isEqualTo("abc") },
        )
    }
}