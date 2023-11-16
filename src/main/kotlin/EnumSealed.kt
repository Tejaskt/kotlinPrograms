/*
*   enum classes: there are set of values you can declare
*   sealed classes: there are set of types you can declare
*
* */

fun main() {

    val day = Day.satureday

    println( day.number)
    day.Printday()

     // sealed classes
    val points = when(val tiles : Tiles = Red("Mushroom" , 25)){
        is Blue -> tiles.points * 2
        is Red -> tiles.points * 5
    }

    println(points)
}

enum class Day(val number: Int) {

    Sunday(1),
    monday(2),
    tuesday(3),
    wednesday(4),
    thursday(5),
    friday(6),
    satureday(7);
    fun Printday() = println("Day is $this")

}

    // Sealed classes

sealed class Tiles // Abstract class
class Red(val type:String, val points:Int) :Tiles()
class Blue(val points:Int) : Tiles()

