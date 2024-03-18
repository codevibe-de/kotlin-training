package chpt_080

import org.assertj.core.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class ParameterizedCsvTest {

    @ParameterizedTest
    @CsvSource(
        "1, 1",
        "2, 4",
        "3, 9"
    )
    fun testSquares(input: Int, expected: Int) {
        Assertions.assertThat(input * input).isEqualTo(expected)
    }

}