// Indirectly implementing multiple inheritance instead of two base class ,we are using two base interface.


// Declaration
interface i1{
    int a=12;
    void show();
}

interface i2{
    int b =15;
    void show();
}

// Initialization
class c1 implements i1, i2 {
    int sum;
    public void show(){
        sum = a+b;
        System.out.println("Sum is:  "+sum);
    }
}

public class Main {

    public static void main(String[] args) {

        c1 obj= new c1();
        obj.show();
    }
}
