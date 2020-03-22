// FIRST SORT THE ARRAY,THEN
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int arr[] = new int[30];
        int mis[] = new int[30];
        int n, i, j, counter;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no. of elements");
        n = in.nextInt();

        System.out.println("Enter elements :");
        for(i=0;i<n;i++){
            arr[i] = in.nextInt(); }

        for( j=1;j<n;j++){
            for( i=0;i<n-j;i++)
            {
                if(arr[i+1] <= arr[i]){
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }


        j=0;
        counter = arr[0];
        for(i=0;i<n;i++){
            if(counter != arr[i]){
                mis[j] =counter;
                j++;
                i = i-1;
            }
            counter++;
        }

        System.out.println("The Missing elements are : ");
        for(i=0;i<j;i++)
            System.out.println(mis[i]+"  ");


    }
}
