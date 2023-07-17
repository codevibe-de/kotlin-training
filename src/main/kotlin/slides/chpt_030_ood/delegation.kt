package slides.chpt_030_ood

class AuditingList<E>(private val delegate:MutableList<E>) : MutableList<E> by delegate {
    override fun add(element: E): Boolean {
        println("Adding element $element")
        return delegate.add(element)
    }
}

fun main() {
    val list = AuditingList(mutableListOf<String>())
    list.add("one")
}