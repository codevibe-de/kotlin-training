package chpt_085

import kotlin.reflect.KClass

val beans:MutableMap<KClass<*>, Any> = mutableMapOf()

fun storeBean(instance:Any) {
    beans[instance::class] = instance
}

inline fun <reified T> getBean(): T? {
    return beans[T::class] as T?
}

fun main() {
//    storeBean()
    println(getBean<Int>())
}



