package chpt_051

interface HQ<T> {
    fun buildBarracks(): Building<T, Infantry>
}

class CommandCenter : HQ<InfantryType> {
    override fun buildBarracks(): Building<InfantryType, Infantry> {
        return object : Building<InfantryType, Infantry> {
            override fun build(type: InfantryType): Infantry {
                return when (type) {
                    InfantryType.MARINE -> Marine()
                    InfantryType.FIREBAT -> Firebat()
                }
            }
        }
    }
}

class Hive : HQ<ZergInfantryType> {
    override fun buildBarracks(): Building<ZergInfantryType, Infantry> {
        return object : Building<ZergInfantryType, Infantry> {
            override fun build(type: ZergInfantryType): Infantry {
                return when (type) {
                    ZergInfantryType.ZERGLING -> Zergling()
                }
            }
        }
    }
}

enum class ZergInfantryType {
    ZERGLING
}

class Zergling : Infantry
