package chpt_030_ood

fun <T> List<T>.middle(): T? {
    return if (this.size == 0)
        null
    else
        this[this.size / 2]
}

fun main() {
    val middleItem = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9).middle()
    println(middleItem) // 5
}