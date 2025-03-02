package com.example.workclass

fun main(){
    //Numeric variables
    val age:Int =20
    val long_number:Long = 789123128937
    val temperature:Float = 27.33f
    val weight:Double = 64.1231

    //String variables
    val gender:Char = 'M'
    val name:String = "Ricardo Reyes"

    //Bool variables
    val isGreater:Boolean = false

    //Collection variables
    val names = arrayOf("Erick", "Sofia", "Javier", "Veronica")

    println(age)
    println("Welcome $name, to your first Kotlin project")
    print(add())
    printArray(names)



}

fun add():Int{
    var x = 10
    var y = 5
    return(x+y)
}

fun printArray(names:Array<String>){
    println(names)
    print(names)
    for(name in names){
        println("Hello $name")
    }
}

fun product(x:Int,y:Int):Int{
    return (x*y)
}