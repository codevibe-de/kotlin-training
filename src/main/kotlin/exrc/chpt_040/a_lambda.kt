package exrc.chpt_040

val consumer = { s: String -> println(s) }
val mapper = { n: Int -> n.toString(2) }

fun main() {
    process(42)
}

fun process(n: Int) {
    consumer(
        mapper(n)
    )
}