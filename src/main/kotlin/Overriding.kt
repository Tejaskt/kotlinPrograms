/*
    In Kotlin, Every class has superclass which is *Any Class*
    its methods are toString, equal hashcode
*/

fun main() {

    val onePlusMobile = Oneplus("Smartphone")
    println( onePlusMobile.name)
    onePlusMobile.display()
    println(onePlusMobile.toString())

    val simpleMobile = Mobile("Generalphone")
    println( simpleMobile.name)
    simpleMobile.display()
}

// make sure you write open keyword before any properties or method you want to use in child class
open class Mobile(val type:String){

    open val name : String = "Simple Mobile"

    fun makecall() = println("Making call")
    open fun display() = println("Simple mobile display")
}

class Oneplus(typeparam : String) : Mobile(typeparam){

    // use override keyword to override any properties or methods from parent class
    override val name: String = "One plus"
    override fun display() = println("One plus display")

    override fun toString(): String {
        return "Oneplus(name='$name')"
    }
}