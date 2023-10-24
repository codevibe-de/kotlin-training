package exrc.chpt_030

import org.assertj.core.api.Assertions

fun main() {
    val task1 = Task("Do something")
    Assertions.assertThat(task1.priority).isEqualTo(Task.DEFAULT_PRIO)

    val task2 = Task("Clean room", -99)
    Assertions.assertThat(task2.priority).isEqualTo(1)
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