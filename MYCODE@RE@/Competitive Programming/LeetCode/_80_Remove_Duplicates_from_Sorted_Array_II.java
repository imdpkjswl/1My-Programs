import java.util.ArrayList;

// Note: Here, Hashing will not working due to negative and atmost two duplicates allowed
class _80_Remove_Duplicates_from_Sorted_Array_II {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> ans = new ArrayList<>();

        ans.add(nums[0]); // add first element

        int prev = nums[0];
        int cur;
        int skip = - 999999;
        int count = 1;
        for (int i = 1; i < n; i++) {

            if (skip == nums[i]) {
                continue;
            }
            cur = nums[i];
            if (cur == prev) {
                ans.add(cur); // add element which only at most two times appeared
                count++;
            } else {
                ans.add(nums[i]); // add element which only at most two times appeared
                count = 1;
                prev = cur;
            }
            if (count == 2) {
                skip = cur;
            }
        }

        for (int i : ans) {
            System.out.print(i + "  ");
        }

        // Placing output data into nums
        for (int i = 0; i < ans.size(); i++) {
            nums[i] = ans.get(i);
        }
        return ans.size();
    }


    public static void main(String[] args) {

        int[] nums = new int[] {1, 1, 1, 2, 2, 3}; //{-1, 2, 5, 8};//{-1,-1,-1,2,3,3,3,3,4};
        int result = new _80_Remove_Duplicates_from_Sorted_Array_II().removeDuplicates(nums);
        System.out.println(result);
    }
}