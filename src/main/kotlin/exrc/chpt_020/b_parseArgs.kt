package exrc.chpt_020

fun main(args: Array<String>) {
    println("Got ${args.size} argument(s)")
    for (arg in args) {
        val parts = arg.split(":")
        val (value, type) = parts
        val nativeValue = parseString(value, type)
        println("Parsed string `$value` to native value `$nativeValue`")
    }
}

fun parseString(value: String, type: String): Any {
    return when (type) {
        "String" -> value
        "Int" -> value.toInt()
        "Boolean" -> value.toBoolean()
        else -> "UNHANDLED!!"
    }
}
