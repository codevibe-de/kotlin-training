package slides.chpt_090

import com.fasterxml.jackson.annotation.JsonAlias
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper

data class Product(
    @field:JsonAlias("identifier") val id: String,
    val name: String = id,
    val price: Float = 0.00f,
)

fun main() {
    val json = """{"identifier":"abc-123"}"""
    val product = jacksonObjectMapper()
        .readValue(json, Product::class.java)
    println(product)
}