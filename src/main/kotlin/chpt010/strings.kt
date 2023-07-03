package de.codevibe

val n = 42
val answer = "The answer is $n"

val s = "abc"
val analysis = "The string `%s` has length ${s.length}."


val longAnswer = """
    The Answer to the Ultimate Question of Life, 
    the Universe, 
    and ${"Everything".uppercase()} is 
    ...
    ${getAnswer()}
""".trimIndent()

fun getAnswer(): Int {
    return 42
}

fun main() {
    println(longAnswer)
}

