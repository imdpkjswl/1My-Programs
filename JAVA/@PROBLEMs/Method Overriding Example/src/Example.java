/*
What is Overriding ?
Overriding happens when the same method name and same signature is written .
NOTE :  The method can be only accessed only By creating the object of the class...
 */

public class Example {
    public static void main(String [] args){

        // Object for Super class to access the method of parentClass.
        parentClass obj1 = new parentClass();
        obj1.Show(10);

        // Object for Sub class to access the method of childClass
        childClass obj2 = new childClass();
        obj2.Show(20);
    }

}

class parentClass{

    void Show(int a){

        System.out.println("Parent Class "+a);
    }
}

class childClass extends parentClass{

    void Show(int a){

        System.out.println("Child Class "+a);
    }

}
