import delegate.Camry
import delegate.Car
import delegate.Ford
import delegate.Toyota
import factory.FBuilding
import factory.FBuildingFactory
import strategyfactory.Building
import strategyfactory.BuildingFactory

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        val house = BuildingFactory.getBuilding<Building>("house")
        val edifice = BuildingFactory.getBuilding<Building>("edifice")

        println(house.name() + " " + house.type())
        println(edifice.name() + " " + edifice.type())

        val fHouse = FBuildingFactory.getFBuilding<FBuilding>(true)
        val fEdifice = FBuildingFactory.getFBuilding<FBuilding>(false)

        println(fHouse.name)
        println(fEdifice.name)

        val camry: Camry = Camry(Toyota())
        val notCamry: Camry = Camry(Ford())

        println(camry.description())
        println(notCamry.description())
    }
}
