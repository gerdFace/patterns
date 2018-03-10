package factory

object FBuildingFactory {

    fun <T : FBuilding> getFBuilding(hasAddress: Boolean): T {
        return if (hasAddress) {
            @Suppress("UNCHECKED_CAST")
            FHouse() as T
        } else {
            @Suppress("UNCHECKED_CAST")
            FEdifice() as T
        }
    }

}
