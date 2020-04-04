// This is use to avoiding implementation of method overloading.

class demo{
    public void show(int ...arr) { // Varargs is represented by three dots,i.e.Known as Variable Arguments.
        for(int i : arr) { // It works like array but it is not an array
            System.out.println(i);
        }
    }
}


public class Main {

    public static void main(String[] args) {

        demo obj = new demo();
        obj.show(2,5,7);

    }
}
