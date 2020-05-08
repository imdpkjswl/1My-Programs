import java.*;

public class myThread implements Runnable {

    public void run() {
        System.out.println("Counting started:");
        // Task for thread
        for(int i=1;i<=10;i++) {
            System.out.print(i+"  ");

            // Must have to use try and catch
            try {
                Thread.sleep(1000);// Printing values after each one second
            }catch(Exception ex){

            }
        }
    }

    public static void main(String [] args){
        // Creating object of myThread class
        myThread t1 = new myThread();

        Thread thread = new Thread(t1); // passing t1 to inbuild Thread class

        thread.start();
    }
}