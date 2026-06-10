package chpt_020

fun main() {
    val regex = Regex("""\w\w\d\d(\d{8})(\d{10})""")
    val result = regex.find("DE07123412341234123412")
    if (result != null) {
        val (blz, kontoNr) = result.destructured
        println("BLZ: $blz, Kontonummer: $kontoNr")
    }
}