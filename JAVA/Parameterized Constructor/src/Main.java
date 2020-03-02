public class Main {
    public static  void main(String [] args){

        Test obj = new Test(30,40);
    }
}


class Test{

    int x,y ; // Instance variable
    Test(int a , int b){
        x = a;
        y = b;

        int sum =  x + y ;
        System.out.println("Sum is : " + sum);
        System.out.println("The Parameterized Constructor invoked.");
    }
}