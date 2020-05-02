
fun doSum(a:Int , b:Int): Int {

    var sum:Int = a.plus(b);
    return sum
}

fun main() {
    var sum = doSum(b=12, a=13) // named argument, Normal - doSum(12, 13)
    println("Sum is  $sum")
}