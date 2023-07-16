package chpt_020


fun main() {
    val fibonacciSeed = Array(2) { _ -> 1}
    println(fibonacciSeed.contentToString())

    val moreFibs = arrayOf(2, 3, 5, 8, 13, 21, 34)
    val allFibs = fibonacciSeed.plus(moreFibs)
    println(allFibs.joinToString(" -> "))

    allFibs.indexOf(8)
    allFibs.copyOfRange(0, 5)
    allFibs.fill(0, 0, allFibs.size)

    allFibs[0]
    allFibs.get(0)
    for (n in allFibs.iterator()) print(n)
}
