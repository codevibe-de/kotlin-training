package chpt_051

data class Person2(
    val firstName: String,
    val lastName: String,
    val age: Int = 0,
    val middleName: String = "",
)

fun main() {
    val p = Person2(
        firstName = "Enrico",
        lastName = "Pallazzo",
        middleName = "R."
    )
}
