// If you make any variable as final, you cannot change the value of final variable(It will be constant).



class finalWithVariable {
    final int x = 120;

    void display(){
        //NOT ALLOWED //x 2= 1121;
        System.out.println("x value is :  "+x);
    }
}

public class Main {

    public static void main(String[] args) {

        finalWithVariable obj = new finalWithVariable();

        //NOT ALLOWED //obj.x = 1121;
        obj.display();

    }
}
