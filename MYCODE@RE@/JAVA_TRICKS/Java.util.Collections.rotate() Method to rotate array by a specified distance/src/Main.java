import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Let us create a list of strings
        List<String> myList = new ArrayList<String>();
        myList.add("one");
        myList.add("two");
        myList.add("three");
        myList.add("four");

        System.out.println("Original List : " + myList);

        // Here we are using rotate() method to rotate the element by distance 2
        Collections.rotate(myList, 2); // for integer use Arrays.asList(arr);

        System.out.println("Rotated List: " + myList);
    }
}
