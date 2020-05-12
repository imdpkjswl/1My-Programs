import java.io.*;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = in.nextInt();

        // Creating single arrayList
        ArrayList<Integer> arr = new ArrayList<>(n);

        // Appending the new element at the end of the list
        for (int i = 0; i < n; i++) {
            arr.add(i, in.nextInt());
        }
        System.out.printf("ArrayList:   %s\n", arr); // or we can use println also.

        // Remove element at index 3
        System.out.println("Enter index to delete element:");
        n = in.nextInt();
        arr.remove(n);

        System.out.println("Size of ArrayList:  " + arr.size());
        System.out.printf("ArrayList:  %s\n", arr);
        Boolean find = arr.contains(3);  // Returns true if this list contains the specified element
        System.out.println("Item contain: " + find);

        arr.set(2, 12);    //Replaces the element at the specified position in this list with the specified element.


        // Creating object of ListIterator<Integer> using listIterator() method
        ListIterator<Integer> iterator = arr.listIterator();
        // Printing the iterated value
        System.out.println("\nUsing ListIterator:\nValue is : ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "  ");
        }

        System.out.println("\nCheck for empty list:  "+arr.isEmpty()); //Returns true if this list contains no elements.

        System.out.println("Custom index 1: "+ arr.indexOf(1)+" and Last index of list(for duplicate) 5: "+arr.lastIndexOf(5)); // it return -1, if item not found

        Object[] objects = arr.toArray(); // method is used to return an array containing all of the elements in the list in correct order.
        // Printing array of objects
        System.out.println("Printing array of objects");
        for (Object o : objects)
            System.out.print(o + "  ");

        System.out.println("\nClearing ArrayList:");
        arr.clear();
        System.out.println(arr);
    }
}
