/*
NOTE:
We can make inner class as static BUT, not outer class. */

class Outer {
    static int a = 2;
    void show(){
        System.out.println("Outer class");
        Inner.display();
    }

    static class Inner {
        static void display(){
            System.out.println("Inner class,value of a: " +a);
        }
    }

}

public class Main {

    public static void main(String[] args) {

        Outer obj = new Outer();
        obj.show(); // accessing outer class
        //Outer.Inner.display();

    }
}
