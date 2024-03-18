package slides.chpt_020

fun Int.toBinary(): String {
    return this.toString(2)
}

fun main() {
    println(42.toBinary())
}