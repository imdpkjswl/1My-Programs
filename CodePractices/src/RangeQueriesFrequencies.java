import java.util.ArrayList;
import java.util.HashMap;
/**
 * Input  : arr[] = {2, 8, 6, 9, 8, 6, 8, 2, 11};
 *          i = 2, j = 8, key = 8
 *          i = 2, j = 5, key = 6
 * Output : 3
 *          1
 * The element 8 appears 3 times in arr[i-1...j-1]
 * The element 6 appears 1 time in arr[i-1...j-1]
 */

public class RangeQueriesFrequencies {
    public static void main(String[] args) {
        int[] id = {2,8,6,9,8,6,8,2,11};

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        /* // Example code
        int id = 2, value1=5,value2=6,value3=7;
        if(map.get(id)==null){
            map.put(id, new ArrayList<Integer>());
        }
        map.get(id).add(value1);
        map.get(id).add(value2);
        map.get(id).add(value3);
                                    */

        // O(n)
        for(int i=0;i<id.length;i++){
            if(map.get(id[i])==null){
                map.put(id[i], new ArrayList<Integer>());
            }
            map.get(id[i]).add(i+1);
        }
        //System.out.println(map);

        int key = 8; // given key to find its frequencies
        int left=2, right=8; // given range[i,j]

        System.out.println(map.get(key)); // key available

        // O(frequencies length) or USE BINARY SEARCH for (logN)
        int a=0, b=map.get(key).size(), n = map.get(key).size();
        for(int r=0;r<map.get(key).size();r++){
            if(left > map.get(key).get(r)){
                a++; // count lower bound
            }
            if(right < map.get(key).get(n-1-r)){
                b--; // count upper bound
            }
        }

        System.out.println(a+"   "+b); // print lower & upper bound

        // print answer
        System.out.println("Frequency of "+key+" in range ["+left+","+right+"] = "+(b-a));

    }
}
