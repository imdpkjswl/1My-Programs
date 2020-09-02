import java.util.*;


class Result {

    /*
     * You will be given two arrays of integers and asked to determine all integers that satisfy the following two conditions:

     * The elements of the first array are all factors of the integer being considered.
     * The integer being considered is a factor of all elements of the second array.
     ----------------------------------------------------------------------------------
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        int last_a, first_b, count = 0;

        // We have to find answer between last_a and first_b.
        last_a = a.get(a.size() - 1);
        first_b = b.get(0);

        List<Integer> factor_a = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        while (last_a <= first_b) {
            for (int i = 0; i < a.size(); i++) {
                if (last_a % a.get(i) == 0) {
                    if (set.contains(last_a)) {
                        factor_a.add(last_a);
                    }
                    set.add(last_a);
                }
            }
            last_a++;
        }

        boolean flag = true;
        for (int i = 0; i < factor_a.size(); i++) {
            for (int j = 0; j < b.size(); j++) {
                if (b.get(j) % factor_a.get(i) != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                count++;
            else
                flag = true;
        }



        System.out.println(factor_a);

        return count;

    }

}



public class Between_Two_Sets {
    public static void main(String[] args) {

        int n = 2;
        int m = 3;

        List<Integer> arr = new ArrayList<>();
        arr.add(2); arr.add(4);

        List<Integer> brr = new ArrayList<>();
        brr.add(16); brr.add(32); brr.add(96);

        System.out.println(arr);
        System.out.println(brr);

        int ans = new Result().getTotalX(arr, brr);
        System.out.println(ans);

    }

}