package chpt_051

import java.text.DecimalFormat

object Highlander {
    val name: String = "Connor MacLeod"
    fun charge() {
    }
}

//fun main() {
//    println("I am ${Highlander.name}")
//    Highlander.charge()
//}

// --------------------------------------------

object DecimalFormatSingleton {
    val instance = DecimalFormat("###,###")
}

fun main() {
    println(DecimalFormatSingleton.instance.format(6222))
}