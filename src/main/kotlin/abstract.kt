/*
  Abstraction:
    1) we cannot create an instance of abstract class

    2) abstract class may have abstract methods as well as not abstract methods

    3) abstract methods:
       those methods which body is not defined yet are called abstract methods

    4) if you don't want to allow creating an instance of a class, then make it an abstract class
 */

fun main() {

    val circle1 = Circle1(4.5)
    println(circle1.area())
}

abstract class Shape1{
    abstract fun area(): Double
}

class Circle1(private val radius:Double) : Shape(){
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}
