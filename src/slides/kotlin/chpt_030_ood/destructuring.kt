package chpt_030_ood


data class ResultAndHint(val res: Int, val msg: String)


fun main() {
    val resultAndHint = ResultAndHint(12, "12 warnings")
    val (r, m) = resultAndHint

    // same as:
    val r2 = resultAndHint.component1()
    val m2 = resultAndHint.component2()

    //
    val (_, justTheHint) = resultAndHint

    withoutDataClass()
}


// destructuring without a data class
class Point(val x: Int, val y: Int) {
    operator fun component1() = x
    operator fun component2() = y
}

fun withoutDataClass() {
    val (x, y) = Point(3, 4)
    println("x=$x, y=$y")  // x=3, y=4

    // the stdlib adds them to Map.Entry
    // as extension functions
    for ((key, value) in mapOf("a" to 1)) {
        println("$key -> $value")  // a -> 1
    }
}


fun more() {
    val map = mapOf("1" to 1)
    for ((k, v) in map) {
        println(k + v)
    }
}