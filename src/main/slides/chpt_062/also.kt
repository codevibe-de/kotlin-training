package chpt_062

import chpt_020.toBinary

// public inline fun <T> T.also(block: (T) -> Unit): T

class ResultsList {
    val results = mutableListOf<String>()

    fun convertAndStore(n: Int) = n.toBinary().also { this.results.add(it) }
}


class ResultsListBasic {
    val results = mutableListOf<String>()

    fun convertAndStore(n: Int) : String {
        val binaryStr = n.toBinary()
        results.add(binaryStr)
        return binaryStr
    }
}