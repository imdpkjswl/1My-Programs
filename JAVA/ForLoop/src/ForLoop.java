import java.util.Scanner;

public class ForLoop {
    public static void main(String [] args){

        int x,n;
        System.out.println("Enter the last term to print counting");

        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        for(x=1;x<=n;x++)
        {
            System.out.println("Number : "+x);
        }
    }
}
