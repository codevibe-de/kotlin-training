package exrc.chpt_020

// We could even name this function just "print" and use it (by importing) instead of the default print().
// To prevent an endless loop we need to use "kotlin.io.print()" in the code below.
fun vprint(vararg args: Any, sep: String = " ", end:String = "\n") {
    var first = true
    for (a in args) {
        if (!first) {
            kotlin.io.print(sep)
        }
        kotlin.io.print(a)
        first = false
    }
    kotlin.io.print(end)
}


fun main() {
    vprint(true, 1, "hallo")
    vprint(1, 2, 3, end = ".\n")
    vprint(178, "44455", "11", sep = "-")
}