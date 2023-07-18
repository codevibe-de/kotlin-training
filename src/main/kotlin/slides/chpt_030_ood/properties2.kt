package slides.chpt_030_ood

import java.util.*
import kotlin.random.Random

fun main() {
    val sc = ClassWithCustomGetter("tom")
    println(sc.name)
    println(sc.pwd)
    println(sc.pwd)
    MultiConstr("123").happyDays()
    MultiConstr("123", "tom").apply { this.id }

    println(ClassWithGetterSetter().name)
}

class ClassWithGetterSetter {
    var name: String = ""
        // these are the default get/set accessors
        get() {
            return field
        }
        set(value) {
            field = value
        }
}

class ClassWithSetter {
    var name: String = validateName("") // default value
        set(value) {
            field = validateName(value)
        }

    private fun validateName(n: String) =
        if (n.isBlank()) "no-name" else n
}

class NoBacking {
    val dynamicProp: Int
        get() = Random.nextInt()
}

class ClassWithCustomGetter(
    private val internalName: String
) {
    val name: String
        get() = "//" + internalName.uppercase() + """\\"""

    private var _pwd: String = ""
    val pwd: String
        get() {
            if (_pwd == "") {
                _pwd = UUID.randomUUID().toString() // on-demand initialization
            }
            return _pwd
        }
}

class MultiConstr(
    val id: String,
    val name: String,
) {
    constructor(id: String) : this(id, "unnamed")
}

fun MultiConstr.happyDays() {
    println("Your name is ${this.name}")
}

