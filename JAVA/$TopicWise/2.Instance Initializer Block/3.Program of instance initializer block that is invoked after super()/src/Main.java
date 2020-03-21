
class A {
    A(){

        System.out.println("parent class constructor invoked");
    }
}

class Main extends A {
    Main() {
        super();
        System.out.println("child class constructor invoked");
    }

    {System.out.println("instance initializer block is invoked");}

    public static void main(String args[]){
        Main b = new Main();
    }
}