import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int m,n,i,j,sum=0;
        int []a1 = new int[50];
        int []a2 = new int[50];

        System.out.println("Enter the size of first array:");
        m=in.nextInt();
        for(i=0;i<m;i++)
            a1[i] = in.nextInt();

        System.out.println("Enter the size of second array:");
        n=in.nextInt();
        for(i=0;i<n;i++)
            a2[i] = in.nextInt();


        if(m == n) {
           for(i=0;i<n;i++){
               System.out.print(a1[i]+a2[i]);
           }
        }


        if(m > n) {

        }


        if(m < n) {

        }

    }
}
