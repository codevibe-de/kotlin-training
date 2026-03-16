package exrc.chpt_030

interface Finned {
    val finCount: Int
}

interface Toothed {
    fun bite(animal: Animal)
}

abstract class Animal(val name: String)

open class Mammal(
    name: String
) : Animal(name)

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

open class Fish(
    name: String,
    override val finCount: Int
) : Animal(name), Finned

class Shark(
    name: String,
    override val finCount: Int
) : Fish(name, finCount), Toothed {
    override fun bite(animal: Animal) {
        println("Biting ${animal.name}")
    }
}

class Orca(
    name: String,
    override val finCount: Int
) : Mammal(name), Finned, Toothed {
    override fun bite(animal: Animal) {
        println("Biting ${animal.name}")
    }
}


fun main() {
    val lion = Lion("Leo")
    val blueWhale = BlueWhale("Mobby", 4)
    lion.bite(blueWhale)
}