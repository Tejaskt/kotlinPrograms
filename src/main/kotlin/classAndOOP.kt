fun main() {

    val mustang = Car("mustang" , "petrol" , 300 , true)
    val bmw = Car("bmw" , "Diesel" , 200 , false)

    println(mustang.name)
    println(mustang.airbag)

    mustang.drive()
    bmw.drive()

    // Secondary constructor example
    val tejas = Student("Tejas" , 22) // here the use of secondary constructor
    val ravi = Student("Ravi" , "BCA" , 20) // you can also call primary constructor

    println(tejas.std)
    println(ravi.std)
}

class Car(val name:String , val type:String , val kmrun:Int , hasairbag:Boolean) // here car(parameters) is a primary constructor
{
    // to execute a set of statements when you create an object, you need to define initializer block
    init {
        println("$name is created")
    }
    // here a name, type and kmrun are the variable with properties,
    // but hasairbag is a parameter which properties not defined

    val airbag = hasairbag // by this we can define the properties

    init {
        println("Second initializer block")
    }
    fun drive(){
        println("$name Car is driving")
    }
}

// Example of secondary constructor

// so when some properties of class are fixed, then you don't need to write it over times you can use secondary constructor

// here in this class the std is fixed BScIT, so you don't need to pass it when ever you create an object
class Student(val name: String , val std:String , val age : Int){

    constructor(nameparam:String, ageparam : Int) :
            this(nameparam,"BScIT" , ageparam)

}

