package chpt_020

fun main() {
    val threeDimArray: Array<Array<Array<Int>>> =
        arrayOf(
            arrayOf(
                arrayOf(1, 2, 3)
            )
        )
    println(threeDimArray[0][0][1]) // 2
}