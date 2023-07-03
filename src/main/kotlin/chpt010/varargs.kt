package de.codevibe

fun factoredSum(vararg nums: Int, factor: Float = 1.0f): Float {
    var result = 0
    for (n in nums) result += n
    return result * factor
}

fun main() {
    factoredSum(1, 2, 3, factor = 2.2f)
}