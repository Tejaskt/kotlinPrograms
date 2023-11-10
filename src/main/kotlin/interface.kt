// in interface, we divide classes based on their behavior
fun main() {
    dragy(arrayOf(Circley(1.2), Squary(2.3), Persony("Tejas")))

    val arr = arrayOf(Circley(3.4), Persony("Tejas"))

    for (obj in arr) {
        if (obj is Circley) {
            // we do type checking using "is" operator
            println(obj.area1()) // here smart casting is working
        } else {
            // we do casting using as operator
            (obj as Persony).saymyname()
        }
    }
}

fun dragy(drag: Array<Draging>) {
    for (obj in drag) {
        println(obj.drag())
    }
}

interface Draging {
    fun drag()
}

abstract class Shapey : Draging {
    abstract fun area1(): Double
}

class Circley(private val radius: Double) : Shapey() {
    override fun area1(): Double = Math.PI * radius * radius
    override fun drag() = println("circle is dragging")

}

class Squary(private val side: Double) : Shapey() {
    override fun area1(): Double = side * side
    override fun drag() = println("Square is dragging")
}

class Persony(private val name: String) : Draging {
    override fun drag() = println("$name is dragging")

    fun saymyname() = println("$name is my name")
}

