package chpt_085

class Box<T>(var value: T? = null)

fun main() {
    val b1 = Box("StringBox")
    val someString = b1.value

    val b2 = Box(123) // IntBox
    val someInt = b2.value
}

fun <T> asIdentityMap(a: T): Map<T, T> {
    return mapOf(a to a)
}

// without a bound, T has no length:
// fun <T> longer(a: T, b: T): T =
//     if (a.length >= b.length) a else b  // ❌

// with a bound, T is at least a CharSequence:
fun <T : CharSequence> longer(a: T, b: T): T =
    if (a.length >= b.length) a else b

fun main2() {
    val s: String = longer("cat", "mouse")
    println(s)
}

fun <T : Number> double(value: T): Double {
    return value.toDouble() * 2
}
