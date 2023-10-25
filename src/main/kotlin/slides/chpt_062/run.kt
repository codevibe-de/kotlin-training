package slides.chpt_062

// public inline fun <T, R> T.run(block: T.() -> R): R

class Turtle {
    fun penDown() {}
    fun penUp() {}
    fun turn(degrees: Double) {}
    fun forward(pixels: Double) {}
}

fun main() {
    Turtle().run() { //draw a 100 pix square
        penDown()
        for (i in 1..4) {
            forward(100.0)
            turn(90.0)
        }
        penUp()
    }
}
