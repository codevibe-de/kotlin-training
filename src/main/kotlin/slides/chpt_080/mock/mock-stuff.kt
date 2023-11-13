package slides.chpt_080.mock

import io.mockk.every
import io.mockk.just
import io.mockk.mockk
import io.mockk.runs

fun main() {
    val service = mockk<TestableService>()

    // same effect ("do nothing"):
    every { service.printNames(any()) } returns Unit
    every { service.printNames(any()) } answers { }
    every { service.printNames(any()) } just runs

    // calls actual implementation:
    every { service.printNames(match { "John" in it }) } answers { callOriginal() }

    service.printNames(listOf("a", "b"))
    service.printNames(listOf("John", "Jenny"))
}

class TestableService {
    fun printNames(names: List<String>): Unit {
        names.forEach { println(it) }
    }
}