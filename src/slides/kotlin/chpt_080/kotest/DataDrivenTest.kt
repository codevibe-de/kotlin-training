package chpt_080.kotest

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

// Data-driven testing: Kotest alternative to JUnit @ParameterizedTest
// In Kotest 6.x, data-driven testing is part of the core framework
data class SquareTestCase(val input: Int, val expected: Int)

class DataDrivenTest : FunSpec({

    context("squares") {
        withTests(
            SquareTestCase(1, 1),
            SquareTestCase(2, 4),
            SquareTestCase(3, 9),
            SquareTestCase(4, 16),
            SquareTestCase(5, 25),
        ) { (input, expected) ->
            input * input shouldBe expected
        }
    }

})
