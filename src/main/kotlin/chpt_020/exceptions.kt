package chpt_020

fun main() {
    // no need to catch
//    bad()

    // but can do
    try {
        bad()
    } catch (e: CalculationException) {
        println("giving up")
    }
    finally {
        // do something clever
    }
}

/**
 * @throws CalculationException
 */
fun bad(): Nothing = throw CalculationException()

class CalculationException : Exception("calculation failed")
