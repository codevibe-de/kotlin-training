package chpt_020

val n = 42
val answer = "The answer is $n"

val s = "abc"
val analysis = "The string '$s' has length ${s.length}."

val someExpr = "\$name" // $name


val longAnswer = """
    The Answer to the Ultimate Question of Life, 
    the Universe, 
    and ${"Everything".uppercase()} is 
    ...
    ${getAnswer()}
""".trimIndent()

val withDollar = """
    ${'$'}name
"""

val withDollar2 = $$"""
    $name
"""

fun getAnswer(): Int {
    return 42
}

fun main() {
    println(longAnswer)
    println(analysis)
    println(someExpr)
}

