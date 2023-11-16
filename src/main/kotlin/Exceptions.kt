fun main() {

    val arr = arrayOf(1,2,3)
    try {
        println(arr[5])
    }catch (e:Exception){
        println("something went wrong!")
    }
    finally {
        println("I will execute")
    }

    println("if array exception is not handled then this line will not execute. it will crease the code")

    // throw keyword use
    println(createuser(4))
    println(createuser(-3))
}

fun createuser(count:Int){

    if (count < 0 ){
        // exception
        throw IllegalArgumentException()
    }
    else{
        println("count is $count")
    }
}

