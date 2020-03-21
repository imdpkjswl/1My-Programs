class bike{
    final void run(){
        System.out.println("Maximum speed : 140km/hr");
    }
}

public class Main extends bike {

    void run(){ // Override not possible in this case.
        System.out.println("Running safely with 100km/hr");
    }
    public static void main(String[] args) {

        Main ob = new Main();
        ob.run();


    }
}
