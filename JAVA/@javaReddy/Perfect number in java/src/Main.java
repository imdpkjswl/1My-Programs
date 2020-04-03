import java.util.Scanner;

public class Main {

    public static boolean isPerfect(int n){
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum = sum + i;
        }
        if (n == sum)
            return true;

        return false;
    }


    public static void main(String[] args) {
        // 6 = 1 + 2 + 3  = 6 : Perfect number
        // 28 = 1 + 2 + 4 + 7 + 14  = 28 : perfect number
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to check: ");
        n = in.nextInt();


        boolean b = isPerfect(n);

        if (b)
            System.out.println("Its a  perfect number");
        else
            System.out.println("Its not a perfect number");


    }
}