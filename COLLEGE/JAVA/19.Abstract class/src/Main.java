/*
    Definition:
 */

// We can't create objects for abstract class. we can also use static before method name to directly access.

abstract class demo{
    void show(){
        System.out.println("Abstract class");
    }

    //Abstract classes may or may not contain abstract methods amd normal method, i.e., methods without body
    abstract void display();
}

// Only we can access ,through inheritance and overriding.
class demo1 extends demo{
    void display() { // Overriding
        System.out.println("Abstract class implementation");
    }
}

public class Main { // extends demo1

    public static void main(String[] args) {
    demo1 ob = new demo1();
    ob.display();
    ob.show();

    }
}
