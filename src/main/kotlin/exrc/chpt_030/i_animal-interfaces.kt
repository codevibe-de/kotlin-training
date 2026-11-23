package exrc.chpt_030

interface Finned {
    val finCount: Int
}

interface Toothed {
    // default implementation, used by Lion and Orca
    fun bite(animal: Animal) {
        println("Biting ${animal.name}")
    }
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
) : Mammal(name), Toothed

open class Fish(
    name: String,
    override val finCount: Int
) : Animal(name), Finned

class Shark(
    name: String,
    override val finCount: Int
) : Fish(name, finCount), Toothed {
    override fun bite(animal: Animal) {
        println("Just one bite!")  // Bruce, "Finding Nemo"
    }
}

class Orca(
    name: String,
    override val finCount: Int
) : Mammal(name), Finned, Toothed


fun main() {
    val lion = Lion("Leo")
    val blueWhale = BlueWhale("Mobby", 4)
    lion.bite(blueWhale)                  // Biting Mobby
    Shark("Bruce", 7).bite(blueWhale)     // Just one bite!
    Orca("Willy", 5).bite(blueWhale)      // Biting Mobby
}