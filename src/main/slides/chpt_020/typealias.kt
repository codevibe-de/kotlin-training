package slides.chpt_020

typealias Centimeter = Int

fun Centimeter.toMeter(): Float {
    return this / 100.0f
}

fun main() {
    val lengthInCm: Centimeter = 100
    println(lengthInCm.toMeter())

    val n: Int = 100
    println(lengthInCm.toMeter()) // works, too
}

