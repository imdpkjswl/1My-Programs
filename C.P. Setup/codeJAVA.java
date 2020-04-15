// 1328A
import java.util.*;

class Main {
	public static void main(String[] args){
		int n,a, b,count=0;
	    
	    n=new Scanner(System.in).nextInt();

	 for(int j=1;j<=n;j++) {
	 	count=0;
	 	a=new Scanner(System.in).nextInt();
	 	b=new Scanner(System.in).nextInt();
	 	
	 	while(true) {
	 
	 		if((a % b) == 0) {
	 			System.out.println(count);
	 			count = 0;
	 			break;
	 		}
	 		a++;
	 		count++;
	 	}
	} 	
	 
	}
}