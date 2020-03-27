import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n,i,j,sum=0;
        int a[][] = new int[50][50];

        System.out.println("Enter the size");
        n = in.nextInt();

        for(i=0;i<n;i++) {
            for (j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }

         for(i=0;i<n;i++){
             for(j=0;j<n;j++){

                 // for first row elements
                 if(i==0){
                     sum += a[i][j];
                 }

                 // For secondary diagonal
                 if(i!= 0 && i == n-j-1){
                     sum += a[i][j];
                 }

                 // for last row elements
                 if(i==n-1 && j != 0){
                     sum += a[i][j];
                 }
             }
         }

         System.out.println(sum);
    }
}
