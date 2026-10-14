package chpt_040_functional

fun main() {
    listOf("Hey", "Joe", "!")
        .filter { it.length > 1 }
        .map { it.uppercase() }
        .forEach { println(it) }

    val otherList: List<Int> = listOf(1, 2, 3)
        .filter { it % 2 == 0 }
}