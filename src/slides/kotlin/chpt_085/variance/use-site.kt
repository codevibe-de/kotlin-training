package chpt_085.variance

class Box<T>(var value: T)

fun show(box: Box<out Animal>) {
    println(box.value)    // reading is fine
    // box.value = Cat()  // ❌ writing is not
}

fun fill(box: Box<in Cat>) {
    box.value = Cat()     // writing is fine
    // val c: Cat = box.value // ❌ reading as Cat is not (output is of type Any?)
}

fun main() {
    show(Box(Cat()))
    fill(Box(Animal()))
}
