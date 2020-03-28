// FIRST SORT THE ARRAY ELEMENTS , THEN FIND OUT THE RESULT USING ARRAY INDEX

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int []arr = new int[20];
        int n, firstL, secondL, firstS,secondS;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter no. of elements: ");
        n = in.nextInt();

        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();

        for(int j=1;j<n;j++){
            for(int i=0;i<n-j;i++)
            {
                if(arr[i+1] >= arr[i]){
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }

        System.out.println("Second largest element :  "+arr[n-2]);
        System.out.println("Second smallest element :  "+arr[1]);

    }
}
