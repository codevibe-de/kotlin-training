package chpt_080.kotest

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.assertions.throwables.shouldThrowMessage
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

fun bad() {
    throw IllegalArgumentException("uh oh")
}

// Testing exceptions in Kotest
class ExceptionTest : StringSpec({

    "shouldThrow catches the exception and allows inspection" {
        val ex = shouldThrow<IllegalArgumentException> {
            bad()
        }
        ex.message shouldBe "uh oh"
    }

    "shouldThrowMessage checks message directly" {
        shouldThrowMessage("uh oh") {
            bad()
        }
    }

})
