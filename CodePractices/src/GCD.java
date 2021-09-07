public class GCD {
    // Extended Euclidean Algorithm- Time Complexity: O(Log min(a, b))
    public static int gcd(int a, int b) {
        if (a == 0)
            return b;

        return gcd(b%a, a);
    }


    // Time Complexity: O(min(a, b)
    static int naiveGCD(int a, int b) {
        int gcd = 1;

        for(int i=1;i <= a && i <= b; i++){
            if(a%i==0 && b%i==0){
                gcd = i;
            }
        }

        return gcd;
    }
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 28;

        // GCD by Euclidean algorithm
        System.out.println(gcd(num1, num2));

        // GCD by naive method
        System.out.println(naiveGCD(num1, num2));
    }
}
