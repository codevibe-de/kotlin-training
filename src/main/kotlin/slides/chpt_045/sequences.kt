package chpt_045

fun createSeq() {
    val numbersSequence = sequenceOf("four", "three", "two", "one")

    val numbers = listOf("one", "two", "three", "four")
    val numbersSequence2 = numbers.asSequence()

    val oddNumbers = generateSequence(1) { it + 2 } // infinite

    val oddNumbersLessThan10 = generateSequence(1) { if (it < 8) it + 2 else null }
    println(oddNumbersLessThan10.count())

    val oddNumbers2 = sequence {
        yield(1)
        yieldAll(listOf(3, 5))
        yieldAll(generateSequence(7) { it + 2 })
    }
    println(oddNumbers.take(5).toList())
}

fun main() {
    createSeq()

    val sequence = sequenceOf(true, "asdads", 42)

    sequence
        .onEach { println("processing $it") }
        .map(Any::toString)
        .first { it.startsWith("a") }
        .apply { println(this) }

    sequence
        .onEach { println("processing $it") }
        .map(Any::toString)
        .toList()
}