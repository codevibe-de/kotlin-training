package chpt_030_ood

open class Base {
    open fun foo() {
        println("foo")
    }
}

class Sub : Base() {
    override fun foo() {
        println("other foo")
    }
}

fun main() {
    Base().foo()
    Sub().foo()
}
