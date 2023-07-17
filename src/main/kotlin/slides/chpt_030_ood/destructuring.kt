package slides.chpt_030_ood

fun main() {
    val (r, m) = calculate()
}

fun calculate() = ResultAndHint(123, "12 warnings, 2 errors")

data class ResultAndHint(val res:Int, val msg:String)

fun more() {
    val map = mapOf("1" to 1)
    for ((k,v) in map) {
        println(k+v)
    }
}