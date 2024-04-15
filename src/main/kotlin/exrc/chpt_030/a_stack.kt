package exrc.chpt_030

import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class Stack<T>(
    private val items: MutableList<T> = mutableListOf()
) {
    fun push(item: T) = items.add(item)
    fun peek() = items.last()
    fun pop() = items.removeLast()
}

fun main() {
    val stack = Stack() // oder Stack<String>()
    stack.push("a")
    stack.push("b")
    stack.push("c")
    assertEquals("c", stack.peek())
    stack.pop()
    assertEquals("b", stack.peek())
    stack.push("d")
    assertEquals("d", stack.peek())
    stack.pop()
    stack.pop()
    stack.pop()
    assertFailsWith<NoSuchElementException> { stack.pop() }
}