fun main(){
    val q = 5
    for (i in 1..q ){
        for (j in 1..i ){
            print("*")
        }
        for (j in 1..q - i){
            print(" ")
        }
        for (j in 1..q - i){
            print(" ")
        }
        for (j in 1..i){
            print("*")
        }
        println()
    }
    for (i in q downTo 1 ){
        for (j in 1..i ){
            print("*")
        }
        for (j in 1..q - i){
            print(" ")
        }
        for (j in 1..q - i){
            print(" ")
        }
        for (j in i downTo 1){
            print("*")
        }
        println()
    }
}
