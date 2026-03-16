package chpt_030_ood

fun main() {
    var s = "Hallo"
    s--
    println(s) // Hall
}

operator fun String.dec(): String = this.substring(0, this.length-1);