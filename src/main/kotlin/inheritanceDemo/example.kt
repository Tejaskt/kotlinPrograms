package inheritanceDemo

fun main() {

    val obj = Child()

}

// must use open keyword to make class available for inheriting
open class Parent{
    init {
        println("Parent constructor is called")
    }
}

class Child : Parent(){
    init {
        println("Child constructor is called")
    }
}