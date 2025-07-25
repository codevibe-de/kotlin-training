package chpt_020

fun main() {
    val x = "a"
    printInfo(x)

    // checking for number ranges
    when (val n = (0..10).random()) {
        in 0..9 -> print("no luck, just got a $n")
        10 -> print("bingo!")
        else -> print("weird")
    }

    // checking for types and working with them (smart-cast)
    val something: Any = "foo"
    val isStringWithPrefix = when (something) {
        is String -> something.startsWith("prefix")
        else -> false
    }
    println(isStringWithPrefix)

    // ohne Ausdruck im Kopf
    val n = getSomething()
    when {
        n <= 0 -> println("Bad Input")
        n % 7 == 4 -> println("...")
        System.currentTimeMillis() > 1_000_000 -> println("millis")
        else -> println("Thanks")
    }
}

fun printInfo(s: String) {
    when (s) {
        "abc" -> println("some string")
        "a", "b", "c" -> println("a single letter string")
        42.toString() -> println("42 as string")
        else -> println("don't know")
    }
}


fun getSomething() = 123