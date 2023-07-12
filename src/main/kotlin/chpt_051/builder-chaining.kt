package chpt_051


class Person() {
    var name = ""
    var age = 0

    fun name(name: String): Person {
        this.name = name
        return this
    }

    fun age(age: Int): Person {
        this.age = age
        return this
    }
}

fun main() {
    val p1 = Person()
        .name("Tom")
        .age(22)
    val p2 = Person()
        .name("Clan")
        .age(33)
}