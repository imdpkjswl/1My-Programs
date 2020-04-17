
public class Main {

	public static void main(String[] args) {
		
		char[] charArray = {'h' , 'e' , 'l' , 'l' , 'o'}; // Initializing character type array. 
		String helloString = new String(charArray); // string made up of characters.
		System.out.println(helloString);
		
		int len = helloString.length(); // FInding length of string
		String res = helloString.concat("World"); // Concatenating string World to helloString.  
		System.out.println(res);
		
		char ONE = res.charAt(5); // Finding specific character
		System.out.println(ONE);
		
		// Comparing two string
		String string = "hello"; 
		if(helloString.compareTo(string)==0) //True
			System.out.println("YES");
		else
			System.out.println("NO");
		
		// Replacing one string to another string
		res = helloString.replace(helloString, "World");
		System.out.println(res);
		
		// Converting to lowerCase order
		res = res.toLowerCase();
		System.out.println(res);
		
		// Converting to UpperCase order
		res = res.toUpperCase();
		System.out.println(res);
		
		//Comparing pattern with matched case
		if(res.equals("WORLd"))
			System.out.println("EQUAL");
		else
			System.out.println("NOT EQUAL");
		
		//Comparing pattern without concerning case
		if(res.equalsIgnoreCase("WORLd"))
			System.out.println("EQUAL");
		else
			System.out.println("NOT EQUAL");
		
		
			
		
	}

}
