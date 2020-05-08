class userThread extends Thread {
    public void run(){
        // Task for thread
        System.out.println("User defined thread executed...");
    }
}


public class differentMethods {
    public static void main(String [] args){
        System.out.println("Program started:");
        java.util.Scanner in  = new java.util.Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = in.nextInt();
        System.out.println("Enter second number:");
        int num2 = in.nextInt();

        // Thread...
        System.out.println("running thread priority is:"+Thread.currentThread().getPriority()); // Normal priority is 5.

        Thread t = Thread.currentThread();  // Find thread object
        String tName = t.getName(); // find thread name
        System.out.println("Current running thread is:  "+tName); //print thread name



        // Renaming current thread name
        t.setName("myMainThread");   // set thread new name
        tName = t.getName();    // find thread new name
        System.out.println("Current running renamed thread is: "+tName);

        try{
            Thread.sleep(5000); // temporarily sleeping main thread for 5 second
        }catch(Exception ex){}

        int sum  = num1+num2;
        System.out.println("sum of "+num1+" and "+num2+" is: "+sum);

        // Getting id of thread
        System.out.println("Thread id: "+ t.getId()); // Thread scheduler assign id to thread

        // Going to start user defined thread...
        userThread thr  = new userThread();
        thr.start();

        /**     thr.start(); // Can we start a thread twice
        No. After starting a thread, it can never be started again.
                If you does so, an IllegalThreadStateException is thrown.
        */

        System.out.println("Program ended...");
    }
}