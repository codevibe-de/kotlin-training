package chpt_020

fun main() {
    val fibonacci: Array<Int> = arrayOf(2, 3, 5, 8, 13, 21, 34)
    println(fibonacci)
//    for (f in fibonacci) println(f)
//
    println(fibonacci.contentToString())
//
//    val firstFib = fibonacci[0]
//
//    fibonacci.plus(arrayOf(55, 89))
//    println(fibonacci.joinToString(" -> "))
//
//    fibonacci.indexOf(8)
//
//    val firstFiveFibs: Array<Int> = fibonacci.copyOfRange(0, 5)
//
//    fibonacci.fill(0)

    val intArray = IntArray(2) // populated with zeros
    println(intArray[0])
}
