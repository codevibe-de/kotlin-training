package chpt_030_ood

import java.util.UUID

abstract class IdGenerator {
    abstract val name: String
    abstract fun generateId(maxLength:Int): String
}

class UUidGenerator(override val name: String) : IdGenerator() {
    override fun generateId(maxLength:Int): String {
        return UUID.randomUUID().toString().substring(0, maxLength)
    }
}