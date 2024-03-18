package slides.chpt_030_ood

import java.util.*

class Product(
    var name: String,
) {
    val id: String = generateInternalId()

    companion object {
        fun generateInternalId() = UUID.randomUUID().toString()
    }
}

fun main() {
    val prd = Product(name = "Pizza Salamy")
    prd.name = "Pizza Salami" // fix typo
    println("${prd.id} ${prd.name}")
}