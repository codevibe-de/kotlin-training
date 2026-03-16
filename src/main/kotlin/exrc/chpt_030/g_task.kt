package exrc.chpt_030

fun main() {
    val task1 = Task("Do something")
    check(task1.priority == Task.DEFAULT_PRIO)

    val task2 = Task("Clean room", -9)
    check(task2.priority == 1.toByte())

    task2.priority = 100 // yeah, let's clean up!
    check(task2.priority == 5.toByte())
}

class Task(
    val name: String,
    initialPriority: Byte = DEFAULT_PRIO
) {
    var priority: Byte = validPriority(initialPriority)
        set(value) {
            field = validPriority(value)
        }

    private fun validPriority(p: Byte) = p.coerceIn(MIN_PRIO, MAX_PRIO)

    companion object {
        const val MIN_PRIO: Byte = 1
        const val MAX_PRIO: Byte = 5
        const val DEFAULT_PRIO: Byte = 3
    }
}