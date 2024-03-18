package chpt_040_functional

fun main() {
    val sc = SuperConsumer { n, s -> println("$n-$s") }
    sc.consume(42, "foo")

    val sc2: (Int, String) -> Unit = { _, s -> println(s) }
    sc2(1, "aa")
}

// note the "fun" before "interface"
fun interface SuperConsumer {
    fun consume(n: Int, s: String)
}