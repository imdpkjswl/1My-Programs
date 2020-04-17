/*
    *Equilibrium index of an array is an index such that the sum of elements at lower indexes is equal
     to the sum of elements at higher indexes. For example, in an array A:

        Example :
        Input: A[] = {-7, 1, 5, 2, -4, 3, 0}
        Output: 3
        3 is an equilibrium index, because:
        A[0] + A[1] + A[2] = A[4] + A[5] + A[6]

        Input: A[] = {1, 2, 3}
        Output: -1
*/
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n, i, j, leftSum=0, rightSum=0;
        int []arr = new int[50];
        System.out.println("Enter the size of array");
        n = in.nextInt();
        for(i=0;i<n;i++)
            arr[i] = in.nextInt();

        for(i=0;i<n;i++){
            leftSum+= arr[i];
            for(j=i+2;j<n;j++){
                rightSum+= arr[j];
                if(leftSum == rightSum){
                    System.out.println("The Equilibrium index is :  "+(i+1));
                    return;
                }
            }
            rightSum =0;
        }

        System.out.println("Equilibrium index not found");
    }
}
