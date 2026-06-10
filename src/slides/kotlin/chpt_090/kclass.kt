package chpt_090

import kotlin.reflect.KClass
import kotlin.reflect.full.functions
import kotlin.reflect.full.memberProperties

class X

fun main() {
    val clazz: Class<X> = X::class.java
    clazz.constructors
    clazz.methods
    clazz.fields
    // etc

    val kclazz: KClass<X> = X::class
    kclazz.constructors
    kclazz.functions
    kclazz.memberProperties
    // etc
}