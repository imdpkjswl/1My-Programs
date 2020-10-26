import java.util.*;

public class _8_String_to_Integer_atoi{
	
/* MY SOLUTION FAILED IN SOME TEST CASES    
	public int myAtoi(String s) {
        char[] chr = s.toCharArray();
        String res = "";
        // Remove all spaces from string
        for(int i=0;i<chr.length;i++){
        	if(chr[i] ==' ')
        		continue;
        	else
        		res +=chr[i];		
        }

        // Again convert string to char array
        char[] ch = res.toCharArray();
        System.out.println(res);
        if(ch[0] == '+' ||ch[0] == '-' ||ch[0] != '.'||ch[0] !='1' ||ch[0] !='2'||ch[0] !='3'||ch[0] !='4'||ch[0] !='5'||ch[0] !='6'||ch[0] !='7'||ch[0] !='8'||ch[0] !='9'||ch[0] !='0'){
        	return 1;
        }

        String r = "";
        // for(int i=0;i<ch.length;i++){
        //     if((int)ch[i] > 48){
        //         break;
        //     }
        //     r += ch[i];

        // }

        System.out.println(r);
        return 0;
        
    }
*/



     // REAL SOLUTION 
     public int myAtoi(String str) {
        // remove whitespaces
        str = str.trim();
        
        if (str == null || str.length() == 0) {
            return 0;
        }
        
        double result = 0;
        
        // handle positive and negative sign
        boolean isNegative = false;
        int startIndex = 0; // index of first numerical character
        
        if (str.charAt(0) == '+' || str.charAt(0) == '-') {
            startIndex++;
        }
        if (str.charAt(0) == '-') {
            isNegative = true;
        }
        
        // handle normal case "123"
        for (int i = startIndex; i < str.length(); i++) {
            // handle non-numerical character
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                break;
            }
            int digitValue = (int)(str.charAt(i) - '0'); // '9' - '0' 
            result = result * 10 + digitValue;
        }
        
        if (isNegative) {
            result = -result;
        }
        
        // handle out of Integer range
        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return (int)result;
    }
	public static void main(String[] args){
		_8_String_to_Integer_atoi obj = new _8_String_to_Integer_atoi();

		String s = "4193 with words";
		int result = obj.myAtoi(s);	
		System.out.println(result);

	}
}