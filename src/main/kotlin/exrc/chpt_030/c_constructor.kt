package exrc.chpt_030

class SuperString(val value:String) {

    constructor(ch:Char, count:Int) : this(ch.toString().repeat(count))

    constructor(unicode:Int) : this(unicode.toChar().toString())

    override fun toString() = value

}

fun main() {
    println(SuperString("hallo"))
    println(SuperString('-', 30))
    println(SuperString(3000))
}