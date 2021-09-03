import java.util.HashSet;

public class DigitExtractions {
    public static int extractDigit(int num){
        int ans = 1; // variable to store result

        while(num > 0) {
            int tmp = num % 10; // extract last digit
            ans *= tmp;
            num /= 10; // remove last digit
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3, 31, 17, 25};

        // using set in order to remove duplicate returned items
        HashSet<Integer>  ans = new HashSet<>();

        for(int val : arr){
            int tmp = extractDigit(val);
            ans.add(tmp);
        }

        for(int val : ans){
            System.out.print(val+"  ");
        }

    }
}
