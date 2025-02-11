package com.example.workclass

fun main(){
    //Numeric variables
    val age:Int = 20
    val long_number:Long = 789123128937
    val temperature:Float = 27.33f
    val weight:Double = 64.1231


    //String variables
    val gender:Char = 'M'
    val name:String = "Alonso Ramirez"

    //Bool variables
    val isGreater:Boolean = false

    //Collection variables
    val names = arrayOf("Erick", "Sofia", "Javier", "Veronica")

    println(age)
    println("Welcome $name, to your first Kotlin project")
    println(add())
    println(product(5,8))
    printArray(names)
    /*val numbers = ArrayOf(1,2,3,4,5,6,7,8,9,10)
    isEven(numbers)*/
}
