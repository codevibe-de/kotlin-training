package chpt_062

import kotlin.random.Random

// public inline fun <T, R> T.let(block: (T) -> R): R

fun main() {
    // without
    val mailSender = mailSender()
    var resultCode = if (mailSender != null) {
        mailSender.configure()
        mailSender.sendMail("Ladies And Gentlemen")
    } else {
        -1
    }

    // with
    resultCode = mailSender()?.let {
        it.configure()
        it.sendMail("Ladies And Gentlemen")
    } ?: -1
}

fun generateStringOrNull() =
    if (Random.nextBoolean()) "hello!" else null


fun mailSender(): MailSender? =
    if (Random.nextBoolean()) DefaultMailSender else null

object DefaultMailSender : MailSender {
    override fun configure() = TODO("Not yet implemented")
    override fun sendMail(mail: String): Int = TODO("Not yet implemented")
}

interface MailSender {
    fun configure()
    fun sendMail(mail: String): Int
}