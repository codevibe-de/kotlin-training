package slides.chpt_030_ood

import kotlin.reflect.KProperty

class SomeNamedObject {
    val name: String by NameRegistry
}

object NameRegistry {
    private val names = mutableMapOf<Any, String>()

    operator fun getValue(inst: Any, property: KProperty<*>): String {
        return names[inst] ?: "unnamed"
    }

    fun registerName(inst: Any, name: String) {
        names[inst] = name
    }
}

fun main() {
    val namedObject = SomeNamedObject()
    println(namedObject.name)
    NameRegistry.registerName(namedObject, "My Name!!")
    println(namedObject.name)
}