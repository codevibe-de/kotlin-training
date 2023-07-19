package slides.chpt_040_functional

fun main() {
    var k = listOf(1.2, 77.8, 6.3, 988.88, 0.1)
    k.forEach(::println) // top-level function

    val consumer = Consumer()
    k.forEach(consumer::apply) // instance function
}

class Consumer() {
    fun apply(d:Double) = println(d)
}