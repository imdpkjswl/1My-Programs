final class Bike{

}

class Main extends Bike {  // Can not inherit Bike class
    void run() {
        System.out.println("running safely with 100kmph");
    }

    public static void main(String args[]) {
        Main obj = new Main();
        obj.run();
    }

}