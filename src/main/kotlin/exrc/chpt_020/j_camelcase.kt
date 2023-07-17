package exrc.chpt_020

fun String.camelcase(): String {
    val words = this.split(' ').toMutableList()
    for ((i,w) in words.withIndex()) {
        words[i] = w[0].uppercase() + w.substring(1).lowercase()
    }
    return words.joinToString("")
}

fun main() {
    println("Wir lernen Kotlin".camelcase())
}