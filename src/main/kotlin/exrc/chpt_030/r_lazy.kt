package exrc.chpt_030

import java.util.*


fun main() {
    val task = IdentifiableTask("clean desk", IdentifiableTask.MIN_PRIO)
    println(task.name + "\t" + task.id)
}

class IdentifiableTask(
    val name: String,
    initialPriority: Int = DEFAULT_PRIO
) {
    var priority: Int = validPriority(initialPriority)
        set(value) {
            field = validPriority(value)
        }

    val id: String by lazy {
        println("generating id...")
        UUID.randomUUID().toString()
    }

    init {
        println("task initialized")
    }

    private fun validPriority(p: Int) = p.coerceIn(MIN_PRIO..MAX_PRIO)

    companion object {
        const val MIN_PRIO = 1
        const val MAX_PRIO = 5
        const val DEFAULT_PRIO = 3
    }
}