import java.util.*;

class Closest_Distance_to_Character {

    // 100 % Working solution BUT it gives TLE(Time Limit Exceeded) error for the large size of n. Can be solved by reducing time complexity of program.
    public int[] solve(String s, String c) {
        int n = s.length();

        int[] ans = new int[n];
        char refChar = c.charAt(0);
        ArrayList<Integer> refValue = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(s.charAt(i) == refChar){
                refValue.add(i);
            }
        }

        Arrays.fill(ans, Integer.MAX_VALUE);
        //int j = 2; // debug ref

        for(int j=0;j<refValue.size();j++){
            for(int i=0;i<n;i++){
                ans[i] = Math.min(ans[i], Math.abs(i-refValue.get(j)));
            }
        }

        return ans;
    }


    public static void main(String[] args) {
        Closest_Distance_to_Character run = new Closest_Distance_to_Character();

        String s = "aabaab";
        String c = "b";

        // Solution with TLE
        int[] ans = run.solve(s, c);

        for(int i:ans)
            System.out.print(i + "  ");
        System.out.println();


        // Real Solution without TLE
        Solution real = new Solution();
        int[] a = real.solve(s, c);
        for(int val : a)
        	System.out.print(val + "  ");

    }
}




// REAL SOLUTION WITHOUT TLE ERROR
class Solution {
    public int[] solve(String s, String c) {  
        int n = s.length();
        int[] ans = new int[n];
        char X = c.charAt(0);
   
        // Find distance from occurrences of X  
        // appearing before current character.  
        int prev = Integer.MAX_VALUE;  
        
        for (int i = 0; i < n; i++)  
        {  
            if (s.charAt(i) == X)  
                prev = i;  
            if (prev == Integer.MAX_VALUE) 
                ans[i] = Integer.MAX_VALUE; 
            else    
                ans[i] = (i - prev);  
        }  
      
        // Find distance from occurrences of X  
        // appearing after current character and  
        // compare this distance with earlier.  
        prev = Integer.MAX_VALUE; 
        for (int i = n - 1; i >= 0; i--)  
        {  
            if (s.charAt(i) == X)  
                prev = i;  
            if (prev != Integer.MAX_VALUE)     
                ans[i] = Math.min(ans[i], prev - i);  
        }  
        
        return ans;
    }  
}
