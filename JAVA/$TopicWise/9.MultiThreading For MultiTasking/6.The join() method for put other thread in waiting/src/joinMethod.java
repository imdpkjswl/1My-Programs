/** The join() method waits for a thread to die. In other words, it causes the currently
 *  running threads to stop executing until the thread it joins with completes its task.

 #Syntax:
public void join()throws InterruptedException
public void join(long milliseconds)throws InterruptedException

 Example of join() method   */

class joinMethod extends Thread {
    public void run() {
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(1000);
            }catch(Exception e){System.out.println(e);}

            System.out.println(i);
        }
    }

    public static void main(String args[]){
        joinMethod t1=new joinMethod();
        joinMethod t2=new joinMethod();
        joinMethod t3=new joinMethod();
        t1.start();
        try{
            t1.join();  // it keep all other thread in queue.
        }catch(Exception e){System.out.println(e);}

        t2.start();
        t3.start();

        // As you can see in the above example,when t1 completes its task then t2 and t3 starts executing.
    }
}  