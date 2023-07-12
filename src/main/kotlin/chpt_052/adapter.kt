package chpt_052

interface UsbC
interface UsbA

class Phone {
    fun charge(usbPlug: UsbC) {}
}

fun main() {
    val existingPlug: UsbA = object : UsbA {}
    Phone().charge(Adapter(existingPlug))
}

// adapts from USB-A to USB-C
class Adapter(private val usbA: UsbA) : UsbC {
}