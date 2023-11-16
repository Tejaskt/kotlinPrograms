fun main() {

    val gender :String = "Male" // non nullable type syntax
    val gender2 : String? = null  // nullable type
    val isAdult : Boolean? = null

    // method 1 to check is it null or not
    if (gender2 != null) {
        gender2.uppercase()
    }

    // method 2 to check is variable null or not

    gender2?.uppercase() // *safe call operator*

    // using a multiple statement if variable is not null

    gender2?.let {
        println("line 1")
        println(" the variable is $gender2")
        println(" also we can use $it variable which points to $gender2")

    }

    val select = gender2 ?: "NA"
// ?: *elvish operator* it checks the variable is null or not then assign the default value if it is null

    val errors = gender2!!.uppercase() // non-null *asserted operator* it will throw the exception or error if the variable is null
}
