fun main() {
    val arr = arrayOf("one","two","three")
    for ((i,e) in arr.withIndex()) {
        println("$i - $e")
    }
        // get and set an element of array

        println(arr[0])
        arr[1] = "Tejas"
        println(arr[1])

    // to get the size of array

    println(arr.size)
}