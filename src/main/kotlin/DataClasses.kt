fun main() {

    val p1 = person(1,"Tejas")
    val p2 = person(2,"kt")

    val p3 = p1.copy() // function from data class
    val (id , name) = p2 // destruct from data class
    println(p3.component2()) // component or destructuring from data class
    println(name)
}

data class person(val id : Int , val name : String){

    /*

    => we don't have to user getters and setter methods for data classes properties like we use in java.
    => data classes by default generate the getters and setter method.
    => toString methods are by default method in data classes also the copy method which copy the object.

    */

}