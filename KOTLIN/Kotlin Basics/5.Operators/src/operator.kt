
fun main(){
    val a = 10;
    val b = 3;

    // Arithmetic
    println("${a.plus(b)}")
    println("${a.minus(b)}")
    println("${a.div(b)}")
    println("${a.times(b)}")
    println("${a.rem(b)}")

    // Relational
    println("==   ${a==b}")
    println(">    ${a>b}")
    println("<    ${a<b}")

    // Logical
    println(a< 100 || b<0)
    println(a <100 && b>0)
    println(a <100 && b<0)
    println(a!= b)



}