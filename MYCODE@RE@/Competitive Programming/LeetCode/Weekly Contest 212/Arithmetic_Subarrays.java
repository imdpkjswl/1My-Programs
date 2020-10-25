import java.util.*;

class Arithmetic_Subarrays{

    public boolean diffTwoSame(int[] nums, int start, int end){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=start;i<=end;i++){
            arr.add(nums[i]);
        }
//        System.out.println(arr);
        // Reverse the sorted array; required as mentioned in test cases
        Collections.sort(arr, Collections.reverseOrder());

//        System.out.println(arr);
        int temp = arr.get(1) - arr.get(0);  // for comparison
//        System.out.println(temp);

        // Check for given condition, if fails return false otherwise true
        for(int i=0;i<end-start;i++){
            if(arr.get(i+1)-arr.get(i) != temp){
//                System.out.println(arr.get(i+1)-arr.get(i));
                return false;
            }
        }
        return true;
    }

    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> list = new ArrayList<>();

        for(int i=0;i<l.length;i++) {
//            System.out.println(diffTwoSame(nums, l[i], r[i]));
            list.add(diffTwoSame(nums, l[i], r[i]));
        }
        return list;
    }


    public static void main(String[] args){
        Arithmetic_Subarrays ob = new Arithmetic_Subarrays();

        int[] nums = {-12,-9,-3,-12,-6,15,20,-25,-20,-15,-10}; //{4,6,5,9,3,7};
        int[] l = {0,1,6,4,8,7}; //{0,0,2};
        int[]r = {4,4,9,7,9,10}; //{2,3,5};

        List<Boolean> res = ob.checkArithmeticSubarrays(nums, l, r);
        System.out.println(res);


    }
}