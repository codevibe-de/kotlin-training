package chpt_030_ood

import java.util.*

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

fun main() {
    val sc = ClassWithCustomGetter("tom")
    println(sc.name)
    println(sc.pwd)
    println(sc.pwd)
    MultiConstr("123").id
    MultiConstr("123", "tom").apply { this.id }
}