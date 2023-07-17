package exrc.chpt_040

import java.io.File

typealias GeneratorFunc = () -> Int
typealias FilterFunc = (Int) -> Boolean
typealias MapperFunc = (Int) -> String
typealias TerminalFunc = (String) -> Unit

fun main() {
    val terminalFunc = createFileWriter(File("output.txt"))
    val mapperFunc = { n: Int -> n.toString(2) }
    val filterFunc = createFilterDroppingNumbersDividableBy(3)
    for (n in 1..10) {
        val generatorFunc: GeneratorFunc = createGenerator(n)
        process2(generatorFunc, filterFunc, mapperFunc, terminalFunc)
    }
}

fun process2(generatorFunc: GeneratorFunc, filterFunc: FilterFunc, mapperFunc: MapperFunc, terminalFunc: TerminalFunc) {
    val x = generatorFunc()
    if (filterFunc(x)) {
        val y = mapperFunc(x)
        terminalFunc(y)
    }
}

fun createGenerator(item: Int): GeneratorFunc {
    return { -> item }
}

fun createFileWriter(f: File): TerminalFunc {
    return { s: String ->
        f.appendText(s + "\n")
    }
}

fun createFilterDroppingNumbersDividableBy(div: Int): FilterFunc =
    { n: Int -> n % div == 0 }