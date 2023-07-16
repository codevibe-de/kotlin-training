package chpt_040_functional

typealias StringPredicate = (String) -> Boolean

fun main() {
    val p: StringPredicate = { s -> s.length > 3 }
}