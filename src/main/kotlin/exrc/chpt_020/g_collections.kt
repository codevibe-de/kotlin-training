package exrc.chpt_020

fun main() {
    addBook2("Stark", "123-123", 7.99f, "Ben Elton")
    addBook2("Time and Time Again", "978-0552779999", 11.30f, "Ben Elton")
    addBook2("My Life", "555-144", 0.99f, "Kate Perry")
    addBook2("Kotlin Design Patterns", "978-1801815727", 30.99f, "Alexey Soshin")

//    println(bookTitlesByIsbn)
//    println(bookTitlesByAuthor)
}


fun addBook2(
    title: String,
    isbn: String = "?",
    price: Float,
    author: String = "??"
) {
    println("Adding book '$title' written by $author")
    // TODO
}

