@file:Suppress("VariableInitializerIsRedundant")

package chpt_030_ood

fun interface IntPredicate {
    fun accept(n: Int): Boolean
}

fun main() {
    // "CLASSIC":
    var p: IntPredicate = object : IntPredicate {
        override fun accept(n: Int): Boolean {
            return n % 2 == 0
        }
    }

    // ALTERNATIVE:
    p = IntPredicate { it % 2 == 0 }

    // then:
    p.accept(123)
}