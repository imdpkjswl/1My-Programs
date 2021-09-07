public class LCM {

    static void lcm(int n1, int n2) {
        // maximum of n1 and n2 is stored in lcm
        int lcm = (n1 > n2) ? n1 : n2;

        while (true) {
            if (lcm % n1 == 0 && lcm % n2 == 0) {
                System.out.printf("The LCM of %d and %d is:  %d", n1, n2, lcm);
                break;
            }
            lcm++; // after each comparison increment lcm value by ONE
        }

    }


    public static void main(String... args) {
        int n1 = 3;
        int n2 = 4;

        lcm(n1, n2);
    }
}
