package chpt_053

sealed class State {
    abstract fun powerButtonPressed(): State
    abstract fun next(): State
    override fun toString(): String {
        return javaClass.simpleName
    }
    fun wait() {}
}

// this is "the context"
data class Computer(private var state: State = Off) {
    fun pressOnOff() {
        state = state.powerButtonPressed()
    }

    fun waitAWhile() {
        state.wait()
        state = state.next()
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

    override fun next(): State {
        return Off
    }
}

object Booting : State() {
    override fun powerButtonPressed(): State {
        return Off
    }

    override fun next(): State {
        return Running
    }
}

object Running : State() {
    override fun powerButtonPressed(): State {
        return Shutdown
    }

    override fun next(): State {
        return Running
    }
}

object Shutdown : State() {
    override fun powerButtonPressed(): State {
        return Shutdown
    }

    override fun next(): State {
        return Off
    }
}

