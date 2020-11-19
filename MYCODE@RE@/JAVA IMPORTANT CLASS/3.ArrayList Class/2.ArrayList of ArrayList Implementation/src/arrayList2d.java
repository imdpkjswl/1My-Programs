import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/*
        //Creating 1st row and adding values
       //(another way for adding values in 2D collections)
        arr.add(new ArrayList<Integer>(Arrays.asList(item)));
        */

public class arrayList2d {
    public static Scanner in = new Scanner(System.in);

    static void insertAtIndex(ArrayList<ArrayList<Integer>> arr) {
        System.out.println("Enter the size of sub-arrayList");
        int n = in.nextInt();
        System.out.println("Enter the row index:");
        int index = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the item to be inserted at " + index + " index:");
            int item = in.nextInt();
            arr.get(index).add(item);
        }
    }


    static void displayList(ArrayList<ArrayList<Integer>> arr) {
        for (int i = 0; i <arr.size(); i++) {  // Row of list
            System.out.print(i+":  ");

            for (int j = 0; j < arr.get(i).size(); j++) { // Column of list
                System.out.print(" -> "+arr.get(i).get(j));  // get() is to access the indexes of list.
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {

        System.out.println("Enter the no. of row:");
        int n = in.nextInt();
        /*Declaring 2D ArrayList*/
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>(n); // row must be initialized
        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<>());    // Allocating memory for sub-list array. }
        }

        for(int i=0;i<n;i++)
            insertAtIndex(arr);

        System.out.println("List elements are:");
        displayList(arr);

    }
}