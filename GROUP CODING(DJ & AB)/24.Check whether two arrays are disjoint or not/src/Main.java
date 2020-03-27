import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i,j,n,m;
        int []a1 = new int[50];
        int []a2 = new int[50];

        System.out.println("Enter the size of first array:");
        m=in.nextInt();
        for(i=0;i<m;i++)
            a1[i]=in.nextInt();

        System.out.println("Enter the size of second array:");
        n=in.nextInt();
        for(i=0;i<n;i++)
            a2[i]=in.nextInt();

        for(i=0; i<m; i++) {
            for(j=0; j<n; j++) {
                if(a1[i] == a2[j]){
                   System.out.println("Both arrays are not disjoint");
                    return;
                }
            }
        }

        System.out.println("Both arrays are disjoint");
    }
}
