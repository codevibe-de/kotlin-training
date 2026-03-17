package exrc.chpt_020

import org.assertj.core.api.Assertions.assertThat

fun main() {
    val count = "Hallöchen!".countUmlauts()
    assertThat(count).isEqualTo(3)

    val camelCase = "Wir lernen Kotlin".camelcase()
    assertThat(camelCase).isEqualTo("WirLernenKotlin")

    val spaced = "Hallo".spaced()
    assertThat(spaced).isEqualTo("H a l l o")
}


fun Char.isUmlaut(): Boolean =
    when (this) {
        'a', 'ä', 'A', 'Ä', 'e', 'E', 'i', 'I', 'o', 'O', 'ö', 'Ö', 'u', 'U', 'ü', 'Ü' -> true
        else -> false
    }

fun String.countUmlauts(): Int {
    var result = 0
    for (c in this) {
        result += if (c.isUmlaut()) 1 else 0
    }
    return result
}


fun String.camelcase(): String {
    val words = this.split(' ').toMutableList()
    for ((i, w) in words.withIndex()) {
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
