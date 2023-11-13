package exrc.chpt_020

fun Char.isVowel(): Boolean =
    when (this) {
        'a', 'ä', 'A', 'Ä', 'e', 'E', 'i', 'I', 'o', 'O', 'ö', 'Ö', 'u', 'U', 'ü', 'Ü' -> true
        else -> false
    }

fun String.vowelCount(): Int {
    var result = 0
    for (c in this) {
        result += if (c.isVowel()) 1 else 0
    }
    return result
}


fun String.camelcase(): String {
    val words = this.split(' ').toMutableList()
    for ((i,w) in words.withIndex()) {
        words[i] = w[0].uppercase() + w.substring(1).lowercase()
    }
    return words.joinToString("")
}


fun String.spaced(): String {
    val result = StringBuilder()
    for (c in this) {
        result.append(c).append(' ')
    }
    return result.toString()
}


fun main() {
    println("Übungen".vowelCount()) // 3
    println("Wir lernen Kotlin".camelcase()) // WirLernenKotlin
    println("Eine wichtige Überschrift".spaced()) // E i n e   w i c h t i g e   Ü b e r s c h r i f t
}