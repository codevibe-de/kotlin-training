package exrc.chpt_030

fun main() {
    val runnable = PrintHelloRunnable()

    val dlgTask = DelegatingTask("Do something", runnable = runnable)
    dlgTask.run()
}

abstract class AbstractTask(
    val name: String,
    initialPriority: Int = DEFAULT_PRIO,
) : Runnable {
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


class DelegatingTask(
    name: String,
    initialPriority: Int = DEFAULT_PRIO,
    private val runnable: Runnable,
) : AbstractTask(name, initialPriority) {

    override fun run() {
        runnable.run()
    }

}


class PrintHelloRunnable : Runnable {
    override fun run() {
        println("Hello!!")
    }

}