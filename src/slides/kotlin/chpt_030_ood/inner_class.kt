package chpt_030_ood

import java.util.function.Supplier

class Person {

    private val id = "123"
    private val address = Address("97080", "Würzburg")

    // inner
    inner class XmlFormatter : Supplier<String> {
        override fun get() = "<person id='$id'/>"
    }

    // nested
    class Address(
        val zipCode: String,
        val city: String,
    )
}


fun main() {
    val formatter = Person().XmlFormatter()
    val address = Person.Address("12345", "Gotham City")
}
