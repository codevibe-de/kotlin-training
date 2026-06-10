package chpt_085

// Producer == read-only, that's easily done with a "val" property
class ProducingBox<out T>(val value: T)

// Consumer == write-only, that requires a bit of effort
class ConsumingBox<in T>(value: T? = null) {
    private var _value: Any? = value
    fun get(): Any? = _value    // unspecific read is okay, but `get():T` is not
    fun put(value:T) { _value = value }
}


fun main() {
    val producingBox: ProducingBox<String> = ProducingBox("asdads")
    readCharSequence(producingBox)

    val consumingBox = ConsumingBox<CharSequence?>()
    addStringToBox(consumingBox)
}


fun readCharSequence(box: ProducingBox<CharSequence>) {
    val cs: CharSequence = box.value
}


fun addStringToBox(box: ConsumingBox<String>) {
    box.put("Hier du gehst!")
}