class Bike{
    final void run(){System.out.println("bike is running...");}
}
class Main extends Bike{
    public static void main(String args[]){
        new Main().run(); // We can call method by using new (allocating new memory)
    }
}  