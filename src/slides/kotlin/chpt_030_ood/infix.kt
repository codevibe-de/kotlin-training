package chpt_030_ood

infix fun Boolean.eitherOr(that: Boolean) = this.xor(that)

class Student(name: String) {
    infix fun isEnrolledIn(courseId: String) = false
}

fun main() {
    println(true eitherOr false)
    Student("Tom") isEnrolledIn "THEOR.INF-1"
}
