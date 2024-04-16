package chpt_030_ood

data class Book(
    val isbn: String,
    var name: String,
    var priceInCent: Int
) {
    fun foo() {}
}

fun main() {
    val book1 = Book("12-435", "The Misty Mountains", 1299)
    println(book1)
    // Book(isbn=12-435, name=The Misty Mountains, priceInCent=1299)

    val book1b = Book("12-435", "The Misty Mountains", 1299)
    println(book1 == book1b) // true

    val book2 = book1.copy()
    println(book1 == book2) // true
    println(book1 === book2) // false

    val book3 = book1.copy(priceInCent = 299)
    println(book3)
    // Book(isbn=12-435, name=The Misty Mountains, priceInCent=299)

    println(book1 == book3) // false
}
