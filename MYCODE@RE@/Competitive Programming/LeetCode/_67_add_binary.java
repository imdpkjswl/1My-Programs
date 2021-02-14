import java.util.*;

class _67_add_binary {

    public static String addBinaryNORMAL(String a, String b) {
        int num1 = Integer.parseInt(a,2);
        int num2 = Integer.parseInt(b,2);
        int sum = num1 + num2;
        return Integer.toBinaryString(sum);
    }

    static String addBinary(String a, String b) {
        // Initialize result
        String result = "";

        // Initialize digit sum
        int s = 0;

        // Traverse both strings starting from last characters
        int i = a.length() - 1, j = b.length() - 1;
        while (i >= 0 || j >= 0 || s == 1) {

            // Compute sum of last digits and carry
            s += ((i >= 0)? a.charAt(i) - '0': 0);
            s += ((j >= 0)? b.charAt(j) - '0': 0);

            // If current digit sum is 1 or 3, add 1 to result
            result = (char)(s % 2 + '0') + result;

            // Compute carry
            s /= 2;

            // Move to next digits
            i--; j--;
        }

        return result;
    }


    public static void main(String[] args) {
            String a ="1101", b="100";

            String result = addBinary(a,b);
        System.out.println(result);
    }
}