class A{
	int a;
	A(int x){
		a = x;
	}
}

class B extends A{
	int b;
	B(int x,int y){
		super(x);
		b = y;
	}
}

class C extends B{
	int c,sum;
	
	C(int x,int y,int z){
		super(x,y);
		c = z;
	}
	
	void add(){
		sum = a+b+c;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("c: "+c);
		System.out.println("Sum : "+sum);
	}
	
}

public class Main {

	public static void main(String[] args) {
		
		C obj = new C(10,20,30);
		obj.add();
	}

}
