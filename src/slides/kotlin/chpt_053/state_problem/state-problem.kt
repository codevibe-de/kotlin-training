package chpt_053.state_problem

class Computer {
    private var state = "off"
    fun pressPower() {
        state = when (state) {
            "off" -> "booting"
            "booting" -> "off"
            "running" -> "shutdown"
            else -> state
        }
    }

    fun timeElapsed() {
        state = when (state) {
            "booting" -> "running"
            "shutdown" -> "off"
            else -> state
        }
    }
}
