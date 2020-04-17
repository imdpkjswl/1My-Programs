class ClassA{
	void firstMethod(){
		System.out.println("Johnny Johnny...");
	}
	
	void secondMethod() {
		System.out.println("Yes Papa.");
	}
	
	void thirdMethod() {
		System.out.println("Eating Sugar...");
	}
}




class ClassB extends ClassA {
	
	void secondMethod(){
		super.firstMethod();
		super.secondMethod();
		super.thirdMethod();
		
		System.out.println("No Papa.");
	}
	
	void thirdMethod() {
		System.out.println("Telling Lies...");
	}
}





class Main extends ClassB {

	void firstMethod(){
		System.out.println("Open your mouth..., Ha..Ha..Ha.");
	}
	
	void secondMethod(){
		System.out.println("No Papa");
	}
	
	void thirdMethod(){
		super.secondMethod();
		super.thirdMethod();
		this.secondMethod();
	}
	
	public static void main(String[] args) {
		
		ClassA objA = new ClassA();
		ClassB objB = new ClassB();
		Main objC = new Main();
		
		/** GENERATE THE BELOW EXPECTED OUTPUT:
		 
		 * Johnny Johnny...
		 * Yes Papa.
		 * Eating Sugar...
		 * No Papa.
		 * Telling Lies...
		 * No Papa.
		 * Open your mouth...,Ha..Ha..Ha.
		 */
		//Option1:
		/* objA.firstMethod();
		   objA.secondMethod();
		   objA.thirdMethod();
		   objC.firstMethod();  */
		
		//Option2: Correct Option
		 objC.thirdMethod();
		 objC.firstMethod(); 
		
		//Option3:
		/* objB.secondMethod();
		   objB.thirdMethod();
		   objC.secondMethod();
		   objC.firstMethod(); */
		
		//Option4:
		/* objA.firstMethod();
		   objB.secondMethod();
		   objC.thirdMethod();
		   objC.firstMethod(); */

	}

}
