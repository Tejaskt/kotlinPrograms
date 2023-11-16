fun main() {

    val num = listOf(1,2,3) // immutable list: means it can be modified

    val num2 = mutableListOf(4,5,6) // mutable list: means it can be modified

    // various methods of mutable list
    num2.add(7)
    num2.indexOf(3)
    num2.addAll(num)
    println(num2)

    // maps

    val mapy = mutableMapOf<Int,String>()
    mapy.put(1,"tejas")
    mapy[3] = "tejas" // can also set items like that
    mapy.put(2,"kt")

    println(mapy.get(3))
    println(mapy[2]) // can also get items like that

    for((k,v) in mapy){
        println("$k = $v")
    }
    // mutable maps

    val mapy2 = mapOf<Int,String>( 1 to "Tejas" , 2 to "Kt")
    println(mapy2)
}