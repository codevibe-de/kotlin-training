package chpt_080.kotest

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.collections.shouldContain
import io.kotest.matchers.collections.shouldHaveSize
import io.kotest.matchers.maps.shouldContainKey
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import io.kotest.matchers.string.shouldContain
import io.kotest.matchers.string.shouldStartWith

// Kotest provides a rich set of built-in matchers
class MatchersTest : StringSpec({

    "equality matchers" {
        1 + 1 shouldBe 2
        "hello" shouldNotBe "world"
    }

    "string matchers" {
        "Kotlin" shouldStartWith "Kot"
        "Kotlin is great" shouldContain "is"
    }

    "collection matchers" {
        val list = listOf(1, 2, 3)
        list shouldHaveSize 3
        list shouldContain 2
    }

    "map matchers" {
        val map = mapOf("a" to 1, "b" to 2)
        map shouldContainKey "a"
        map["b"] shouldBe 2
    }

})
