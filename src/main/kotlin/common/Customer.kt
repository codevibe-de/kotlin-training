package common

data class Customer(
    val id: Long,
    val firstName: String,
    val lastName: String,
)


class CustomerService {

    private val records = mutableMapOf<Long, Customer>()

    fun storeCustomer(customer: Customer) {
        records.putIfAbsent(customer.id, customer)
            ?.let { throw IllegalStateException("Customer already exists") }
    }

}