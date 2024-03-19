
// DataTypes in Kotlin


// Mutuable 

var kbool : Boolean = true
var kint : Int = 10
var klong : Long = 10L
var kfloat : Float = 10.0f
var kdouble : Double = 10.0
var kstring : String = "Abhishek"
var kChar : Char = 'a' // only for single characters and not for strings, Use  only single quotes

// Immutable
val kInt : Int = 10
val kLong : Long = 10
val kFloat : Float = 10.0f
val kDouble : Double = 10.0
val kString : String = "Abhishek"
val kBoolean : Boolean = true
val kChar : Char = 'a'



// special Characters in Kotlin

// \t - Tab
// \n - New Line
// \\ - Backslash
// \' - Single Quote
// \" - Double Quote   


// User inputs in kotlin

var a : Int = readln().toInt()  // converts string to int

// functions in Kotlin

fun makeCoffee(sugarCount : Int){
}


var result = addition(1,2)

fun addition(sum1 : Int,sum2:Int) :Double{
    return sum1+sum2.toDouble()
}

// Condition Statement
if(age >=18 && age <= 60){      //  are same as       if(age in 18..60){
}else{
    println("eligible")
}




// Looping string in Kotlin
fun main(){
    for(i in "Abhishek"){
        print(i)
    }
}


