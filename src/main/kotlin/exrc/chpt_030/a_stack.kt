package exrc.chpt_030

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatExceptionOfType

class Stack<T> {

    private val _items = mutableListOf<T>()

    fun push(item: T) = _items.add(item)

    fun peek() = _items.last()

    fun pop() = _items.removeLast()

}

fun main() {
    val stack = Stack<String>()
    stack.push("a")
    stack.push("b")
    stack.push("c")
    assertThat(stack.peek()).isEqualTo("c")
    stack.pop()
    assertThat(stack.peek()).isEqualTo("b")
    stack.push("d")
    assertThat(stack.peek()).isEqualTo("d")
    stack.pop()
    stack.pop()
    stack.pop()
    assertThatExceptionOfType(NoSuchElementException::class.java)
        .isThrownBy { stack.pop() }
}