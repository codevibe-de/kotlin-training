package slides.chpt_080.mock

import io.mockk.every
import io.mockk.spyk

fun main() {
    val someService = spyk(SomeService())
    every { someService.foo(more(10, true)) } returns "mocked"
    every { someService.foo(100) } answers { callOriginal() }

    println(someService.foo())
    println(someService.foo(10))
    println(someService.foo(100))
}


private class SomeService {
    fun foo(n: Int = 0) = "original"
}