import java.util.*;

public class _7_Reverse_Integer{
	
	public int reverse(int x) {
		
		// Handling negative number
		boolean flag = false;
		if(x < 0){
			x = x*-1;
			flag = true;
		}

        StringBuilder sb = new StringBuilder();

        // Try used to handle Range Overflows.
        try{
        	if(flag) // make result a negative number 
        		return -1*Integer.parseInt(sb.append(x).reverse().toString());
        	else
        		return Integer.parseInt(sb.append(x).reverse().toString());

    	}catch(Exception e){  
    		return 0;
    	}
    }

	public static void main(String[] args){
		_7_Reverse_Integer obj = new _7_Reverse_Integer();

		int x = -123;// 1579345186//overflow return 0.

		x = obj.reverse(x);
		System.out.println(x);
	}
}