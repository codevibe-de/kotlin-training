package slides.chpt_030_ood

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
