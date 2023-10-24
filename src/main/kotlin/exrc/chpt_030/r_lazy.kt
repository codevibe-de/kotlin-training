package exrc.chpt_030

import java.util.UUID

fun main() {
    val task = IdentifiableTask("test")
    println(task)
    println(task.id)
}


class IdentifiableTask(
    val name: String,
    initialPriority: Byte = DEFAULT_PRIO
) {
    var priority: Byte = validPriority(initialPriority)
        set(value) {
            field = validPriority(value)
        }

    val id by lazy {
        println("Generating id...")
        UUID.randomUUID().toString()
    }

    private fun validPriority(p: Byte) = p.coerceIn(MIN_PRIO, MAX_PRIO)

    companion object {
        const val MIN_PRIO: Byte = 1
        const val MAX_PRIO: Byte = 5
        const val DEFAULT_PRIO: Byte = 3
    }
}