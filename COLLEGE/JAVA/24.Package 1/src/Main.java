import P1.*;
import P2.*;

import java.util.Scanner;

/* Type conflict due to same name of class in main and different packages.
class add{
    void display(){
        System.out.println("add class inside main class.");
    }
}*/
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b;
        System.out.println("Enter a number:");
        a=in.nextInt();
        System.out.println("Enter another number:");
        b=in.nextInt();

        add obj = new add();
        //obj.display();
        obj.sum(a,b);

        subtraction obj1 = new subtraction();
        obj1.sub(a,b);
    }
}
