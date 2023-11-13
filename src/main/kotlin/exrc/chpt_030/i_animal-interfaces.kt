package exrc.chpt_030

interface Finned {
    val finCount: Int
}

interface Toothed {
    fun bite(animal: Animal)
}

abstract class Animal {
    abstract val name: String
}


open class Mammal(
    override val name: String
) : Animal()


class BlueWhale(
    name: String,
    override val finCount: Int
) : Mammal(name), Finned

class Lion(
    name: String
) : Mammal(name), Toothed {
    override fun bite(animal: Animal) {
        println("Biting ${animal.name}")
    }
}


fun main() {
    val lion = Lion("Leo")
    val blueWhale = BlueWhale("Mobby", 4)
    lion.bite(blueWhale)
}