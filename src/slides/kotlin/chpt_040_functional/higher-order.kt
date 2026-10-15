package chpt_040_functional

fun main() {
    val p = createPredicate(4)
    test("blah", p)
}

fun createPredicate(minLen: Int): (String) -> Boolean =
    { it.length >= minLen }

fun test(str: String, pred: (String) -> Boolean) = pred(str)


fun main2() {
    // allowed:
    test("foo", { s -> s.isNotEmpty() })

    // preferred:
    test("foo") { s -> s.isNotEmpty() }

    // also for constructors:
    val squares = Array(5) { it * it }
}