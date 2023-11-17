// generic class: You can create a general class which is not type dependent
// we can pass the type by our self

fun main() {

    // Example of generic class
    val icontainer = Container<Int>(5)
    icontainer.getValue()
    val scontainer = Container<String>("Tejas")
    scontainer.getValue()

    // Example of varargs:Sending multiple numbers of arguments like arrays
    add(1,2,3,4,4)
    add(2,3,4,4,11,1,1,1)
}

// example of generic class
class Container<T> (var data:T){
    fun setValue(value: T){
        data = value
    }
    fun getValue(): T{
        return data
    }
}

// varargs keyword: You can send multiple number of arguments

fun add(vararg  values : Int){
    var sum = 0
    for(i in values) {
        sum+=i
    }
    println(sum)
}


