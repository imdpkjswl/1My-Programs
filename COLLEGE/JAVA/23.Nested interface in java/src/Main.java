interface printable{
    void print();
    interface MessagePrintable{
        void msg();
    }
}
/*
class demo1 implements printable{
    public void print(){
        System.out.println("print is outer interface");
    }
}
*/
class demo2 implements printable.MessagePrintable {

    public void print(){
        System.out.println("print is outer interface");
    }

    public void msg(){
        System.out.println("msg is inner interface");
    }
}

public class Main {

    public static void main(String[] args) {

       /* demo1 obj1 = new demo1();
        obj1.print();   */

        demo2 obj2 = new demo2();
        obj2.print();
        obj2.msg();

    }
}
