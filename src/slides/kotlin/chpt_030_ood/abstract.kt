package chpt_030_ood

import java.util.*

// I manage the "length" property, so nobody else has to
abstract class IdGenerator(protected val length: Int) {
    abstract val name: String
    abstract fun generateId(): String
}


// I provide a name (one way or another)
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