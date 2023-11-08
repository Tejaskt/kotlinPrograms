fun main() {

    // we use when instead of switch case in kotlin

    val animal = "horse"

    when(animal) {
        "horse" -> println("Its horse")
        "cat" -> println("Its cat")
        "Dog" -> println("it is dog")
        else -> println("animal not specified")
    }

    // use of when as expression

    val num = 13
    val res = when(num){
        10 -> "Ten"
        12 -> "twelve"
        in 2..13 -> "teen"
        else -> "not specified"
    }

    println(res)


}