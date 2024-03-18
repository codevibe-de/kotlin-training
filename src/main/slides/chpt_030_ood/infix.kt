package slides.chpt_030_ood

infix fun Boolean.entwederOder(that: Boolean) = this.xor(that)

class Student(name: String) {
    infix fun isEnrolledIn(courseId: String) = false
}

fun main() {
    println(true entwederOder false)
    Student("Tom") isEnrolledIn "THEOR.INF-1"
}
