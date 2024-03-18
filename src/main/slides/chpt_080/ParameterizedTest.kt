package chpt_080

import org.assertj.core.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class ParameterizedTest {

    @ParameterizedTest
    @MethodSource("testSquaresParams")
    fun testSquares(input: Int, expected: Int) {
        Assertions.assertThat(input * input).isEqualTo(expected)
    }

    companion object {
        @JvmStatic  // since JUnit performs static lookup
        fun testSquaresParams() = listOf(
            Arguments.of(1, 1),
            Arguments.of(2, 4)
        )
    }

}