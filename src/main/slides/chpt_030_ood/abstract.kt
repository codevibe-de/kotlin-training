package chpt_030_ood

import java.util.*

abstract class IdGenerator(protected val length: Int) {
    abstract val name: String
    abstract fun generateId(): String
}


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