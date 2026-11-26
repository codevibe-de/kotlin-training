package chpt_085.variance

class Box<T>(var value: T)

fun show(box: Box<out Animal>) {
    println(box.value)    // ✅ Reading as Animal
    // box.value = Cat()  // ❌ Writing not allowed
}

fun fill(box: Box<in Cat>) {
    box.value = Cat()         // ✅ Writing a Cat
    val a: Any? = box.value   // ✅ Reading as Any?
    // val c: Cat = box.value // ❌ Reading as Cat
}

fun main() {
    val catBox = Box(Cat())
    val animalBox = Box(Animal())
    show(catBox)
    fill(animalBox)
}
