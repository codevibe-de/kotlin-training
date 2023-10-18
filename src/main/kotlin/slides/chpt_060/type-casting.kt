package slides.chpt_060

fun main() {
    unsafeCast(1) // java.lang.ClassCastException
    safeCast(1)
    safeCastToNull(null)
}

fun unsafeCast(obj: Any) {
    val s: String = obj as String
    println(s)
}

fun safeCast(obj: Any) {
    val s: String? = obj as? String
    println(s)
}

fun safeCastToNull(obj: Any?) {
    val s: String? = obj as String?
    println(s)
}