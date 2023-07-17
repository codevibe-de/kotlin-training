package slides.chpt_060

fun main() {
    var str: String? = "abc"
    str = null

    println(str ?: "default")

    val cntr = Container(child = null)
    println(cntr.child?.index ?: "nothing here")

    cntr.child!!.index // java.lang.NullPointerException
}

data class Container(val child: Child?)
data class Child(val index: Int?)

fun bad1(s:String?) {
//    println(s.length)   // does not compile
}

fun bad2(s:String?) {
    println(s!!.length)   // ggf. java.lang.NullPointerException
}

fun good1(s:String?) {
    if (s != null) {
        s.length
    }
}
fun good2(s:String?) {
    s?.length
}
