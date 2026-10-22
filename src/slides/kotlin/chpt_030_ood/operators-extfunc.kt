package chpt_030_ood

fun main() {
    var s = "Hello"
    s--
    println(s) // Hell
}

operator fun String.dec(): String = this.substring(0, this.length-1)