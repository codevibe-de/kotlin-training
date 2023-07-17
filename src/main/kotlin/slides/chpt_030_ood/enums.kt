package slides.chpt_030_ood

import java.util.function.BiFunction
import java.util.function.BinaryOperator

enum class Priority {
    LOW, MEDIUM, HIGH, OH_MY_GOD
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

//fun main() {
//    val prio = Priority.valueOf("HIGH")
//
//    println(Color.GREEN)
//    println(Color.GREEN.name)
//    println(Color.GREEN.ordinal)
//    println(Color.GREEN.rgb)
//}

enum class OperatorType : BinaryOperator<Int> {
    SUM {
        override fun apply(t: Int, u: Int) = t + u
    },
    PRODUCT {
        override fun apply(t: Int, u: Int) = t * u
    },
}

fun main() {
    val f: BiFunction<Int, Int, Int> = OperatorType.SUM
    f.apply(3,5)
}