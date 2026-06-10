package chpt_080.kotest

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

// BehaviorSpec: BDD-style given/when/then
class BehaviorSpecTest : BehaviorSpec({

    given("a list of numbers") {
        val numbers = listOf(1, 2, 3, 4, 5)

        `when`("filtering even numbers") {
            val evens = numbers.filter { it % 2 == 0 }

            then("only even numbers remain") {
                evens shouldBe listOf(2, 4)
            }

            then("count is correct") {
                evens.size shouldBe 2
            }
        }

        `when`("summing all numbers") {
            val sum = numbers.sum()

            then("the sum is 15") {
                sum shouldBe 15
            }
        }
    }

})
