package exrc.chpt_030

import org.assertj.core.api.Assertions.assertThat

fun main() {
    val task1 = Task("Do something")
    assertThat(task1.priority).isEqualTo(Task.DEFAULT_PRIO)

    val task2 = Task("Clean room", -9)
    assertThat(task2.priority).isEqualTo(1)

    task2.priority = 100 // yeah, let's clean up!
    assertThat(task2.priority).isEqualTo(5)
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