interface demo {
    public static final int a=10, b=20;// This line also written as int a=10,b=20; because this line is
                                      //  converted into public static final int a=10, b=20;
    void show();
}

interface demo1 extends demo {
    int sum = a+b;
    void sum();
}

class result implements demo1{
    public void show(){
        System.out.println("Sum of "+a+" and "+b+" is: ");
    }

    public void sum(){
        System.out.println(sum);
    }
}


public class Main {

    public static void main(String[] args) {

        result obj = new result();
        obj.show();
        obj.sum();
    }
}
