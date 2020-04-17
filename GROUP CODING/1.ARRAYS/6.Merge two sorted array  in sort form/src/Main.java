import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,m,i,j;
        int a1[] = new int[50];
        int a2[] = new int[50];
        int a3[] = new int[100];

        System.out.println("Enter the size of first array");
        n = in.nextInt();
        System.out.println("Enter "+n+" elements:");
        for(i=0;i<n;i++)
            a1[i] = in.nextInt();

        System.out.println("Enter the size of second array");
        m = in.nextInt();
        System.out.println("Enter "+m+" elements:");
        for(j=0;j<m;j++)
            a2[j] = in.nextInt();

        i=0;
        int k=0,l;
        while(i<n){
            a3[k] = a1[i];
            k++;
            i++;
        }
        boolean flag;
        for(j=0;j<m;j++) {

                for(i=0;i<k;i++) {
                    if(a2[j] < a3[i]) {
                        flag = true;
                        for(l=n-1;l>=i;l--) {
                            a3[l+1] = a3[l];
                        }
                        a3[i] = a2[j];
                        k++;
                        if(flag == true)
                            j++;
                        flag = false;
                    }
                }
                a3[i] = a2[j];
                k++;
        }

        for(i=0;i<k;i++)
            System.out.println(a3[i]+"  ");


    }
}
/*
AT THIS SCENARIO , IT GOT FAILED
Enter the size of first array
5
Enter 5 elements:
1 4 6 8 9
Enter the size of second array
4
Enter 4 elements:
2 3 5 7
1
2
3
4
5
6
0
0
7
 */
