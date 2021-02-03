import java.util.*;

class _1512_Number_of_Good_Pairs {
    public static int numIdenticalPairs(int[] nums) {
		int goodPair = 0;

		for(int i=0;i<nums.length;i++){
			for(int j=i;j<nums.length;j++){
				if(i<j && nums[i] == nums[j]){
					goodPair++;
				}
			}
		}

		return goodPair;
    }

    public static void main(String[] args) {
    	int[] nums = {1,2,3,1,1,3};

    	int res = numIdenticalPairs(nums);
    	System.out.println(res);
    }
}