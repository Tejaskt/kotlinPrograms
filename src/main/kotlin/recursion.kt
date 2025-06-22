
    fun main(){

        val c : Int = recurs(5)
        println(c)

        evenOrOdd(4)
        println("hello")
        evenOrOdd(3)

    }

    // recursion
     fun recurs(v: Int) : Int{
         return if (v >= 1){
             v * recurs(v - 1)
         } else{
             1
         }
    }

    // find odd even without % op
    fun oddEven(e : Int) : Any{

        val d = e/2
        return if (d == e){
            println("$e is even")
        } else{
            println("$e is odd")
        }

    }


