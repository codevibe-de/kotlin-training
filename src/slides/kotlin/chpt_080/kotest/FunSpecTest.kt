package chpt_080.kotest

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

// FunSpec: closest to JUnit style, supports nested contexts
class FunSpecTest : FunSpec({

    test("simple integer division") {
        val res = 10 / 5
        res shouldBe 2
    }

    context("string operations") {
        test("length is correct") {
            "hello".length shouldBe 5
        }

        test("uppercase works") {
            "hello".uppercase() shouldBe "HELLO"
        }
    }

})
