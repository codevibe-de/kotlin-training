package chpt_052

class AuditingStack<T>(
    private val auditConsumer: (String) -> Unit,
    private val auditFormatter: (T) -> String,
) {
  fun push(t:T) {
      val msg = auditFormatter(t)
      auditConsumer(msg)
      // push to stack
  }
}

fun main() {
    val stack = AuditingStack<Int>(
        { s -> println(s) },
        { n -> "Pushing %d to stack".format(n) }
    )
    stack.push(1)
    stack.push(2)
}