fun main() {

    Sharing.likes()
    Sharing.followers()

    // use of an object Expression: also use to declare anonymous inner classes

    var Bean = object : Cloneable {
        override fun clone() = println("I am clone")
    }

}


/* **
*
*  => object keyword: when you want to create only one object of your class then create class using object keyword
*
*  => it follows a singleton pattern
*
*  => class and its single object created only once
*
*  => constructor is not allowed (init block is allowed)
*
*** */


// singleton pattern
object Sharing{
    private var likes = 1
    private var follower = 1

    fun likes() = likes++
    fun followers() = follower++
}


interface  Cloneable{
    fun clone()
}