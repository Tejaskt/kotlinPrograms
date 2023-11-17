fun main() {

    // Example of Extension function
    println("My name is Tejaskt".formattedString())

    // inline function example
    calculateTime {
        loop(1000000)
    }
}

// Extension function: if you want to add function in predefined class then use Extension function

// given below is its syntax
fun String.formattedString() : String {
    return "----\n$this\n----"
}

// Inline function: use to improve performance of program
/*
*  => when you create a lamda, then the compiler will first create a class on behalf of lamda then create an instance of lamda then execute it.
*  => it will low down your program if you create too many lamda functions in your program.
*  => that's why we use inline function, it simply copies and pastes the code wherever it needs
*  => check it from Tools> Kotlin> KotlinByteCode
* */

 // Example of inline function

inline fun calculateTime(fn:() -> Unit){
    val start = System.currentTimeMillis()
    fn()
    val end = System.currentTimeMillis()
    println("Time taken ${end - start} ms")
}
fun loop(n:Long){
    for(i in 1..n){
        //
    }
}