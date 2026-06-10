package chpt_080

import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class TaggedTest {

    @Test
    @Tag("simple")
    @Tag("e2e")
    fun test1() {
    }

    @Test
    @Tag("complex")
    @Tag("e2e")
    fun test2() {
    }

    @Test
    @Tag("simple")
    @Tag("unit")
    fun test3() {
    }
}