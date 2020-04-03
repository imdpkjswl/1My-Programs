class demo{
    static int a; // Static variable used for memory management.

    void count(){
        a++;
        System.out.println(a);
    }
}

public class Main {

    public static void main(String[] args) {

        demo obj1 = new demo(); // These three obj having one common memory block.ALL THE OBJECTs REFER TO SAME MEMORY BLOCK.
        demo obj2 = new demo(); // STATIC VARIABLE IS ALSO CALLED AS CLASS VARIABLE..
        demo obj3 = new demo();
        demo obj4 = new demo();

        obj1.count();
        obj2.count();
        obj3.count();
        obj4.count();
    }
}
