package chpt_030_ood

import java.util.UUID

class Product(
    val id: String = generateId(),
    var name: String,
) {
    companion object {
        fun generateId() = UUID.randomUUID().toString()
    }
}

fun main() {
    val prd = Product(name = "Pizza Salamy")
    prd.name = "Pizza Salami" // fix typo
    println("${prd.id} ${prd.name}")
}