package slides.chpt_030_ood

class DiameterMath {
    companion object {
        const val PI = 3.14159265
        fun calc(diameter: Double) = diameter * PI
    }

    private fun calcDiameter(diameter: Double) = diameter * PI
}

fun main() {
    val instance = DiameterMath()
    //println(instance.PI) // doesn't compile!
    println(DiameterMath.PI)
    println(DiameterMath.calc(100.toDouble()))
}