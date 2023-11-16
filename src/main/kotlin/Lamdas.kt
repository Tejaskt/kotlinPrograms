// higher order functions and lamdas

fun main() {

    val fn: (a: Double , b:Double) -> Double  = ::sum // assigning a function to variable
    println(fn(2.0 , 5.0))
    calculator12(2.56, 4.55 , ::sum)

    // lamda Expression: Functions without name = lamda

    val singleparam : (Int) -> Int = { x -> x+x }
    val singleparam2 : (Int) -> Int = {it+it} // we can also declare like this

    // lamda passing in higher order functions
    calculator12(1.6,2.9) { a, b -> a + b } // also define like this
}

fun sum (a:Double , b:Double):Double{
    return  a + b
}

// higher order functions: which are accepting the function as an argument or returning a function
fun calculator12(a:Double , b:Double , gn:(Double,Double) -> Double){

    val result = gn(a,b)
    println(result)
}