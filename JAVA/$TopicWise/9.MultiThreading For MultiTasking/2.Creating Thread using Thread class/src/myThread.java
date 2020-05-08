
public class myThread extends Thread {

    public void run() {
        System.out.println("Counting started:");
        // Task for thread
        for(int i=1;i<=10;i++) {
            System.out.print(i+"  ");

            // Must have to use try and catch
            try {
                Thread.sleep(5000);// Printing values after each five second
            }catch(Exception ex){

            }
        }
    }

    public static void main(String [] args){
        // Creating object of myThread class
        myThread t1 = new myThread();

        t1.start();
    }
}