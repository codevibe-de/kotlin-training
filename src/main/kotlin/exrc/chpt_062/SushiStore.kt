package exrc.chpt_062

fun main() {
    // prepare customers
    val peter = Customer("Peter Fox").apply {
        addPhoneNumber("+49 178 444 3333")
        addPhoneNumber("+49 89 200 100 100")
    }
    val john = Customer("John Deere").apply {
        addPhoneNumber("+49 89 200 100 100")
    }

    // prepare store
    val store = SushiStore()
        .prepareMaki()
        .prepareSurimi()
        .prepareSurimi()

    // fulfil order
    val orders = mutableListOf<SushiStore.Order>()
    store.fulfillOrder(peter, "Surimi").also { orders.add(it) }
    store.fulfillOrder(john, "Surimi").also { orders.add(it) }
    store.fulfillOrder(john, "Maki").also { orders.add(it) }

    // end-of-day
    println("Another fun day at the Sushi Store -- today we had these orders:")
    orders.forEach {
        println("- ${it.customer.name} ordered ${it.meal}")
    }
}


data class Customer(
    val name: String,
) {
    private val phoneNumbers: MutableList<String> = mutableListOf()
    fun addPhoneNumber(ph: String?) = ph?.let { this.phoneNumbers.add(it) }
}


class SushiStore {
    private val preparedMeals = mutableListOf<String>()

    fun prepareSurimi(): SushiStore = this.apply { this.preparedMeals.add("Surimi") }
    fun prepareMaki(): SushiStore = this.apply { this.preparedMeals.add("Maki") }

    fun fulfillOrder(customer: Customer, meal: String): Order {
        require(meal.isNotBlank()) { "Argument 'meal' must not be blank" }
        check(preparedMeals.contains(meal)) { "Sorry - we are out of $meal!!!" }
        preparedMeals.remove(meal)
        return Order(customer, meal)
    }

    data class Order(
        val customer: Customer,
        val meal: String,
    )
}


