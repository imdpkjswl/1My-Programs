import java.util.Scanner;
// Note: Stored elements in a3[] are not placed in the proper position.

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, i, j,k;
        int []a1 = new int[50];
        int []a2 = new int[50];
        int []a3 = new int[50];

        System.out.println("Enter the number of elements:");
        n = in.nextInt();
        for(i=0;i<n;i++)
            a1[i]=in.nextInt();


        j=k=0;
        boolean flag = true;
        for (i = 0; i < n; i++) {

            if(i==0 && a1[i] < 0)
                flag = false;

            if (a1[i] > 0 && flag == true) {
                flag = false;
                a2[j++] = a1[i];
            } else if (a1[i] < 0 && flag == false) {
                flag = true;
                a2[j++] = a1[i];
            }
            else{
                a3[k++] = a1[i];
            }
        }


        for(i=0;i<n;i++){
            System.out.print(a2[i]+"  ");
        }

    }
}
