package chpt_085

class Box<T>(var value: T? = null)

fun main() {
    val b1 = Box("StringBox")
    val b2 = Box(123) // IntBox
}

fun <T> asIdentityMap(a: T): Map<T, T> {
    return mapOf(a to a)
}

// before: result type is fixed
fun createValueToLengthMapNonGeneric(
    s: CharSequence
): Map<CharSequence, Int> = mapOf(s to s.length)

// after: T is kept, bound to CharSequence
fun <T : CharSequence> createValueToLengthMap(
    s: T
): Map<T, Int> = mapOf(s to s.length)

fun main2() {
    val m: Map<String, Int> =
        createValueToLengthMap("Kotlin")
}

fun <T : Number> double(value: T): Double {
    return value.toDouble() * 2
}
