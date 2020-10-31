import java.util.*;

class _27_Remove_Element {
    public int removeElement(int[] nums, int val) {
        
        int count=0;
        ArrayList<Integer> t = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i] == val){
                nums[i] = -1;
            }else{
                t.add(nums[i]);
            }
        }
        
        for(int i=0;i<t.size();i++){
            nums[i] = t.get(i);
        }
        
        return t.size();
    }

    public static void main(String[] args){
    	_27_Remove_Element ob = new _27_Remove_Element();

    	int nums[] = {0, 1, 2, 2, 3, 0, 4, 2}; 
    	int val = 2;

    	int len = ob.removeElement(nums, val);
    	System.out.println(len);
/*
    Your function should return length = 5, with the first five elements of nums 
    containing 0, 1, 3, 0, and 4. Note that the order of those five elements can 
    be arbitrary. It doesn't matter what values are set beyond the returned length.
*/

    }
}