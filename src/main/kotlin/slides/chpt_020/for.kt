package slides.chpt_020

fun main(args: Array<String>) {
    for (arg in args) {
        println(arg)
    }

    for (i in args.indices) {
        println("#$i: ${args[i]}")
    }

    for ((i,v) in args.withIndex()) {
        println("#$i: $v")
    }
}
// Romani
// Ite
// Domum
// #0: Romani
// #1: Ite
// #2: Domum

fun main2() {
    for (i in 1..3) {
        println(i)
    }

    for (i in 6 downTo 0 step 2) {
        println(i)
    }

    for (n in (1..3).reversed()) {
        println("$n")
    }
    println("Lift off!")
}
// 3
// 2
// 1
// Lift off!

class Lyrics {
    operator fun iterator(): Iterator<String> {
        return listOf("Hey now", "you're an All Star", "get your game on", "go play!")
            .listIterator()
        }
}

fun main3() {
    for (parts in Lyrics()) {
    }
}