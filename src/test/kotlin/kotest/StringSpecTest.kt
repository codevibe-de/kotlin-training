package chpt_080.kotest

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

// StringSpec: the simplest Kotest style
// each test is just a string and a lambda
class StringSpecTest : StringSpec({

    "simple integer division" {
        val res = 10 / 5
        res shouldBe 2
    }

    "string length" {
        "hello".length shouldBe 5
    }

})
