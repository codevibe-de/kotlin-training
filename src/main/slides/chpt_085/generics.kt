package chpt_085

class Box<T>(var value: T? = null)

fun main() {
    val b1 = Box("StringBox")
    val b2 = Box(123) // IntBox
}

fun <T> asIdentityMap(a: T): Map<T, T> {
    return mapOf(a to a)
}

fun <N : Number> addAsInt(a: N, b: N): Int {
    return a.toInt() + b.toInt()
}

fun <T : Number> double(value: T): Double {
    return value.toDouble() * 2
}
