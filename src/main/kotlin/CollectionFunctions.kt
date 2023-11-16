fun main() {
    val nums = listOf(1,2,3,4,5,6,7,8,9)

    // filter function
    val oddlist = nums.filter { it%2 != 0 } // using lamda over here
    println(oddlist)

    // map function use to transform the form of list
    val squarelist = oddlist.map { it*it } // lamda function
    println(squarelist)

    // foreach function
    nums.forEach{ println(it) }

}

