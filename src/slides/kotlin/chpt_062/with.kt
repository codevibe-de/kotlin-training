package chpt_062

// public inline fun <T, R> with(receiver: T, block: T.() -> R): R

fun main() {
    val image = with(Turtle()) {
        for (i in 1..4) {
            forward(100.0)
            turn(90.0)
        }
        export() // return value
    }
}
