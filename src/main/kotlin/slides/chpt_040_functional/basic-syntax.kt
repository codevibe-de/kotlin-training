package slides.chpt_040_functional

val sumLambda: (Int, Int) -> Int = { a: Int, b: Int -> a + b }

fun main() {
    println(sumLambda(1, 2))
//    println(complexLambda("C:\\DOS\\DATA.TXT"))
}

val complexLambda = { s: String ->
    if (s.endsWith("txt", true)) {
        "Textfile"
    } else {
        "Something else"
    }
}
