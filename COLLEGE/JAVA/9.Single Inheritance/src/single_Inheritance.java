class A{
	int a=10;
	void show(){
		System.out.println("a value : "+a);
	}
}

class B extends A{
	int b=20;
	void show(){
		System.out.println("b value: "+b);
	}
	
	void add(){
		int sum;
		sum = a+b;
		System.out.println("Sum is: "+sum);
	}
}
public class single_Inheritance {

	public static void main(String[] args) {
		A aobj = new A();
		aobj.show();
		
		B bobj = new B();
		bobj.show();
		bobj.add();

	}

}