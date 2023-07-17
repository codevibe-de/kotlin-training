package slides.chpt_040_functional

val isEven: Int.() -> Boolean = { this % 2 != 0 }

fun main() {
    println(3.isEven())
    println(42.isEven())
}
