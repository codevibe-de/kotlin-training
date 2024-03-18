package chpt_040_functional

val isEven: Int.() -> Boolean = { this % 2 != 0 }

fun main() {
    println(3.isEven())
    println(42.isEven())
}


fun buildString(actions: StringBuilder.() -> Unit): String {
    val builder = StringBuilder()
    builder.actions()
    return builder.toString()
}

val str = buildString {
    append("Hello")
    append(" ")
    append("world")
}