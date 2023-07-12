package chpt_051

interface HQ<T> {
    fun buildBarracks(): Building<T, Infantry>
}

class CommandCenter : HQ<InfantryType> {
    override fun buildBarracks(): Building<InfantryType, Infantry> {
        return Barracks()
    }
}

class Hive : HQ<ZergInfantryType> {
    override fun buildBarracks(): Building<ZergInfantryType, Infantry> {
        return SpawningPool()
    }

}

enum class ZergInfantryType {
    ZERGLING
}

class SpawningPool : Building<ZergInfantryType, Infantry> {
    override fun build(type: ZergInfantryType): Infantry {
        return when(type) {
            ZergInfantryType.ZERGLING -> Zergling()
        }
    }

}

class Zergling : Infantry
