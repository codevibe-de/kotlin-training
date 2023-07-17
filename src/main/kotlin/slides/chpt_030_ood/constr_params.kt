package slides.chpt_030_ood

class Animal2 (
    val name: String,
    length: Int = 0
) {
    private val lengthInMeters = length / 100.0

    fun introduce() {
        print("Hi, I am a $name")
        if (lengthInMeters > 0) {
            print(" and $lengthInMeters} m long")
        }
        println()
    }
}

fun main() {
    Animal2("bee").introduce()
    Animal2("mouse", 7).introduce()
    Animal2("blue whale", 4283).introduce()
}
