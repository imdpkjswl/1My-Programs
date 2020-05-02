import java.util.Scanner

fun main(){
    println("Enter, which operation you want to perform: ")
    val opName = readLine()

    val scan = Scanner(System.`in`)

    println("Enter a number: ")
    val num1 = scan.nextFloat()
    println("Enter another name: ")
    val num2 = scan.nextFloat()

    when (opName) {
        "+" -> {
            val sum = num1.plus(num2)
            println("Result:  $sum")
        }
        "-" -> {
            val sub = num1.minus(num2)
            println("Result: $sub")
        }
        "*" -> {
            val mul = num1.times(num2)
            println("Result: $mul")
        }
        "/" -> {
            if(num2.toInt() == 0){ // type cast for comparison purpose
                println("Divided by zero, Division can not perform")
                return
            }
            val divi = num1.div(num2)
            println("Result: $divi")
        }
        else -> {
            println("Invalid operator sign,You have entered!!!")
        }
    }

    /*
        if(opName == "+"){
        val sum = num1.plus(num2)
        println("Result:  $sum")
    } else if(opName == "-"){
        val sub = num1.minus(num2)
        println("Result: $sub")
    } else if(opName == "*"){
        val mul = num1.times(num2)
        println("Result: $mul")
    } else if(opName == "/"){
        if(num2 == 0){
            println("Divided by zero, Division can not perform")
            return
        }
        val divi = num1.div(num2)
        println("Result: $divi")
    } else{
        println("Invalid operator sign,You have entered!!!")
    }
     */

}