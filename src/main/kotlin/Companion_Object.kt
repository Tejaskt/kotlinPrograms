/*
*  companion object is like static keyword in java
*
*  static keyword is not available in kotlin
*
*  companion object is used to make a factory pattern programs in kotlin
*   means a function which accepts parameters and makes an object upon it
*
* */

fun main() {

    // with companion object
    var first = A.C()

    // without companion object
    var sec = A.D.E()

}

class A(){

    // @JvmStatic => use this annotation if you want to access this function in java class file
    companion object B{
        fun C()  = println("I am function of object b")
    }

    object D{
        fun E() = println("I am Function of object D")
    }
}