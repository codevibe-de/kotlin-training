package slides.chpt_060

fun main() {
    unsafeCast(1) // java.lang.ClassCastException
    safeCast(1)
    unsafeCastToNull(1) // java.lang.ClassCastException
    safeCastToNull(1)
}

fun unsafeCast(obj: Any) {
    val s: String = obj as String
    println(s)
}

fun safeCast(obj: Any) {
    val s: String? = obj as? String
    println(s)
}

fun unsafeCastToNull(obj: Any?) {
    val s: String? = obj as String?
    println(s)
}

fun safeCastToNull(obj: Any?) {
    val s: String? = obj as? String? // null if input was null or not of type String
    println(s)
}