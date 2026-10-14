package chpt_053

sealed class State {
    abstract fun powerButtonPressed(): State
    abstract fun timeElapsed(): State
    override fun toString(): String {
        return javaClass.simpleName
    }
}

// this is "the context"
data class Computer(private var state: State = Off) {
    fun pressOnOff() {
        state = state.powerButtonPressed()
    }

    fun waitAWhile() {
        state = state.timeElapsed()
    }
}

fun main() {
    val pc = Computer()
    println(pc)
    pc.pressOnOff()
    println(pc)
    pc.waitAWhile()
    println(pc)
}

object Off : State() {
    override fun powerButtonPressed() = Booting
    override fun timeElapsed() = Off
}

object Booting : State() {
    override fun powerButtonPressed() = Off
    override fun timeElapsed() = Running()
}

// stateful, hence a class, not an object
class Running : State() {
    private val memory = "0x000"
    override fun powerButtonPressed() = Shutdown
    override fun timeElapsed() = this
}

object Shutdown : State() {
    override fun powerButtonPressed() = Shutdown
    override fun timeElapsed() = Off
}

