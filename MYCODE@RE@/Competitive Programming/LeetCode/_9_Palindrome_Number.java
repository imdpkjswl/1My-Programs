class _9_Palindrome_Number {
    public boolean isPalindrome(int x) {
    	// Handled negative problem
    	if(x < 0)
    		return false;
    	int backup = x;
    	int res=0;
    	while(x != 0){
    		int temp = x % 10;
    		x = x/10;
    		res = res*10 + temp;
    	}

    	if(res == backup)
    		return true;
        return false;
    }

    public static void main(String... args){
    	_9_Palindrome_Number ob = new _9_Palindrome_Number();

    	int x = -121;

    	boolean result = ob.isPalindrome(x);
    	System.out.println(result);
    }
}