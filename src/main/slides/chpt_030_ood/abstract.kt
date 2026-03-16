package chpt_030_ood

import java.util.*

// Ich manage das "length" property, damit es kein anderer machen muss
abstract class IdGenerator(protected val length: Int) {
    abstract val name: String
    abstract fun generateId(): String
}


// Ich stelle (wie auch immer) einen Namen zur Verfügung
class UUidGenerator(
    override val name: String,
    length: Int
) : IdGenerator(length) {

    override fun generateId(): String {
        return UUID.randomUUID()
            .toString()
            .substring(0, length)
    }
}

class XyGenerator(length: Int) : IdGenerator(length) {
    override val name: String
        get() = "Xy"
    override fun generateId(): String = ""
}