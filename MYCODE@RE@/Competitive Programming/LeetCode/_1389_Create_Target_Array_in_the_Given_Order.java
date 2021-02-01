import java.util.*;

class _1389_Create_Target_Array_in_the_Given_Order {
    public static int[] createTargetArray(int[] nums, int[] index) {

        ArrayList<Integer> target = new ArrayList<>();
        int[] ans = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            target.add(index[i], nums[i]);
        }

        for(int i=0;i<target.size();i++){
            ans[i] = target.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index= {0,1,2,2,1};

        int[] res = createTargetArray(nums, index);
        for(int t:res){
            System.out.print(t+" ");
        }

    }
}