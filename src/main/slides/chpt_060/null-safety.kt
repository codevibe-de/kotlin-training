package chpt_060

fun main() {
    var str: String? = "abc"
    str = null

    println(str ?: "default")

    val cntr = createContainer()
    println(cntr?.child?.index ?: "nothing here")

    cntr!!.child!!.index // java.lang.NullPointerException
}

fun createContainer(): Container? = null

data class Container(val child: Child?)
data class Child(val index: Int?)

fun bad(s: String?) {
//    println(s.length)   // does not compile
}

fun risky(s: String?) {
    println(s!!.length)   // might throw java.lang.NullPointerException
}

fun good1(s: String?) {
    val length: Int =
        if (s != null) s.length else 0
}

fun good2(s: String?) {
    val length: Int? = s?.length
}

fun good3(s: String?) {
    val length: Int = s?.length ?: 0
}
