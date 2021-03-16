/** ASKED IN INFYTQ SAMPLE PAPER
* Provided with a positive number x, for the final value of x after performing the following operations:
--> Update the x by adding reverse of x to it.
--> If the new value is palindrome then stop, otherwise repeat previous step.

Finally, print the palindrome value stored in x.

example:
x = 95
rev of x = 59
x1 = 95+59 = 154  --> not a palindrome

rev of x1 = 451
x2 = 154+451 = 605 --> not a palindrome

rev of x2 = 506
x3 = 605+506 = 1111  --> palindrome
*/

class MakePalindrome {
	
	private static long getReverse(long x){
		long res=0;

		while(x > 0){
			long digit = x%10;
			res = res*10 + digit;
			x /=10;
		}
		return res;
	}

	private static boolean isPalindrome(long x){
		long rev = getReverse(x);
		if(x == rev){
			return true;
		}else{
			return false;
		}
	}


	public static void main(String[] args) {
		long x = 95;//1335//15//3//142

		// Terminate when x will be palindrome
		while(!isPalindrome(x)){
			long r = getReverse(x);
			x = x + r;
		}
		System.out.println(x);

	}
}