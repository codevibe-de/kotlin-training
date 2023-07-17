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

    println(SimpleSetter().name)
}

class SimpleSetter {
    var name: String = ""
        // these are the default get/set accessors
        get() {
            return field
        }
        set(value) {
            field = value
        }
}

class SimpleSetter2 {
    var name: String = ""   // default required
        set(value) {
            field = if (value.isBlank()) "no-name" else name
        }

    init {
        name = ""   // trigger logic in set()
    }
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

