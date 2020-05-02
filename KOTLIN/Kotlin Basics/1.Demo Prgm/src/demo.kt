
// Note: In this, Semicolon is optional

// fun means making function
fun main(){

    println("HELLO WORLD");

    // Variables in kotlin: it is container which stores the data
    // var - mutable variables(Modifiable)
    // val - immutable variables(Non-Modifiable)


    val piValue:Float = 3.143f;
    println("Radius of circle:  $piValue");

    var radius:Int = 12;
    var res:Float = 2*piValue*radius;

    val state:String = "The Parameter of circle :  "
    println(state+"  "+res); // println("$state  $res");
}