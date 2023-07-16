package exrc.chpt_020

import java.time.LocalDate

const val city = "Würzburg"

fun main() {
    val myName = "T Auinger"
    println("""
        ${city}, den ${todaysDate()}
        
        Sehr geehrte Damen und Herren,
        
        anbei finden Sie meinen Kotlin Sourcecode mit Beachtung bzgl. meiner Bewerbung.
        
        Viel Spaß beim Lesen!
        Ihr ${myName}
    """.trimIndent())
}

fun todaysDate(): String {
    return LocalDate.now().toString()
}