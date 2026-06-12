package chpt_080.kotest

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

// ShouldSpec: uses "should" as the test keyword, supports nesting
class ShouldSpecTest : ShouldSpec({

    should("calculate sum correctly") {
        listOf(1, 2, 3).sum() shouldBe 6
    }

    context("a map") {
        val map = mapOf("a" to 1, "b" to 2)

        should("have the correct size") {
            map.size shouldBe 2
        }

        should("return values by key") {
            map["a"] shouldBe 1
        }
    }

})
