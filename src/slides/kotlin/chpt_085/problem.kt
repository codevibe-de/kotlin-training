package chpt_085

fun main() {
    val ints: MutableList<Int> = mutableListOf(1, 2, 3)
    // compile error:
//    val numbers: MutableList<Number> = ints
//    numbers.add(1.5)      // fine for a list of numbers …
//    val i: Int = ints[3]  // … but breaks the list of ints
}


//class NumberKeyedMap<K : Number, V> : MutableMap<K,V> {
//
//    fun minKey(): K {
//    }
//}
