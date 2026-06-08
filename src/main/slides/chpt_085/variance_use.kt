package chpt_085

fun main() {
//    produceFromBox(Box<Any>())
//    produceFromBox(Box<CharSequence>())
//    produceFromBox(Box<String>())
//
//    consumeIntoBox(Box<Any>())
//    consumeIntoBox(Box<CharSequence>())
//    consumeIntoBox(Box<String>())
}


fun produceFromBox(b:Box<out CharSequence>) {
    println(b.value)
}

fun consumeIntoBox(b:Box<in CharSequence>) {
    b.value = "123"
}