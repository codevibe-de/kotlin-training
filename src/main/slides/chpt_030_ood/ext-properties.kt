package chpt_030_ood

val List<Any>.lastIndex: Int
    get() = size - 1

fun main() {
    val n = listOf(1, 2, 3).lastIndex
    println(n)  // 2
}
