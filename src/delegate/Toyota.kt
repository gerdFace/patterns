package delegate

class Toyota : Car {

    override val spoiler: Boolean
        get() = true

    override val mpg: String
        get() = "30-40 MPG"

    override val color: String
        get() = "Red, Black, Green, White, Grey"

    override fun description(): String {
        return ("Has Spoiler: $spoiler, MPG: $mpg, Color: $color")
    }
}