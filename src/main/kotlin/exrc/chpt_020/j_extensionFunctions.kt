package exrc.chpt_020

import org.assertj.core.api.Assertions.assertThat

fun main() {
    val count = "Hallöchen!".countVowels()
    assertThat(count).isEqualTo(3)

    val camelCase = "Wir lernen Kotlin".camelcase()
    assertThat(camelCase).isEqualTo("WirLernenKotlin")

    val spaced = "Hallo".spaced()
    assertThat(spaced).isEqualTo("H a l l o")
}


fun String.countVowels() = Regex("[auioeäüö]", RegexOption.IGNORE_CASE).findAll(this).count()


fun String.camelcase(): String {
    val words = this.split(' ').toMutableList()
    for ((i, w) in words.withIndex()) {
        words[i] = w[0].uppercase() + w.substring(1).lowercase()
    }
    return words.joinToString("")
}


fun String.spaced(): String = this.toCharArray().joinToString(" ")
