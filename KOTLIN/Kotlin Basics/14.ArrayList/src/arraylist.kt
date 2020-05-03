
fun main(args:Array<String>) {
    val arrayList1 = ArrayList<String>(5)
    arrayList1.add("Hello")
    arrayList1.add("Deepak")
    arrayList1.add("Jaiswal")
    arrayList1.add("Your")
    arrayList1.add("Welcome")

    println("......Print ArrayList.....")
    for(element in arrayList1){
        print("$element    ")
    }
    println();

    arrayList1.removeAt(2)
    val itr = arrayList1.iterator()
    while(itr.hasNext()){
        print("${itr.next()}    ")
    }
    println()
    println("Size of arrayList = "+arrayList1.size)

    println("Array got cleared")
    arrayList1.clear()
    for(element in arrayList1){
        print("$element    ")
    }
}