package chpt_053

sealed class State {
    abstract fun powerButtonPressed(): State
    abstract fun timeElapsed(): State
    override fun toString(): String {
        return javaClass.simpleName
    }
}

class Computer {
    var state: State = Off
        private set

    fun pressOnOff() {
        state = state.powerButtonPressed()
    }

    fun waitAWhile() {
        state = state.timeElapsed()
    }
}

fun main() {
    val pc = Computer()
    println(pc.state)
    pc.pressOnOff()
    println(pc.state)
    pc.waitAWhile()
    println(pc.state)
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

