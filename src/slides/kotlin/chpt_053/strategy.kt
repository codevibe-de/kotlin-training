package chpt_053

object CaseTypes {
    val uppercase = fun(s: String): String {
        return s.uppercase()
    }
    val snakecase = fun(s: String): String {
        return s.split(Regex("""[\-\s_]""")).joinToString("-").lowercase()
    }
    val camelcase = fun(s: String): String {
        return s.split(Regex("""[\-\s_]"""))
            .map { w -> w.lowercase() }
            .map { w -> w.replaceFirstChar { c -> c.uppercase() } }
            .joinToString("")
    }
}

class PropertyFormatter(
    private val caseStrategy: (String) -> String
) {
    fun format(propName: String): String {
        val prefix = propName.substringBeforeLast(".")
        val name = propName.substringAfterLast(".")
        return prefix + "." + caseStrategy(name)
    }
}

fun main() {
    val formatter = PropertyFormatter(CaseTypes.snakecase)
    val propName = formatter.format("app.data.complex-name_with Stuff")
    println(propName)
}