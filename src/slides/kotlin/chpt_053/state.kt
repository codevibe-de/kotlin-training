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
    override fun powerButtonPressed(): State {
        return Booting
    }

    override fun timeElapsed(): State {
        return Off
    }
}

object Booting : State() {
    override fun powerButtonPressed(): State {
        return Off
    }

    override fun timeElapsed(): State {
        return Running()
    }
}

// this state is stateful, hence it is a class, not an object
class Running : State() {

    private val memory: String = "0x000"

    override fun powerButtonPressed(): State {
        return Shutdown
    }

    override fun timeElapsed(): State {
        return this
    }
}

object Shutdown : State() {
    override fun powerButtonPressed(): State {
        return Shutdown
    }

    override fun timeElapsed(): State {
        return Off
    }
}

