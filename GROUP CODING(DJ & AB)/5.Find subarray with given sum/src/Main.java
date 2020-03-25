/*        imput : arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
        Ouptut: Sum found between indexes 2 and 4
*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i,j,n,curSum,sum;
        int[]arr = new int[50];

        System.out.println("Enter the no. of elements:");
        n = in.nextInt();
        System.out.println("Enter "+n+" elements: ");
        for(i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the sum value");
        sum = in.nextInt();

        for(i=0;i<n;i++) {
            curSum = arr[i];

            for(j=i+1;j<=n;j++){
                if(curSum == sum){
                    System.out.println("Sum is found between "+i+" to "+(j-1));
                    return;
                }

                curSum = curSum+arr[j];
            }
        }

        System.out.println("Sub array not found");
    }
}
