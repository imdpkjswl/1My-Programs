class Main {
    int speed;

    Main(){
        System.out.println("constructor is invoked");
    }

    {   System.out.println("instance initializer block invoked");   }

    public static void main(String args[]){
        Main  b1 = new Main();
    }
}
