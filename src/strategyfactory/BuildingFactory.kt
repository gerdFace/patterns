package strategyfactory

import java.util.HashMap

object BuildingFactory {

    private var instances: MutableMap<String, Building> = HashMap()

    init {
        instances.put("house", House())
        instances.put("edifice", Edifice())
    }

    fun <T : Building> getBuilding(type: String): T {
        @Suppress("UNCHECKED_CAST")
        return instances[type] as T
    }
}
