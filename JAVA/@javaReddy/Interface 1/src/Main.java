// Declaration
interface demo{
    void show();
}
// Definition
class Class implements demo{
    public void show(){
        System.out.println("Hello World");
    }
}

public class Main {

    public static void main(String[] args) {
	Class c = new Class();
	c.show();
    }
}
