// We need marker interface to assign permission to the class,that we have created object of class.
// For security purpose it used.
interface in{

}

class demo implements in{
    void show(){
        System.out.println("Hello World :):):)");
    }
}


public class Main {
    public static void main(String[] args) {

        demo obj = new demo();
        if(obj instanceof in)  // instanceof method is used to check any instance of interface is created or not.
            obj.show();
        else
            System.out.println("No Permission, Because in class interface is not implemented.");
    }
}
