package slides.chpt_062

import slides.chpt_020.toBinary

// public inline fun <T> T.also(block: (T) -> Unit): T

class ResultsList {
    val results = mutableListOf<String>()

    fun addItem(n: Int) =
        // we have both this and it
        n.toBinary().also { this.results.add(it) }
}