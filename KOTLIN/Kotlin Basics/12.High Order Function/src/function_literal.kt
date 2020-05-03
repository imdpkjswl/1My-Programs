// Function which accepts function as a parameter or return a function or can both.
fun myFUn(name:String,branch:String, fn: (String,String) -> String) : Unit{
    val results = fn(name,branch)
    println(results)
}

fun main(args:Array<String>){
    val fn:(String,String) -> String = {name,branch ->  "$name Developer From  $branch"}
    myFUn("Deepak Jaiswal", "Cse", fn)
}