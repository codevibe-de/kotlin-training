package chpt_060

// public inline fun <T> T.also(block: (T) -> Unit): T

fun main() {
    val numbers = mutableListOf("one", "two", "three")
    numbers
        .also { println("The list elements before adding new one: $it") }
        .add("four")
}