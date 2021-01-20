import java.util.HashMap;
import java.util.Map;
//1. O(n^2) Naive approach is to use brute force: a[i]+a[j]==sum
//2. O(NlogN) Sort array and apply, if(a[low]+a[high] < sum) low++ else high--

//3. Use Hashing: Time Complexity: O(N) & Space Complexity: O(N)
class Find_pair_with_given_sum_in_array {

    public static void findPair(int[] A, int sum) {
        // create an empty Hash Map
        Map<Integer, Integer> map = new HashMap<>();

        // check diff is avail in Map else insert into map
        for (int i = 0; i < A.length; i++) {
            // check if pair (A[i], sum-A[i]) exists

            // if difference value is seen before, print the pair indeces
            if (map.containsKey(sum - A[i])) {
                System.out.println("Pair found at index " + map.get(sum - A[i]) + " and " + i);
                return;
            }

            // store index of current element in the map
            map.put(A[i], i);
        }

        // No pair with given sum exists in the array
        System.out.println("Pair not found");
    }

    public static void main (String[] args) {
        int[] A = { 8, 7, 5, 2, 3, 10 };
        int sum = 10;

        findPair(A, sum);

    }
}