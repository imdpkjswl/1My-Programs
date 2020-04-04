class A{
    public void show(){
        System.out.println("Class A");
    }
}

public class Main {

    public static void main(String[] args) {
// When we want object once,we use anonymous object beacuse it uses only heap memory.Whereas normal object uses stack and heap memory.
        new A().show();  // Anonymous object
    }
}
