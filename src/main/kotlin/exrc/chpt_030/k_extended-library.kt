package exrc.chpt_030

class Book(
    val title: String,
    val isbn: String = "?",
    val price: Float,
    val author: String = "??"
)

class Library {
    val books = mutableListOf<Book>()
    fun addBook(book: Book) = books.add(book)
}

fun Library.titlesByAuthor(): Map<String, List<String>> {
    val result = mutableMapOf<String, MutableList<String>>()
    for (b in this.books) {
        if (!result.containsKey(b.author)) {
            result[b.author] = mutableListOf()
        }
        result[b.author]!!.add(b.title)
    }
    for ((_, v) in result) {
        v.sort()
    }
    return result
}

fun main() {
    val lib = Library()
    lib.addBook(Book(title = "Zzzz - Sleepy Jedis", author = "Darth Vader", price = 6.99f))
    lib.addBook(Book(title = "A New Beginning", author = "Darth Vader", price = 0.99f))
    lib.addBook(Book(title = "Death Stars for Noobs", author = "Darth Vader", price = 76.99f))
    lib.addBook(Book(title = "Becoming Jedi", author = "L. Skywalker", price = 26.99f))
    println(lib.titlesByAuthor())
}