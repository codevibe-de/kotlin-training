package slides.chpt_051

class Stack<T> {
    fun push(item:T) { }
}

fun <T> stackOf(vararg elements:T): Stack<T> {
    val stack = Stack<T>()
    for (e in elements) stack.push(e)
    return stack
}


fun main() {
    stackOf("abc", "def")
}