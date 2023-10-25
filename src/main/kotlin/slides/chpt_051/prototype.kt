package slides.chpt_051

import java.io.File

fun main() {
    // create initial prototype
    val prototype = ComplexSetup(1.2, 300, 5, File("dest.txt"))
    
    // create clone with adjustements
    val clone = prototype.copy(factor = 1.00)
    
}


data class ComplexSetup(
    val factor: Double,
    val offset: Int,
    val trimPercent: Byte,
    val destination: File,
)