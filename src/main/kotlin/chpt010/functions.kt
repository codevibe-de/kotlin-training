package de.codevibe

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun printSum(a: Int, b: Int): Unit {
    println(sum(a, b))
}

fun main() {
    sum(1, 2)
    printSum(
        1,
        2,
    )
}

fun read(
    b: ByteArray,
    off: Int = 0,
    len: Int = b.size,
) {
    // do some reading
}


fun complexStuff(
    str: String,
    prefix: String = "",
    suffix: String = "",
    maxLength: Int
) {
    // do complex stuff
}

fun main2() {
    complexStuff(
        "Hey, I am a String",
        suffix = "!!!",
        maxLength = 2
    )
}