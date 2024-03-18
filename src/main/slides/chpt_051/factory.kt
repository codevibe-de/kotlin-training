package chpt_051

interface Unit

interface Infantry : Unit

enum class InfantryType {
    MARINE,
    FIREBAT
}

interface Building<T, U> {
    fun build(type: T): U
}

class Barracks : Building<InfantryType, Infantry> {
    override fun build(type: InfantryType): Infantry {
        return when (type) {
            InfantryType.MARINE -> Marine()
            InfantryType.FIREBAT -> Firebat()
        }
    }
}

fun main() {
    val factory = Barracks()
    val units = listOf(
        factory.build(InfantryType.MARINE),
        factory.build(InfantryType.MARINE),
        factory.build(InfantryType.FIREBAT),
    )
}


class Marine : Infantry

class Firebat : Infantry