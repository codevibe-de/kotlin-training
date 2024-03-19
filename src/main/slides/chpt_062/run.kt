package chpt_062

import java.awt.Image
import java.awt.image.BufferedImage

// public inline fun <T, R> T.run(block: T.() -> R): R

class Turtle {
    fun turn(degrees: Double) {}
    fun forward(pixels: Double) {}
    fun export(): Image {
        return BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB)
    }
}

fun main() {
    val image =
        Turtle().run { //draw a 100 pix square
            for (i in 1..4) {
                forward(100.0)
                turn(90.0)
            }
            export() // return value
        }
}
