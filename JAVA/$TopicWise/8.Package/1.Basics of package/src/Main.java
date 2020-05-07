//3.Accessing Method: Import the entire package
import myPackage.*;



/*
//2.Accessing Method: Import the package class(Particular)
import myPackage.demo;
*/
public class Main {

    public static void main(String[] args) {
/**
        //1.Accessing Method: Fully Qualified Name
        myPackage.demo obj1 = new myPackage.demo();
        obj1.display();
*/

/* Continue method 2
        demo obj2 = new demo();
        obj2.display();
*/


        demo obj3 = new demo();
        obj3.display();

    }
}
