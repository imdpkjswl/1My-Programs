class A{
	int a;
	
	A(int m){
		a = m;
	}
	void show(){
		System.out.println("a: "+a);
	}
}

class B extends A{
	int b,sum;
	
	B(int m,int n){
		super(m);
		b = n;
	}
	
	void add(){
		sum = a+b;
		System.out.println("b= "+b);
		System.out.println("Sum :  "+sum);
	}
}
public class Main {

	public static void main(String[] args) {
		B obj = new B(10,20);
		obj.show();
		obj.add();

	}

}
