package chpt_030_ood

class Report(val orders: List<Int>) {
    val total: Int by lazy {
        println("calculating ...")
        orders.sum()
    }
}

fun main() {
    val r = Report(listOf(10, 20, 30))
    println("report created")
    println(r.total)   // calculating ... 60
    println(r.total)   // 60 (cached)
}
