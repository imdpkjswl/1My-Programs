fun main(){


    for(i in 1..10){
        println("value of i is  $i")
    }

    // For reverse
    for(i in 10 downTo 1){
        println("Value of i is  $i")
    }

    // For Skipping values
    for(i in 1..10 step 2){
        println("Value of i is  $i")
    }
}