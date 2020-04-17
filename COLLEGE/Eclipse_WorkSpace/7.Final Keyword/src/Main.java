
/** 
 * In case of variable: After using final with variable ,we can't modify the value of variable.
 * In case of Class : After using final keyword before class name, we can't inherit that class.
 * In case of Method: After using final keyword before any method name ,we can't override that method.
 */

public class Main {

	public static void main(String[] args) {
		
		final double PI = 3.1415;
		 // PI = 2.1415; Error occurred(can't modify)
		
		System.out.println("PI value is: "+PI);
	}

}
