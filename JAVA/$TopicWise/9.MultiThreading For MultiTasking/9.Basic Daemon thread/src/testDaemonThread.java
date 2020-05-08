public class testDaemonThread extends Thread {
    public void run() {
        if(Thread.currentThread().isDaemon()){ //checking for daemon thread
            System.out.println("daemon thread work");
        }
        else{
            System.out.println("user thread work");
        }
    }

    public static void main(String[] args){
        testDaemonThread t1=new testDaemonThread();//creating thread
        testDaemonThread t2=new testDaemonThread();
        testDaemonThread t3=new testDaemonThread();

        t1.setDaemon(true);//now t1 is daemon thread

        t1.start();//starting threads
        t2.start();
        t3.start();
    }
}