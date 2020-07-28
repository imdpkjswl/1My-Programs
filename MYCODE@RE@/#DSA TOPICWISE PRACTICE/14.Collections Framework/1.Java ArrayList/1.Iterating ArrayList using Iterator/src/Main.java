import java.util.*;

public class Main {

    public static void main(String args[]){

        ArrayList<String> list=new ArrayList<String>();//Creating arraylist

        list.add("Mango");//Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        // simply print list
        System.out.println(list);

        System.out.println("Print using For-Each Loop:");
        //Traversing list through for-each loop
        for(String fruit : list)
            System.out.println(fruit);


        System.out.println("Print using Iterator:");
        //Traversing ArrayList elements using the Iterator interface.
        Iterator it = list.iterator();  //getting the Iterator

        while(it.hasNext()){    //check if iterator has the elements
            System.out.println(it.next());  //printing the element and move to next
        }
    }
}  