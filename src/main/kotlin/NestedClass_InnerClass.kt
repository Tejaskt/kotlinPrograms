fun main() {

    // outer class object
    val obj = Outer()
    obj.i

    // nested class object
    val nested = Outer.Nested()
    nested.test1()

    // inner class object: First you need to create an outer class object, then you can create the inner class object
    val inner1 = Outer().Inner()
    inner1.test2()

}

class Outer{
    var i = 21

    class Nested{
        // here you cannot access the "i" variable of outer class
        // to do that user inner class
        fun test1() = println("I am nested class")
    }
    inner class Inner{

        // By using inner keyword you can use the properties and methods of outer class
        fun test2() = println("I am inner class $i")
    }
}