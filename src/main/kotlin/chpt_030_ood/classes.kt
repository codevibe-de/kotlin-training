package chpt_030_ood

//class Animal
//
//interface Swimmer

class Animal constructor(
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


//class Animal (
//    val name: String,
//    length: Int = 0
//) {
//    private val lengthInMeters = length / 100.0
//
//    fun introduce() {
//        print("Hi, I am a $name")
//        if (lengthInMeters > 0) print(" and $lengthInMeters} m long")
//        println()
//    }
//}
//
//fun main() {
//    Animal("bee").introduce()
//    Animal("mouse", 7).introduce()
//    Animal("blue whale", 4283).introduce()
//}


//class Animal (
//    val name: String
//) {
//    constructor(order: String, family: String)
//            : this("animal of Order `$order` and family `$family`")
//
//    init {
//        println("Init $name")
//    }
//
//    fun introduce() {
//        println("Hi, I am a $name")
//    }
//}
//
//fun main() {
//    Animal("bee").introduce()
//    Animal("Rodentia", " Muridae").introduce()
//}

//class Animal (
//    nameParam: String
//) {
//    val name: String
//
//    init {
//        name = nameParam.uppercase()
//    }
//
//    fun introduce() {
//        println("Hi, I am a $name")
//    }
//}
//
//fun main() {
//    Animal("bee").introduce()
//}
