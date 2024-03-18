package slides.chpt_080

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.SoftAssertions
import org.junit.Test

class MultiAssertTest {

    @Test
    fun `assert multiple facts`() {
        org.junit.jupiter.api.Assertions.assertAll(
            { assertThat(true).isTrue() },
            { assertThat(listOf(1, 2, 3)).contains(3) },
            { assertThat(mapOf("a" to 1, "b" to 2)).containsOnlyKeys("a", "b") },
        )
    }

    @Test
    fun `multi assert with assertj only`() {
        SoftAssertions().apply {
            assertThat(true).isTrue()
            assertThat(listOf(1, 2, 3)).contains(3)
            assertThat(mapOf("a" to 1, "b" to 2)).containsOnlyKeys("a", "b")
        }.assertAll()
    }

}
