/*
*  Polymorphism says: A Parent can hold a reference to its child and call the method of child classes
*
* */

fun main() {

    val objCircle : Shape = Circle(2.3)
    val objSquar : Shape = Squar(3.0)

    println(objCircle.area())
    println(objSquar.area())

    /*
       // advantage of polymorphism:

        you don't need to create an object of every class
        when the same method is overridden

        just you need to create an object of parent class it will call the method of child class

    */

    val shapes = arrayOf(Circle(2.5) , Squar(4.5) )

    calculateArea(shapes)
}

fun calculateArea(shapes : Array<Shape>){
    for(shape in shapes){
        println(shape.area())
    }
}

open class Shape{
    open fun area(): Double{
        return 0.0
    }
}

class Circle(val radius:Double) : Shape(){
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

class Squar(val side:Double) : Shape(){
    override fun area(): Double {
        return  side * side
    }
}