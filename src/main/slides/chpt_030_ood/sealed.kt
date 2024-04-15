package chpt_030_ood

sealed class BaseError

class ServerError : BaseError()
class ClientError : BaseError()

fun main() {
    val err: BaseError = ServerError()
    when (err) {
        is ServerError -> {
            // alert dev-ops team!
        }

        is ClientError -> {
            // return error code
        }
    }
}