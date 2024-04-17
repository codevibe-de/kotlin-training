package exrc.chpt_080

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Tag
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class FactorialCalculatorTest {

    @Tag("essential")
    @ParameterizedTest
    @MethodSource("factorialParams")
    fun factorial(n: Int, expected: Int) {
        // when
        val actual = FactorialCalculator().factorial(n)

        // then
        assertThat(actual).isEqualTo(expected)
    }

    companion object {
        @JvmStatic
        fun factorialParams(): List<Arguments> {
            return listOf(
                Arguments.of(0, 1),
                Arguments.of(1, 1),
                Arguments.of(2, 2),
                Arguments.of(3, 6),
                Arguments.of(4, 24),
                Arguments.of(5, 120),
            )
        }
    }

}