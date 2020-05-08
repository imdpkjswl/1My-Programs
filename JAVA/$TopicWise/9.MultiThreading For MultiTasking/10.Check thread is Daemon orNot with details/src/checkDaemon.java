public class checkDaemon extends Thread {
    public void run(){
        System.out.println("Name: "+Thread.currentThread().getName());
        System.out.println("Daemon: "+Thread.currentThread().isDaemon());
    }

    public static void main(String[] args){
        checkDaemon t1=new checkDaemon();
        checkDaemon t2=new checkDaemon();
        t1.start();
        t1.setDaemon(true);//will throw exception here
        t2.start();
    }
}  