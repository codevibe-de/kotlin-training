@file:Suppress("VariableInitializerIsRedundant")

package chpt_030_ood

fun interface IntPredicate {
    fun accept(n: Int): Boolean
}

fun main() {
    // "KLASSISCH":
    var p: IntPredicate = object : IntPredicate {
        override fun accept(n: Int): Boolean {
            return n % 2 == 0
        }
    }

    // ALTERNATIV:
    p = IntPredicate { n -> n % 2 == 0 }

    // dann:
    p.accept(123)
}