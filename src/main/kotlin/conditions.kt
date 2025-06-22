@file:Suppress("KotlinConstantConditions")

fun main() {

    // If else condition
    val rain = true

    // using the if statement as an Expression
    val result = if (rain) {
        "It is raining outside"
    }else{
        "Not raining"
    }

    val res2 = if(!rain) "not raining" else "raining"  // We can also use it like ternary operator in other language ? :


    // Range operator
    val no = 10
    var res = no in 1..5 // range operator: it includes the upper bound which is 5 while checking the condition
    res  = no in 1 until 5 // until operator: it will not include the upper bound which is 5 while checking the condition


}