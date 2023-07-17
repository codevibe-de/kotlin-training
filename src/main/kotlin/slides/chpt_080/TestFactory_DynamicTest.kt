package slides.chpt_080

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory

class TestFactory_DynamicTest {

    @TestFactory
    fun testSquares(): List<DynamicTest> {
        return listOf(
            1 to 1,
            2 to 4,
            3 to 9,
            4 to 16,
            5 to 25,
        ).map { (input, expected) ->
            DynamicTest.dynamicTest("when I calculate $input^2 then I get $expected") {
                Assertions.assertThat(input * input).isEqualTo(expected)
            }
        }
    }
}