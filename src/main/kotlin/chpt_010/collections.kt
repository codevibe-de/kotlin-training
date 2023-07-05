package chpt_010

fun main() {
    setOps()
}

private fun create() {
    // read-only
    val list = listOf(1, 2, 3)
    val set = setOf("a", "b")
    val map = mapOf("I" to 1, "II" to 2, "III" to 3)

    // mutable
    val list2 = mutableListOf<Boolean>()
    list2.add(true)
    val set2 = mutableSetOf("a", "b")
    set2.remove("a")
    val map2 = mutableMapOf<String, Int>()
    map2["V"] = 5   // or map.put("V", 5)
}

fun listOperations() {
    val numbers: IntArray = intArrayOf(10, 20, 30, 40, 50)
    val list = numbers.toMutableList()

    list.add(1)
    list.add(0, 1111)
    list.addAll(listOf(23, 42))

    var n = list[1]
    n = list.get(1)
    n = list.getOrElse(333) { -1 }
    val len = list.size
}

fun setOps() {
    val set = (1..10).toMutableSet()

    val set2 = set.plus(1)
    println(set == set2) // true
    set.addAll((100..111).toSet())

    set.contains(111) // true
    for (n:Int in set) {
        print("$n, ")
    }
}

fun mapOps() {
    val map = mutableMapOf("yes" to true, "true" to true)

    map.computeIfAbsent("1") { s: String -> true }
    map["okay"] = true
    val map2 = map.plus("TRUE" to true)

    println(map.keys.size)

    map["yes"]
    map.get("true")
    map.getOrElse("none") { -> false }
    map.getOrDefault("oh no", false)
}


fun covariant() {
    val listOfInts = listOf<Int>(1, 2, 3)
    val i: Int = listOfInts[0] // or listOfInts.get(0)

    val listOfNumbers: List<Number> = listOfInts
    val n: Number = listOfNumbers[0]
}