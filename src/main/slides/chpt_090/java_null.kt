package chpt_090

fun main() {
    customer()
}


fun customer() {
    val c = JavaCustomer()
    val n1: String? = c.name // platform type "String!"

    println(n1 ?: "unknown name")

    c.address?.let {
        println("City is ${it.city}")
    }

    val n2: String = c.name // NPE
}


fun customerId() {
    val c = JavaCustomer()
    val id = c.id // not a platform type but "String"

}


fun foo() {
    val list = ArrayList<String>() // non-null (constructor result)
    list.add("Item")
    val size = list.size // non-null (primitive int)
    val item: String = list[0] // platform type inferred (ordinary Java object)
}