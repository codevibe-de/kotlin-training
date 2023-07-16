package slides.chpt_030_ood

inline fun <T> List<T>.replaceWithNulls(predicate: (T) -> Boolean): List<T?> {
   return this
        .map { if (predicate(it)) null else it }
        .toList()
}

fun main() {
    listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        .replaceWithNulls { n -> n % 3 == 0 }
        .also { println(it) }
}