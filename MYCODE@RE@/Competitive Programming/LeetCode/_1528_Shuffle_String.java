import java.util.*;

class _1528_Shuffle_String {
    public static String restoreString(String s, int[] indices) {
    	char[] chr = s.toCharArray();
    	// Bubble sort 
    	for(int i=1;i<indices.length;i++){
    		for(int j=0;j<indices.length-i;j++){
    			if(indices[j] > indices[j+1]){
    				int tmp1 = indices[j];
    				indices[j] = indices[j+1];
    				indices[j+1] = tmp1;

    				char tmp2 = chr[j];
    				chr[j] = chr[j+1];
    				chr[j+1] = tmp2;

    			}
    		}
    	}        
        return (new String(chr));
    }

    public static void main(String[] args) {
		String str = "codeleet";
		int[] indices = {4,5,6,7,0,2,1,3};

		str = restoreString(str,indices);

		System.out.println(str);

    }
}