
fun factorial(n : Int) : Int{
    if(n==1){
        return 1
    }

    return n*factorial(n-1)
}

fun main(args: Array<String>){
    println("Enter a number: ")
    val num : Int = Integer.valueOf(readLine())

    val res:Int = factorial(num)
    println("Factorial of $num is  $res")
}