import java.util.*;
// Example:
// x^n mod m
// 5^2 mod 7 = 4

public class Main {

    // The Time comlexity is O(Logn)
    public static int modularExpo(int x,int n, int m) {
        if (n == 0)
            return 1;
        else if(n%2 == 0){  // When n is even.
            int y = modularExpo(x, n/2,m);
            return (y*y)%m;
        }
        else
            return ( (x%m)*modularExpo(x,n-1,m) )%m;  // When n is odd.

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the base value and power of base value:");
        int x = in.nextInt();
        int n = in.nextInt();
        System.out.println("Enter modular value:");
        int m = in.nextInt();

        int result = modularExpo(x,n,m);
        System.out.println(x+"^"+n+ "%"+m+" -->  " +result);

    }
}
