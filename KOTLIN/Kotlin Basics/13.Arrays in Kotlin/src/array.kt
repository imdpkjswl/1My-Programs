fun main(args:Array<String>) {

    val array1 = arrayOf(1,2,3,4,5)
    val array2 = arrayOf<String>("a","b","c","d","e")

    // assigning any value
    array1.set(0,6)
    array1[3] = 8

    array2.set(0,"start")
    array2[3] = "Middle"

    for(element in array1){
        print("$element   ")
    }
    println()

    for(element in array2){
        print("$element   ")
    }


}