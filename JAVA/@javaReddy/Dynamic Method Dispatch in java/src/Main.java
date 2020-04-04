class A{
    void show(){
        System.out.println("A class");
    }
}

class B extends A{
    void show(){
        System.out.println("B class");
    }
}


public class Main {
    public static void main(String[] args) {

        A obj1 = new A();
        B obj2 = new B();

        A a; // Reference variable of class A which is initialised by null.
        a = obj2; // Assigning obj2 into a.
        a.show(); // Calling B class method using reference of class A.
    }
}
