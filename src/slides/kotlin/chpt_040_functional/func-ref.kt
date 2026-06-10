package chpt_040_functional

fun main() {
    var processingLambda: (Any) -> Unit

    // top-level function:
    processingLambda = ::gibEsAus

    // instance method
    val myConsole = MyConsole()
    processingLambda = myConsole::print

    // static method
    processingLambda = MyConsole::directPrint
}

fun gibEsAus(input: Any): Unit {
    println(input)
}

class MyConsole {
    fun print(input: Any): Unit {
        println(">> $input")
    }
    companion object {
        fun directPrint(input: Any): Unit {
            println(input)
        }
    }
}