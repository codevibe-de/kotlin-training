package chpt_085

fun main() {
    // okay:
    val number:Number = 123

    // not okay:
    val listOfNumbers: MutableList<Number> = mutableListOf<Int>()
}


class NumberKeyedMap<K : Number, V> : MutableMap<K,V> {

    fun minKey(): K {
    }
}