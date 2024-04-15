package chpt_030_ood

import kotlin.random.Random

fun main() {
    val sc = SubClass()
    sc.property = "abc"
    println(sc.property)    // ABCX
}

class ClassWithGetterSetter {
    var name: String = ""
}


class NoBacking {
    val dynamicProp: Int
        get() = Random.nextInt()
}


class ClassWithSetter {
    var name: String = validateName("") // default value
        set(value) {
            field = validateName(value)
        }

    private fun validateName(n: String) =
        if (n.isBlank()) "no-name" else n
}


open class BaseClass {
    open var property: String = "default"
        set(v: String) {
            field = if (v.isBlank()) "default" else v
        }
}

class SubClass : BaseClass() {
    override var property: String
        get() = super.property + "X"
        set(value) {
            super.property = value.uppercase()
        }
}