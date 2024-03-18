package chpt_080.mock

import io.mockk.every
import io.mockk.spyk

fun main() {
    val someService = spyk(SomeService())
    every { someService.foo(more(10, true)) } returns "mocked"
    every { someService.foo(100) } answers { callOriginal() }

    println(someService.foo()) // original
    println(someService.foo(10)) // mocked
    println(someService.foo(100)) // original
    println(someService.foo(101)) // mocked
}


private class SomeService {
    fun foo(n: Int = 0) = "original"
}