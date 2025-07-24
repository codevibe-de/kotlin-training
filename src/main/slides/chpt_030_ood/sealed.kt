package chpt_030_ood

sealed class BaseError

class ServerError : BaseError()
class ClientError : BaseError()

fun main() {
    val err: BaseError = operate()
    val msg = when (err) {
        is ServerError -> {
            "alert dev-ops team!"
        }
        is ClientError -> {
            "selbst schuld"
        }
    }
    println(msg)
}


fun operate(): BaseError = ServerError()