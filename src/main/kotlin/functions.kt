import kotlin.math.pow

// function is the block of code. which is used to perform a particular task
fun main() {

    evenOrOdd(12)
    evenOrOdd(1)

    val result = sum(20 , 10)
    println(result)

    println("default args")
    printMessage(4) // when we pass value its call argument, here 4 is argument
    printMessage() // no arguments pass, so it will call 2 times as it is the default argument

    println("overloaded functions")
    println(addition(2,3))
    println(addition(2.0,5.0))

    // named arguments
    println(addition(b = 2 , a = 20)) // here are we use the named arguments, so we can define and pass the value in any order make sure you give all arguments

    // variable as a function or variable of a function data type
    val fn: (a: Double, b: Double) -> Double = ::power
    println(fn(2.0,3.0))
}

fun evenOrOdd(num: Int){
    if (num % 2 != 0) println("odd")  else println("even")
}

// one line functions

fun sum(num1 : Int , num2 : Int) = num1 + num2

// default arguments

fun printMessage(count : Int = 2){ // when we pass from here its call parameter, count is parameter
// when we give the variable in function definition its default type is val here count is val type it cant by reassigned
    for (i in 1..count)
    println("hii $i")
}

// function overloading: Function with the same name but different parameter or return type
fun addition(a : Int , b:Int) : Int{
    return a+b
}
fun addition(a : Double , b:Double) : Double{
    return a+b
}

// variable as a function

fun power(a : Double , b:Double):Double{
    return a.pow(b)
}


