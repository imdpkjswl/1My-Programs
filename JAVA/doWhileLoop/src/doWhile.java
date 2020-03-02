import java.util.Scanner;

public class doWhile {
    public static void main(String [] args){

        int x,n;
        x=1;
        System.out.println("Enter the last term to print counting");

        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        do {
            System.out.println("Number : "+x);
            x++;
        }while(x<=n);
    }
}
