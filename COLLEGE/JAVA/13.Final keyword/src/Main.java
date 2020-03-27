// If we write final before any class,then that class we can't be inherited.i.e. final clas A{}
// If we write final before any method,then that method we can't be override.i.e. final method() 
// If we write final before any variable,then on that variable we can't make any modification.i.e. final type var_name;
public class Main {

	public static void main(String[] args) {
		final int a =10;
		//a++;  We can't make any change in a variable due to used of final keyword
		System.out.println(a);

	}

}
