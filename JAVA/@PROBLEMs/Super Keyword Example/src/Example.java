import java.util.Scanner;

public class Example {
    public static void main(String[] args){

        Scanner scanObj = new Scanner(System.in);

        System.out.println("Enter any number");
        int a; // Local variable

        a= scanObj.nextInt();

        childClass obj = new childClass();

        obj.show(a);

    }
}

class parentClass{

    int a = 10; // Instance variable

}

class childClass extends parentClass{

    int a = 20;  // Instance variable

    void show(int a){
        // In show method we are passing a local variable.
        System.out.println("I'm Local Variable(main) : "+a);  // In this case, it prints local variable.
        System.out.println("I'm Current Class Variable(this) : "+this.a);  // In this case, it prints current variable.
        System.out.println("I'm Parent Class Variable(super) : "+super.a);  // In this case, it prints parent class variable.
    }


}

