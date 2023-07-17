package slides.chpt_030_ood

fun interface IntPredicate {
    fun accept(n: Int): Boolean
}

fun main() {
    val p1 = object : IntPredicate {
        override fun accept(n: Int): Boolean {
            return n % 2 == 0
        }
    }

    val p2 = IntPredicate{ n -> n % 2 == 0}
}