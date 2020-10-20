import java.util.*;
import java.math.*;

class A_Boring_Apartments{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		int testcase = in.nextInt();


		for(int i=1;i<=testcase;++i){
			int target = in.nextInt();
			int count=0;

			int temp = 0;
			int j =1;
			while(true){

				temp = temp*10 + j; // main logic

				//System.out.println(temp); // for debugging
				
				// Find no. of digits
				int digits = (int)Math.floor(Math.log10(temp))+1;

				// total number of digits he pressed counter statement
				if(digits <= 4){
					count+= digits;
				}

				// Phase changing statement
				if(temp > 9999){
					j++;
					temp=0;
				}


				// Termination statement
				if(temp == target){
					break;
				}
			}

			// Print answer
			System.out.println(count);

		}
		
	}
}