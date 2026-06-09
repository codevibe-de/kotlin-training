package exrc.chpt_045

import org.assertj.core.api.Assertions


fun main() {
    val seq1 = createMultiplierSequence(1, 2, 100)
    seq1.forEach(::println)
    Assertions.assertThat(seq1.toList()).containsSequence(1, 2, 4, 8, 16, 32, 64)

    val seq2 = createNamesSequence("John", "Rob", listOf("Alice", "Bob"))
    seq1.forEach(::println)
    Assertions.assertThat(seq2.toList()).containsSequence("John", "Rob", "Alice", "Bob")
}


fun createMultiplierSequence(base: Int, multiplier: Int, limit: Int): Sequence<Int> {
    return generateSequence(base) {
        val next = it * multiplier
        if (next > limit) null else next
    }
}


fun createNamesSequence(name1: String, name2: String, additionalNames: Iterable<String>): Sequence<String> {
    return sequence {
        yield(name1)
        yield(name2)
        println("more names wanted!")
        yieldAll(additionalNames)
    }
}