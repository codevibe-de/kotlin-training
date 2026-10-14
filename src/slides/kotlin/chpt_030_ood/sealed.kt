package chpt_030_ood

sealed class BaseError

class ServerError : BaseError()
class ClientError : BaseError()

fun main() {
    val err: BaseError = operate()
    val msg = when (err) {
        is ServerError -> "alert dev-ops team!"
        is ClientError -> "client's fault"
    }
    println(msg)
}


fun operate(): BaseError = ServerError()