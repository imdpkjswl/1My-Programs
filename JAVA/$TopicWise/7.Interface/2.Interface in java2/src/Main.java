//In this program, we are mixing classes and interface.

interface i1 {
    void show();
}


class c1 implements i1 { // implement use karne ke baad,interface ke undar method ko initilaise karna hoga.nhi to error aayega.
    public void show(){ // Write method as public
        System.out.println("C1 class");
    }
    int a = 5;
    int b = 10;
}


class c2 extends c1 implements i1 {
    public void show() {
        System.out.println("a value: "+a);
        System.out.println("b value: "+b);
        System.out.println("sum of a and b:  "+(a+b));
    }
}



public class Main {
    public static void main(String[] args) {
        c2 obj = new c2();
        obj.show();
    }
}
