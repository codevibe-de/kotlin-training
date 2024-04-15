package chpt_040_functional

fun main() {
    //val printer: (String) -> Unit = { s -> println(s) }
    val printer: (String) -> Unit = { println(it) }
    printer("blah")
}