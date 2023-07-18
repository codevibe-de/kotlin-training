package exrc.chpt_030

import org.assertj.core.api.Assertions

fun main() {
    val task1 = Task("Do something")
    Assertions.assertThat(task1.priority).isEqualTo(Task.DEFAULT_PRIO)

    val task2 = Task("Clean room", -1000)
    Assertions.assertThat(task2.priority).isEqualTo(1)
}

class Task(
    val name:String,
    initialPriority: Int = DEFAULT_PRIO
) {
    var priority: Int = validPriority(initialPriority)
        set(value) {
            field = validPriority(value)
        }

    private fun validPriority(p: Int) = p.coerceIn(MIN_PRIO..MAX_PRIO)

    companion object {
        const val MIN_PRIO = 1
        const val MAX_PRIO = 5
        const val DEFAULT_PRIO = 3
    }
}