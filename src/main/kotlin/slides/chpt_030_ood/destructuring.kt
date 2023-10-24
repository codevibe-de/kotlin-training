package slides.chpt_030_ood


data class ResultAndHint(val res: Int, val msg: String)


fun main() {
    val resultAndHint = ResultAndHint(12, "12 warnings")
    val (r, m) = resultAndHint

    // same as:
    val r2 = resultAndHint.component1()
    val m2 = resultAndHint.component2()

    //
    val (_, justTheHint) = resultAndHint
}



fun more() {
    val map = mapOf("1" to 1)
    for ((k, v) in map) {
        println(k + v)
    }
}