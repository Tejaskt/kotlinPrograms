// Also known as Utility functions

fun main() {

    val emp = Emp()
    emp.age = 20
    emp.name = "Kt"

// ========>  apply utility function: We can use it when we want to set multiple properties to an object
    emp.apply { // this reference
        age = 23
        name = "Tejas"
    }

// =========>  let function: If you want to perform multiple operation on a single object, then use let

    println(emp.name)
    println(emp.age)

    // using let function
    emp.let { // it references
        println(it.name)
        println(it.age)

        // scope return value is depending on last statement return value
       // 2 or "hello" // here is an example of return value
    }

// =========>  with function: *****You can directly access the properties*****

    with(emp){ // this reference
        // you can directly set the value of properties without using it or this
        age = 30
        name = "Xyz"
    }

// ===========> run function: also same as with function just syntax change

    emp.run {
        age = 32
        name = "john doe"
    }


}

data class Emp(var name:String = "", var age:Int = 18)