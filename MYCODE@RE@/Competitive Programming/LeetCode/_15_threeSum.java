import java.util.*;

class _15_threeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        ArrayList<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            while (j < k) {
                if (k < nums.length - 1 && nums[k] == nums[k + 1]) {
                    k--; continue;
                }

                if (nums[i] + nums[j] + nums[k] > 0) {
                    k--;
                } 
                else if (nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                } 
                else {
                    ArrayList<Integer> l = new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[j]);
                    l.add(nums[k]);
                    result.add(l);
                    j++;
                    k--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> res = threeSum(nums);

        for(int i=0; i<res.size(); i++) {
            for(int j=0; j<res.get(i).size(); j++) {
                System.out.print(res . get(i) . get(j) + " ");
            }
            System.out.println();
        }

    }
}