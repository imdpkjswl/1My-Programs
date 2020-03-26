/*
   Input: 0 0 0 0 1 1 0 0 0
   Output: Contiguous repeated 0's: 4
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i,n;
        float []arr = new float[50];
        System.out.println("Enter the no. of elements:");
        n = in.nextInt();
        for(i=0;i<n;i++)
            arr[i] = in.nextFloat();

        // Last sub Question rose:   1  0  1  1  1  0  0  0  1  1  0  0

        int temp = 0;
        int count = 0;
        for(i=0; i<n; i++){

            if(arr[i] == 0 ){ // here,i'm finding 0's repeated contiguously.
                temp++;
            }else{
                temp=0;
            }

            if(temp > count){
                count = temp ;
            }
        }

        System.out.println("Contiguous repeated 0's: "+count);
    }
}
