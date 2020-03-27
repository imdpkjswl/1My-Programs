class A{
    void show(){  // if we used final before void ,then we ca't can't override this method.Only it affect the method,Not inside variable.
		System.out.println("Base class");
	}
}

class B extends A{
	void show(){ // method overriding
		super.show(); // To access base class method ,super keyword is used.
		System.out.println("Sub class");
	}
}
public class Main {

	public static void main(String[] args) {
		
		B obj = new B();
		obj.show();

	}

}
