class Outer {
    void show(){
        System.out.println("Outer class");
        Inner iobj = new Inner();
        iobj.display();
    }
    class Inner {
        void display(){
            System.out.println("Inner class");
        }
    }

    //Inner iobj = new Inner();
}

public class Main {

    public static void main(String[] args) {

        Outer obj = new Outer();
        obj.show(); // accessing outer class
        //obj.iobj.display(); // accessing inner class

    }
}
