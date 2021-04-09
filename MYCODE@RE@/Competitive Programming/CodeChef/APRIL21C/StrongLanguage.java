import java.util.*;
import java.lang.*;

class StrongLanguage {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int T = 0;if (in.hasNextInt()) {T = in.nextInt();}

        while(T-- > 0) {
        int N = 0;if (in.hasNextInt()) {N = in.nextInt();}
        int K = 0;if (in.hasNextInt()) {K = in.nextInt();}

        String str = in.next();

        int max = 0;
        int count = 0;
        for(int i=0;i<str.length();i++){
        	if(str.charAt(i) == '*'){
        		count++;
        	}else{
        		count=0;
        	}
        	max = Math.max(max, count);
        }

        if(K <= max){
        	System.out.println("YES");
        }else{
        	System.out.println("No");
        }

    }
       
    }

}




