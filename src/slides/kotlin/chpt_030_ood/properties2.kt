package chpt_030_ood

import kotlin.random.Random

fun main() {
    val sc = SubClass()
    sc.property = "abc"
    println(sc.property)    // ABCX

    println(ClassWithSetter(" ").name)    // no-name
    println(ClassWithSetter("Tom").name)  // Tom
}

class ClassWithGetterSetter {
    var name: String = ""
}


class NoBacking {
    val dynamicProp: Int
        get() = Random.nextInt()
}


class ClassWithSetter(name: String) {
    var name: String = ""
        set(value) {
            field = validateName(value)
        }

    init {
        this.name = name // runs through the setter
    }

    private fun validateName(n: String) =
        if (n.isBlank()) "no-name" else n
}


class ClassWithSetter2(name:String) {
    var name: String = validateName(name) // default value
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