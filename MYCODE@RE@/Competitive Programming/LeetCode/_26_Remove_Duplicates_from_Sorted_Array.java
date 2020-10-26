import java.util.*;

public class _26_Remove_Duplicates_from_Sorted_Array{
	// Apply Two pointer algo
	public int duplicate(int[] nums) {
		if(nums.length == 0)
			return 0;
		
		int count=0;
		for(int i=1;i<nums.length;++i){
			if(nums[i] != nums[count]){
				count++; // counting no. of unique elements in nums
                nums[count] = nums[i]; // shift
			}
		}
		// for(int i:nums)
		// 	System.out.println(i+"--->");
		return count+1;
		
    }

	public static void main(String[] args){
		_26_Remove_Duplicates_from_Sorted_Array obj = new _26_Remove_Duplicates_from_Sorted_Array();

		int[] nums = {1,1,2};//{2,2,3,5,6,6,8};

		int len = obj.duplicate(nums);
		System.out.println(len);
	}
}