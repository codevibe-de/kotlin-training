package slides.chpt_020

var b: Boolean = true
val c: Char = 'a' // '\u0040'

val n8: Byte = 127
val n16: Short = 32_767
val n32: Int = 2_147_483_647
val n64: Long = 9_223_372_036_854_775_807

val u8: UByte = 255u
val u16: UShort = 65_535u
val u32: UInt = n32.toUInt() * 2u
val u64: ULong = n64.toULong() * 2u

val f32: Float = 3.141592f
val f64: Double = 0.0

val str: String = "abc"

fun main() {
}