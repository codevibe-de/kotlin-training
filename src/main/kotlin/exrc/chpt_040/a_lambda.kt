package exrc.chpt_040

val consumer: (String) -> Unit = { println(it) }
val mapper: (Int) -> String = { it.toString(2) }

fun main() {
    process(42)
}

fun process(n: Int) {
    consumer(
        mapper(n)
    )
}
