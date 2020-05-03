/** Lambdas function: A function which has no name.Lambdas is defined with a curly braces{} which takes variable as a
                      parameter(if any) and body of function.This body of function can be written after variable(if any)
                      followed by  -> operator.
 SYNTAX:    { variable  ->  Body_Of_Function }
 */

fun main(args: Array<String>){
    val myLambda: (Int) -> Unit = {s: Int ->println("Sum is  $s")}  // lambdas function
    addNumber(5, 10, myLambda)
 }

fun addNumber(a:Int, b:Int,lambda: (Int) -> Unit){  // High level function as parameter
    val add = a+b
    lambda(add)

}