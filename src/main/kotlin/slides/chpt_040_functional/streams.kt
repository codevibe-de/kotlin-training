package chpt_040_functional

fun main() {
    listOf("Hey", "Joe", "!")
        .filter { s -> s.length > 1 }
        .map { s -> s.uppercase() }
        .forEach { s -> println(s) }

    val otherList: List<Int> = listOf(1, 2, 3)
        .filter { n -> n % 2 == 0 }
}