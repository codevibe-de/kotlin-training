package chpt_030_ood.jvm

class Dog(val name: String) {
    var age: Int = 0
    val isPuppy: Boolean
        get() = age < 1
}
