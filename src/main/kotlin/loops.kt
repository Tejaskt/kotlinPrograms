fun main() {

    val num = 2
    var index = 1

    // entry control loop while
    while (index <= 5){
        println(num * index)
        index++
    }

    // exit control loop do while
    val ind = 2
    do {
        println("hello world!")
    }while (ind > 2 )


    // for loop when you know the iteration of your loop then use for loop

    for (i in 1..5 step 2 ){ // step will add 2 in variable i
        println(i)
    }

    println("until")
    for (i in 1 until 5){ // use of until it will not include the upper bound
        println(i)
    }

    println("down to")
    for (i in 10 downTo 1 step 2){
        println(i)
    }

    // String templating

    println("String templating")

    for(i in 1..5){
        println(num.toString() + " x " + i + " = " + num*i)
            // example
        println("using String templating")
        println("$num x $i = ${num * i}")
        println()
        // same out put from the both statement
    }



}