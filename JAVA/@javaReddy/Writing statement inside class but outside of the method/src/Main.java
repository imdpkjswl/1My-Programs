class demo{
    public void show(){
        System.out.println("Method inside class");
    }

    static{
        System.out.println("Statement outside the Method");
    }
}

public class Main {

    public static void main(String[] args) {

        demo ob = new demo();
        ob.show();

    }
}
