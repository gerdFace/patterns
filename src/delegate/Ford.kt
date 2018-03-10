package delegate

class Ford : Car {

    override val spoiler: Boolean
        get() = false

    override val mpg: String
        get() = "40-50 MPG"

    override val color: String
        get() = "Red, Black, Green, White, Grey"

    override fun description(): String {
        return ("Has Spoiler: $spoiler, MPG: $mpg, Color: $color")
    }
}