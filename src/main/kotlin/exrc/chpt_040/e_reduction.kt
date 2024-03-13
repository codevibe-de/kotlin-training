package exrc.chpt_040

import org.assertj.core.api.Assertions.assertThat

fun main() {
    var orders = listOf(
        Order(setOf("p1", "p2", "p5")),
        Order(setOf("p1", "p3", "p5")),
        Order(setOf("p3", "p4", "p5")),
    )

    val result = reduce(orders)
    assertThat(result).hasSize(5);
    assertThat(result).containsOnly("p1", "p2", "p3", "p4", "p5");

    val orderCount = countOrders(orders)
    assertThat(orderCount).hasSize(5)
    assertThat(orderCount).containsOnly(
        ("p1" to 2).toEntry(),
        ("p2" to 1).toEntry(),
        ("p3" to 2).toEntry(),
        ("p4" to 1).toEntry(),
        ("p5" to 3).toEntry(),
    );
}

fun reduce(orders: List<Order>): Set<String> {
    return orders
        .flatMap { it.productIds }
        .toSet();
}

fun countOrders(orders: List<Order>): Map<String, Int> {
    return orders
        .flatMap { it.productIds }
        .groupingBy { it }
        .eachCount()
}

class Order(val productIds: Set<String>)

// converts a Kotlin Pair to a Map.Entry
// https://discuss.kotlinlang.org/t/pair-should-implement-map-entry/11917
fun <K,V> Pair<K,V>.toEntry() = object: Map.Entry<K,V> {
    override val key: K = first
    override val value: V = second
}