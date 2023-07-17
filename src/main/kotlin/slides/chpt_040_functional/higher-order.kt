package slides.chpt_040_functional

fun main() {
    val p = createPredicate(4)
    test("blah", p)
}

fun createPredicate(minLen: Int) = { s: String -> s.length >= minLen }

fun test(str: String, pred: (String) -> Boolean) = pred(str)


fun main2() {
    // erlaubt:
    test("foo", { s -> s.isNotEmpty() })

    // bevorzugt:
    test("foo") { s -> s.isNotEmpty() }
}