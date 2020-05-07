// In this ,after declaring ,we must have to initilise the method.


// Only declaration in below
interface i1{
    int a = 10; //i.e. This line converted, public static final int a =10;
    void show(); // public void show();
    void disp();
}

// Initialization below
class c1 implements i1{
    public void show(){
        // a++;
        System.out.println("a value = "+a);
    }

    public void disp(){

    }
}


public class Main {

    public static void main(String[] args) {
	    c1 obj = new c1();
	    obj.show();
    }
}
