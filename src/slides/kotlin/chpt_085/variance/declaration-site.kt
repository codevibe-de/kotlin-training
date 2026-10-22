package chpt_085.variance

interface Producer<out T> { fun get(): T }
interface Consumer<in T> { fun put(item: T) }

fun demo(
    cats: Producer<Cat>,
    all: Consumer<Animal>
) {
    // ok thanks to out / in:
    val animals: Producer<Animal> = cats
    val catBin: Consumer<Cat> = all
}
