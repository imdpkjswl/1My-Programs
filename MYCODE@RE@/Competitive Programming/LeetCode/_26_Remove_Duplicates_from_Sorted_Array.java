import java.util.*;

public class _26_Remove_Duplicates_from_Sorted_Array{
	public int duplicate(int[] nums) {
		    int n = nums.length;
        ArrayList<Integer> temp = new ArrayList<>();
        if(n == 0)
            return 0;
        
        
        temp.add(nums[0]);
        int count = 1;
        for(int i=1;i<n;i++){
            if(nums[i-1] != nums[i]){
                temp.add(nums[i]);
                count++;
            }
        }
        
        for(int i=0;i<count;i++){
            nums[i] = temp.get(i);
        }
        return count;
        // Note: (count)th no. of element must be sorted in original array.
    }

	public static void main(String[] args){
		_26_Remove_Duplicates_from_Sorted_Array obj = new _26_Remove_Duplicates_from_Sorted_Array();

		int[] nums = {1,1,2};//{2,2,3,5,6,6,8};

		int len = obj.duplicate(nums);
		System.out.println(len);
	}
}