interface printable{
    void print();
}

interface MessagePrintable{
    void msg();
}

class demo implements printable,MessagePrintable {

    public void print(){
        System.out.println("first interface");
    }

    public void msg(){
        System.out.println("second interface");
    }
}

public class Main {

    public static void main(String[] args) {

        demo obj = new demo();
        obj.print();
        obj.msg();

    }
}
