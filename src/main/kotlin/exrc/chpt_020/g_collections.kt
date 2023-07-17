package exrc.chpt_020

val booksByIsbn = mutableMapOf<String,String>()
val booksByAuthor = mutableMapOf<String,MutableList<String>>()

fun main() {
    addBook2("Stark", "123-123", 7.99f, "Ben Elton")
    addBook2("Time and Time Again", "978-0552779999", 11.30f, "Ben Elton")
    addBook2("My Life", "555-144", 0.99f, "Kate Perry")
    addBook2("Kotlin Design Patterns", "978-1801815727", 30.99f, "Alexey Soshin")

    println(booksByIsbn)
    println(booksByAuthor)
}

fun addBook2(
    title: String,
    isbn: String = "?",
    price: Float,
    author: String = "??"
) {
    println("Adding book '$title' (written by $author), having ISBN $isbn and price $price")
    booksByIsbn[isbn] = title
    if (!booksByAuthor.containsKey(author)) {
        booksByAuthor[author] = mutableListOf()
    }
    booksByAuthor[author]!!.add(title)
}

