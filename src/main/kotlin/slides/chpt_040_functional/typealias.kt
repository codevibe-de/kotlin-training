package slides.chpt_040_functional

typealias StringPredicate = (String) -> Boolean

fun main() {
    val pred: StringPredicate = { s -> s.length > 3 }

    println(pred(""))
    println(pred("abc"))
    println(pred("abcdef"))
}