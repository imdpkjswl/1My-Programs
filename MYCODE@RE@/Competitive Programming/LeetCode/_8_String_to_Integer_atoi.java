import java.util.*;

public class _8_String_to_Integer_atoi{
	
	public int myAtoi(String s) {
        char[] chr = s.toCharArray();
        String res = "";
        for(int i=0;i<chr.length;i++){
        	if(chr[i] ==' ')
        		continue;
        	else
        		res +=chr[i];		
        }

        char[] ch = res.toCharArray();
        if(ch[0] != '+' ||ch[0] != '-' ||ch[0] != '.'||ch[0] !='1' ||ch[0] !='2'||ch[0] !='3'||ch[0] !='4'||ch[0] !='5'||ch[0] !='6'||ch[0] !='7'||ch[0] !='8'||ch[0] !='9'||ch[0] !='0'){
        	return 0;
        }

        System.out.println(res);
        return 0;
        
    }
	
	public static void main(String[] args){
		_8_String_to_Integer_atoi obj = new _8_String_to_Integer_atoi();

		String s = "de   4193 with words";
		int result = obj.myAtoi(s);	
		System.out.println(result);

	}
}