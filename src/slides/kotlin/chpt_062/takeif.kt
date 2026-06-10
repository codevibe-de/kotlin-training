package chpt_062

fun main() {
    val ch = defaultChannel()
        .takeUnless { it.connected }?.let {
            println("Connecting channel...")
            it.connect()
        }
}

interface OutputChannel {
    val connected: Boolean
    fun connect()
}

fun defaultChannel() = object : OutputChannel {
    override var connected: Boolean = true
    override fun connect() {
        connected = true
    }
}

