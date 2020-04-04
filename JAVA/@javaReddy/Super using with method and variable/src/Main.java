class A{
    int i = 8;

    void show(){
        System.out.println("A show()");
    }
}

class B extends A{
    int i = 3;

    void show(){
        System.out.println("i value: "+super.i); // To access base class variable
        super.show(); // To access base class method
        System.out.println("B show()");
    }
}

public class Main {

    public static void main(String[] args) {

        B bobj = new B();
        bobj.show(); // calling show() method of class B.

    }
}
