/*  Write a program to print all the LEADERS in the array. An element is leader if it is greater than all the elements to its right side.
    And the rightmost element is always a leader. For example int the array {16, 17, 4, 3, 5, 2}, leaders are 17, 5 and 2.
*/
import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i,j,n,key;
        int arr[] = new int[50];

        System.out.println("Enter the size of array");
        n = in.nextInt();
        for(i=0;i<n;i++)
            arr[i] = in.nextInt();

        System.out.println("Leaders elements are: ");
        int counter =0;
        for(i=0;i<n;i++){
            key = arr[i];
            for(j=i+1;j<n;j++){
                if(key > arr[j]){
                    counter++;
                    if(counter == (n-i-1)){
                        System.out.print(key+", ");
                    }
                }
            }
            counter=0;
        }

        System.out.println(arr[n-1]); // it is because the rightmost element by default will be leader due not availability any other elements.

    }
}
