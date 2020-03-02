public class Test {
    int x , y, z; // Instance variable
    float k ;     // Instance variable

    // Default Constructor
    Test(){
        System.out.println("Default :\nThe Constructor invoked");
    }

    // Parameterized Constructor
    Test(int a){
        x = a;
        System.out.println("\nBelow are Parameterized Constructors :\nvalue of a is  "+ x);
    }
    // Parameterized Constructor
    Test(int a , int b){
        int total;
        y=a;
        z=b;
        total = y+z;
        System.out.println("Addition is : "+total);
    }
    // Parameterized Constructor
    Test(float a){
        k = a;
        System.out.println("Floating value is "+k);
    }
}
