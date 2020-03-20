import java.util.*;

public class Main {

    public static void main(String[] args) {
        int i,j;
        int n;
        Scanner in = new Scanner(System.in);
        // To converting integer into corresponding.
        System.out.println("Enter number of rows");
        n = in.nextInt();

        for(i=1; i<=n ; i++) {
            for(j=1 ; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
