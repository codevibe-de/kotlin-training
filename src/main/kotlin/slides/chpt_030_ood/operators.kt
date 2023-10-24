package slides.chpt_030_ood

fun main() {
    var counter = Counter(0)
    println(counter++) // count=0
    println(-counter) // count=-1
    println(counter["whatever"]) // 1, nicht -1 !!!
}

data class Counter(val count: Int) {
    operator fun inc(): Counter = Counter(count + 1)
    operator fun unaryMinus(): Counter = Counter(-count)
    operator fun get(s:String): Int = count
}
