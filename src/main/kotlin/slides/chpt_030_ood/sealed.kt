package slides.chpt_030_ood

sealed interface MyType

sealed class BaseError

class X : BaseError(), MyType
class Y : BaseError(), MyType

fun main() {
    val obj: MyType = X()
    when (obj) {
        is X -> { println("X") }
        is Y -> { println("Y") }
    }
}