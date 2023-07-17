package slides.chpt_020

fun factorSum(vararg nums: Int, factor: Float = 1.0f): Float {
    var result = 0
    for (n in nums) result += n
    return result * factor
}

fun main() {
    factorSum(1, 2, 3, factor = 2.2f)

    val numbers = intArrayOf(1, 10, 100)
    factorSum(*numbers) // 111.0
}