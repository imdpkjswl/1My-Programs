fun main(){

    val day = 7

    var day_in_word = when(day){

        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        in 4..10 -> "Thursday" // checking for range
        else -> "Invalid day number"

    }

    println(day_in_word)

}