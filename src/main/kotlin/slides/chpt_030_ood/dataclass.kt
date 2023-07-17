package slides.chpt_030_ood

data class Book (
    val isbn: String,
    var name: String,
    var priceInCent: Int
) {
    fun foo() {}
}

fun main() {
    val book1 = Book("12-435", "The Misty Mountains", 1299)
    println(book1)

    val book2 = book1.copy()
    println(book1 == book2) // true
    println(book1 === book2) // false

    book2.priceInCent = 299
    println(book1 == book2) // false
}