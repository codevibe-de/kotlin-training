package chpt_080

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class ExceptionTest {
    @Test
    fun `expect exception`() {
        Assertions.assertThatExceptionOfType(IllegalArgumentException::class.java)
            .isThrownBy { bad() }
            .withMessage("uh oh")
    }
}

/**
 * @throws IllegalArgumentException
 */
fun bad() {
    throw IllegalArgumentException("uh oh")
}