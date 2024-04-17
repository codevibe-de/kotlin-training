package exrc.chpt_062

fun main() {
    // prepare customers
    val peter = Customer("Peter Fox")
    peter.addPhoneNumber("+49 178 444 3333")
    peter.addPhoneNumber("+49 89 200 100 100")
    // todo add another customer named "john"

    // prepare store
    val store = SushiStore()
    store.prepareMaki()
    store.prepareSurimi()
    store.prepareSurimi()

    // fulfil order
    val orders = mutableListOf<SushiStore.Order>()
    orders.add(store.fulfillOrder(peter, "Surimi"))
    // todo uncomment this
//    orders.add(store.fulfillOrder(john, "Surimi"))
//    orders.add(store.fulfillOrder(john, "Maki"))

    // end-of-day
    println("Another fun day at the Sushi Store -- today we had these orders:")
    orders.forEach {
        println("- ${it.customer.name} ordered ${it.meal}")
    }
}


data class Customer(
    val name: String,
) {
    val phoneNumbers: MutableList<String> = mutableListOf()
    fun addPhoneNumber(ph: String?) {
        if (ph != null) {
            this.phoneNumbers.add(ph)
        }
    }
}


class SushiStore {
    private val preparedMeals = mutableListOf<String>()

    fun prepareSurimi(): SushiStore {
        this.preparedMeals.add("Surimi")
        return this
    }

    fun prepareMaki(): SushiStore {
        this.preparedMeals.add("Maki")
        return this
    }

    fun fulfillOrder(customer: Customer, meal: String): Order {
        if (!preparedMeals.contains(meal)) {
            throw IllegalStateException("Sorry - we are out of $meal!!!")
        }
        preparedMeals.remove(meal)
        return Order(customer, meal)
    }

    data class Order(
        val customer: Customer,
        val meal: String,
    )
}


