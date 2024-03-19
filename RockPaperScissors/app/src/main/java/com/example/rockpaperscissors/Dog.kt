
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
