
// Example of a Class
class  Dog constructor(val name: String){
    init {
        bark(name : String)
    }
    fun bark(name : String){
        println("$name says Woof Woof")
    }
}


fun main(){
    var dog : Dog = Dog("Daisy")
}



// Data class are used to store data it also provide has code matching and other functionality

data class Person(
    val name : String,
    val age : Int,
    val designation : String

)