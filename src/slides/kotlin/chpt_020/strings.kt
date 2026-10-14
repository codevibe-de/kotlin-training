package chpt_020

val n = 42
val answer = "The answer is $n"

val s = "abc"
val analysis = "The string '$s' has length ${s.length}."

val someExpr = "\$name" // $name

val price = 19.999
val total = "Total: %.2f".format(price) // Total: 20.00


val id = 42
val name = "Arthur Dent"

val json = """
    {
        "id": $id,
        "name": "${name.uppercase()}"
    }
""".trimIndent()

val url = "http://json-schema.org/draft-07/schema#"
val schemaName = "Customer"

val s1 = """
    {
      "${'$'}schema": "$url",
      "title": "$schemaName"
    }
"""

// $ is a literal, $$ interpolates
val s2 = $$"""
    {
      "$schema": "$$url",
      "title": "$$schemaName"
    }
"""

fun main() {
    println(analysis)
    println(someExpr)
    println(total)
    println(json)
    println(s1 == s2) // true
}

