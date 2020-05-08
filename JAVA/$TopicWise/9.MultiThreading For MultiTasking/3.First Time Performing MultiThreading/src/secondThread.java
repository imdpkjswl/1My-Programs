// Created thread using Thread class

public class secondThread extends Thread {

    public void run() {

        // Task for thread
        for(int i=10;i>=1;i--) {
            System.out.println("Second Thread:  "+i);

            // Must have to use try and catch
            try {
                Thread.sleep(2000);// Printing values after each five second
            }catch(Exception ex){

            }
        }
    }

}