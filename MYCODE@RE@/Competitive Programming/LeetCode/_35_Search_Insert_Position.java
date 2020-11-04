import java.util.*;

public class _35_Search_Insert_Position{

	public static int searchInsert(int[] nums, int target) {
        int index=0;
        for(int i=0;i<nums.length;i++){
        	if(nums[i] == target){
        		return i;
        	}
        	else if(nums[i] <= target){
        		index = i+1;
        	}
        }
        return index;
    }

	public static void main(String[] args){

		int[] nums = {1,3,5,6, 8};
		int target = 7;

		int res = searchInsert(nums, target);
		System.out.println(res);
	}
}