import java.util.*

fun main() {
    val res = Cal() // Default Constructor
    println(res.sum(2,3))

    val p1 = Person("Tejas" , 23)

    // Setter method
    p1.age = 22
    println(p1.age)
    p1.age = -12 // age can't be negative, so we use setter method to avoid this bug
    // by the use of setter method it will not allow assigning the negative value to variable

    // Getter method
    println(p1.name)



}

class Cal // if you do not define any constructor here, then it will call default constructor when you create an object
{
    lateinit var  message : String // lateinit variable
    fun sum(a:Int, b:Int) : Int{
        return a+b
    }
}

// Example of getter and setter methods in kotlin
class Person(nameparam : String , ageparam:Int) {

    // getter method example
    var name = nameparam
        get() = field.uppercase()

    // setter method example
    var age = ageparam
        set(value) {
            if(value > 0){
                field = value
            }
            else{
                println("Age can't be negative")
            }
        }

    // Default syntax of kotlin to assign getter and setter method
    var email:String = ""
        get() = field
        set(value) {field = value}

}

