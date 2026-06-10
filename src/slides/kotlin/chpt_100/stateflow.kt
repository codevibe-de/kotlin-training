package chpt_100

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class CounterViewModel {
    private val _count = MutableStateFlow(0)
    val count = _count.asStateFlow()

    fun increment() {
        _count.value++
    }

    fun startAutoIncrement() {
        CoroutineScope(Dispatchers.Default).launch {
            while (true) {
                delay(1000)
                increment()
            }
        }
    }
}

fun main() {
    runBlocking {
        val vm = CounterViewModel()

        // State beobachten
        val job = launch {
            vm.count.collect { value ->
                println("Count: $value")
            }
        }

        vm.startAutoIncrement()
        delay(3500)
        job.cancel()
    }
}