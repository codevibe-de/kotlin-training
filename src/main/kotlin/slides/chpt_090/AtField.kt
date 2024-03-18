package slides.chpt_090

import com.fasterxml.jackson.annotation.JsonAlias
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue

data class Product(
    @field:JsonAlias("identifier") val id: String,
    val name: String = id,
    val price: Float = 0.00f,
)

fun main() {
    val json = """{"identifier":"abc-123"}"""
    val product1 = jacksonObjectMapper().readValue(json, Product::class.java)
    val product2 = jacksonObjectMapper().readValue<Product>(json) // only possible in Kotlin
    println(product2)
}