fun main() {

    val arr = arrayOf(12, 342, 533 , 34,344,53,23,45)
    var counter: Int = 0
    var evennum = 0


    for (i in arr)
    {
        counter = findDigit(i)

        if(counter % 2 == 0)
        {
            evennum++
        }
    }

    print(evennum)

}

fun findDigit(num : Int) : Int{

    var number = num
    var count: Int = 0

    while (number > 0){
        var digit = number % 10
        count++
        number /= 10
    }

    return count
}


