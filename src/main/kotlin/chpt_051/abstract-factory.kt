package chpt_051

interface HQ<T,U> {
    fun buildBarracks(): Building<T, U>
}

class CommandCenter : HQ<InfantryType, Infantry> {
    override fun buildBarracks(): Barracks {
        return Barracks()
    }
}