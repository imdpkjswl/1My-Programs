class demo{
    int i; // auto initialized by zero.

    demo(int i){
        this.i = i;
    }

    void show(){
        System.out.println(i);
    }
}

public class Main {

    public static void main(String[] args) {

        demo ob = new demo(10);
        ob.show();
    }
}
