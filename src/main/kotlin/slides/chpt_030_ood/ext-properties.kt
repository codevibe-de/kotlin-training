package slides.chpt_030_ood

val List<Any>.lastIndex: Int
    get() = size - 1

fun main() {
    listOf(1, 2, 3)
        .lastIndex
        .also { println(it) }
}
