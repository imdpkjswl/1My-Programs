import java.util.*;

class slowest_key{

	 // Time Complexity : O(N^2) due to Bubble sort used for alignment
	 public char solution(int[] releaseTimes, String keysPressed) {

        char[] chr = keysPressed.toCharArray();
        int n = releaseTimes.length;
        int[] temp = new int[n];	

        // Subtracting current - previous as given in question
        int t =0;
        for(int i=1,k=0;i<=n;i++){
        	temp[k++] = releaseTimes[i-1] - t;
        	t = releaseTimes[i-1];
        	 
        }

        // Bubble sort
        for(int i=1;i<n;i++){
        	for(int j=0;j<n-i;j++){
        		if(chr[j] >= chr[j+1]){
	                char c =chr[j+1];
	                chr[j+1] = chr[j];
	                chr[j] = c;

	                int ele = temp[j+1];
	                temp[j+1] = temp[j];
	                temp[j] = ele;
            	}
       		}
       }
       // for(char i:chr)
       //  	 System.out.println(i);

       // for(int i:temp)
       //  	 System.out.println(i); 	

       	// Finding out index of answer charcter
        int i;
        int ans = 0;
        int m = Integer.MIN_VALUE;
        for(i=0;i<n;i++){
        	if(m<=temp[i]){
        		m = temp[i];
        		ans = i;
        	}
        }

        return chr[ans];
    }

	public static void main(String[] args){
	
		slowest_key ob = new slowest_key();

		int[] releaseTimes = {12, 23, 36, 46, 62};//{9, 29, 49, 50};
		String keysPressed = "spuda";//"cbcd";

		char res = ob.solution(releaseTimes, keysPressed);
		System.out.println(res);
	}
}