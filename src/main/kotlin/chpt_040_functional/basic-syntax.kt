package chpt_040_functional

val sumLambda = { a: Int, b: Int -> a + b }

val complexLambda = { s: String ->
    if (s.endsWith("txt", true)) {
        "Textfile"
    } else {
        "Something else"
    }
}

fun main() {
    println(sumLambda(1, 2))
    println(complexLambda("C:\\DOS\\DATA.TXT"))
}
