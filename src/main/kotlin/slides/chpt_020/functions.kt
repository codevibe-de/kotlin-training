package slides.chpt_020

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
    offset: Int = 0,
    length: Int = b.size,
) {
    // do some reading
}


fun main22() {
    val byteArr = byteArrayOf(32, 46, 75, 33)
    read(byteArr)
    read(byteArr, length = 2)
    read(length = 2, offset = 1, b = byteArr)
}