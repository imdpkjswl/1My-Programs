/// We can initialize blank final variable but only in constructor.
class Main {
    final int speedLimit;//blank final variable

    Main() {
        speedLimit=70;
        System.out.println(speedLimit);
    }

    public static void main(String args[]){
        new Main();
    }
}  