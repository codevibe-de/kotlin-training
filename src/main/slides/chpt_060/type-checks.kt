package chpt_060

fun main() {
    println(toBoolean("yes"))
    println(toBoolean(1))
}

fun negate(obj: Any?): Boolean {
    if (obj is Boolean) {
        return obj.not()    // call Boolean function
    } else {
        return false
    }
}

fun toBoolean(obj: Any?): Boolean {
    return when (obj) {
        null -> false
        is Boolean -> obj
        is String -> obj.lowercase() in listOf("true", "yes", "okay")
        is Int -> obj != 0
        else -> false
    }
}