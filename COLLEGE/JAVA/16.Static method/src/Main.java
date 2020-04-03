class demo{
    static int v =2;
    static void display(){
        System.out.println("Demo class static var: "+v);
    }
}

public class Main {

    public static void main(String[] args) {

        demo.display();
    }
}
