// Created thread using Runnable Interface

public class firstThread implements Runnable {

    public void run() {

        System.out.println("Concurrent Execution:");
        // Task for thread
        for(int i=1;i<=10;i++) {
            System.out.println("First Thread:  "+i);

            // Must have to use try and catch
            try {
                Thread.sleep(1000);// Printing values after each five second
            }catch(Exception ex){

            }
        }
    }

    public static void main(String [] args){
        // Creating object of myThread class
        firstThread t1 = new firstThread(); // Our Thread

        Thread thread = new Thread(t1); // inbuilt Thread

        secondThread t2 = new secondThread(); // Our Thread

        //Main Thread is Starting User defined threads
        thread.start();
        t2.start();

    }
}