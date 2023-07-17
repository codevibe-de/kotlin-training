package exrc.chpt_020

fun addBook(
    title: String,
    isbn: String = "?",
    price: Float,
    author: String = "??"
) {
    println("Adding book '$title' (written by $author), having ISBN $isbn and price $price")
}

fun main() {
    addBook("Stark", "123-123", 7.99f, "Ben Elton")
    addBook("Stark", "123-123", 7.99f)
    addBook("Stark", price = 7.99f)
    addBook(title = "Stark", price = 7.99f, author = "Ben Elton")
}