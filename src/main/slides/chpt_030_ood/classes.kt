package slides.chpt_030_ood

@Suppress("RedundantConstructorKeyword")
class Fish constructor(
    name: String,
    age: Int
)

class Fish2(
    val name: String
) {
    var age: Int = 0
}


class Animal(
    val name: String,
    val length: Int   // cm
) {
    fun introduce() {
        println("Hi, I am a $name and $length cm long")
    }
}

fun main() {
    Animal("mouse", 7).introduce()
    val whale = Animal("blue whale", 4283)
    whale.introduce()
}
