package exrc.chpt_020

fun main(args: Array<String>) {
    println("Got ${args.size} argument(s)")
    for (arg in args) {
        val parts = arg.split(":")
        val (value, type) = parts
        val nativeValue = parseStringWithCatch(value, type)
        println("Parsed string `$value` to native value `$nativeValue`")
    }
}

fun parseStringWithCatch(value: String, type: String): Any {
    return when (type) {
        "String" -> value
        "Int" -> try {
            value.toInt()
        } catch (e: NumberFormatException) {
            "???"
        }

        "Boolean" -> value.toBoolean()
        else -> "UNHANDLED!!"
    }
}
