package exrc.chpt_020

fun main(args: Array<String>) {
    addBook("Stark", "123-123", 7.99f, "Ben Elton")
    addBook("Stark", "123-123", 7.99f)
    addBook("Stark", price = 7.99f)
    addBook(title = "Stark", price = 7.99f, author = "Ben Elton")

    // bonus:
    for (arg in args) {
        val parts = arg.split(":")
        val (titleString, priceString) = parts
        try {
            addBook(title = titleString, price = priceString.toFloat())
        } catch (e: NumberFormatException) {
            println("\nSkipping book '$titleString' with malformed price")
        }
    }
}


fun addBook(
    title: String,
    isbn: String = "?",
    price: Float,
    author: String = "??"
) {
    val output = """
            ADDING BOOK '$title'
            - written by $author
            - ISBN $isbn
            - price $price
          """.trimIndent()
    println()
    println(output)
}

