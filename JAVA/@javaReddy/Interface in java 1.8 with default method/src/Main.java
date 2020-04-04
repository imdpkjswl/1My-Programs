interface demo{
    void show();

    default void display(){ // At last, default method will executes.
        System.out.println("Default method in interface,that define in interface itself");
    } //Interface  Default have less priority than class

}

class demo1 implements demo{
    public void show(){
        System.out.println("Normal interface,that define in class");
    }
}

public class Main {

    public static void main(String[] args) {
	demo1 ob = new demo1();
	ob.show();
	ob.display();

    }
}
