package exrc.chpt_020

import java.io.File

val bookTitlesByIsbn = mutableMapOf<String,String>()
val bookTitlesByAuthor = mutableMapOf<String,MutableList<String>>()


fun main() {
    addBook2("Stark", "123-123", 7.99f, "Ben Elton")
    addBook2("Time and Time Again", "978-0552779999", 11.30f, "Ben Elton")
    addBook2("My Life", "555-144", 0.99f, "Kate Perry")
    addBook2("Kotlin Design Patterns", "978-1801815727", 30.99f, "Alexey Soshin")

    readBooksCsv("./src/main/kotlin/exrc/chpt_020/books.csv")

    println(bookTitlesByIsbn)
    println(bookTitlesByAuthor)
}


fun addBook2(
    title: String,
    isbn: String = "?",
    price: Float,
    author: String = "??"
) {
    println("Adding book '$title' written by $author")
    // title mapping is 1:1
    bookTitlesByIsbn[isbn] = title
    // author mapping is 1:n -- the if-statement below can be simplified with lambdas later...
    if (!bookTitlesByAuthor.containsKey(author)) {
        bookTitlesByAuthor[author] = mutableListOf()
    }
    bookTitlesByAuthor[author]!!.add(title)
}


// filename must be relative to project root
fun readLinesFromFile(filename:String): List<String> =
    File(filename).readLines()

fun readBooksCsv(filename:String) {
    val regex = Regex(pattern = """([\d-]+),([\w\s]+) \(([\w\s]*)\),"([\d.]*)","([^"]*)"""")
    for (line in readLinesFromFile(filename)) {
        val result = regex.find(line)
        if (result != null) {
            addBook2(
                title = result.groupValues[2],
                isbn = result.groupValues[1],
                price = result.groupValues[4].toFloat(),
                author = result.groupValues[3]
            )
        }
    }
}
