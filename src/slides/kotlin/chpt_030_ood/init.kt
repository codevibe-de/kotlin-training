package chpt_030_ood

class Animal7(nameParam: String) {

    val name: String

    init {
        println("init")
        name = nameParam.uppercase()
    }

    constructor() : this("tralala") {
        println("secondary")
    }

    fun introduce() {
        println("Hi, I am a $name")
    }
}

fun main() {
    Animal7().introduce()
}
