interface demo{ // We can't create object of interface due to absence of default constructor but ...
    void show();
}

public class Main{
    public static void main(String ...args){

        demo obj = new demo(){ // Before creating object of class ,we have to define interface method.
            public void show(){
                System.out.println("Hello");
            }
        };
        obj.show();
    }
}