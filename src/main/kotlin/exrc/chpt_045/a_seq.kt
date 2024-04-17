package exrc.chpt_045

import org.assertj.core.api.Assertions

// WORK IN PROGRESS: another exercise for sequences

fun main() {
    val seq1 = createMultiplierSequence(1, 2, 100)
    Assertions.assertThat(seq1.toList()).containsSequence(1, 2, 4, 8, 16, 32, 64)

    val sequence = createNamesSequence("John", "Rob")
    sequence.forEach { println(it) }
}


fun createMultiplierSequence(base: Int, multiplier: Int, limit: Int): Sequence<Int> {
    return generateSequence(base) {
        val next = it * multiplier
        if (next > limit) null else next
    }
}


fun createNamesSequence(vararg moreNames: String): Sequence<String> {
    return sequence {
        yield("Bob")
        yield("Alice")
        println("more names wanted!")
        yieldAll(moreNames.iterator())
    }
}