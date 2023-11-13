package exrc.chpt_060

sealed interface Employee {
    val monthlyPayOut: Int
    val supervisor: Employee?
}

/**
 * Hired employees can be identified by their last name.
 */
data class HiredEmployee(
    val lastName: String,
    val salary: Int,
    override val supervisor: Employee? = null
) : Employee {
    override val monthlyPayOut: Int
        get() = salary / 12
}


/**
 * Freelance employees can be identified by their anonymous freelance-id.
 */
data class FreelanceEmployee(
    val freelanceId: String,
    val hoursPerMonth: Int,
    val hourlyRate: Int,
    override val supervisor: Employee?
) : Employee {
    override val monthlyPayOut: Int
        get() = hourlyRate * hoursPerMonth
}


fun main() {
    val kate = HiredEmployee("Sebos", 100_000)
    val fred = FreelanceEmployee(freelanceId = "X233", hoursPerMonth = 120, hourlyRate = 80, supervisor = kate)
    val bruce = HiredEmployee("Lee", salary = 65_000, fred)
    val angie = FreelanceEmployee(freelanceId = "A002", hoursPerMonth = 50, hourlyRate = 80, supervisor = fred)
    
    val employees = listOf(kate, fred, bruce, angie)
    
    showMonthlyPayouts(employees)
    employees.forEach(::printOverallSupervisor)
}


val identifierProducer: (Employee) -> String = {
    when(it) {
        is FreelanceEmployee -> it.freelanceId
        is HiredEmployee -> it.lastName
    }
}


/**
 * Shows the montly payout for each employee together with their identification (name or freelance-id)
 */
fun showMonthlyPayouts(employees: List<Employee>) {
    val map: Map<String, List<Employee>> = employees.groupBy {
        when(it) {
            is FreelanceEmployee -> it.freelanceId
            is HiredEmployee -> it.lastName
        } }
}


/**
 * Prints the top-most supervisor of this employee - or "none", if there is none.
 */
fun printOverallSupervisor(employee: Employee) {
    val seq = generateSequence(employee.supervisor) { it.supervisor }
    println(seq.lastOrNull() ?: "none")
}

