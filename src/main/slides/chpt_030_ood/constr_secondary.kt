package slides.chpt_030_ood

class Animal3(
    val name: String
) {
    constructor(order: String, family: String)
            : this("animal of Order `$order` and family `$family`") {
        println("using secondary constructor")
    }

    init {
        println("Init $name")
    }

    fun introduce() {
        println("Hi, I am a $name")
    }
}

fun main() {
    Animal3("bee").introduce()
    Animal3("Rodentia", " Muridae").introduce()
}

