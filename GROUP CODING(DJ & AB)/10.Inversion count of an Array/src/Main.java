import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,i,j,count=0;
        int arr[] = new int[50];
        System.out.println("Enter the size of array");
        n = in.nextInt();
        for(i=0;i<n;i++)
            arr[i]= in.nextInt();

        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(arr[i] > arr[j]){
                    System.out.println("("+arr[i]+","+arr[j]+")");
                    count++;
                }
            }
        }

        System.out.println("Total inversion of array :  "+count);


    }
}
