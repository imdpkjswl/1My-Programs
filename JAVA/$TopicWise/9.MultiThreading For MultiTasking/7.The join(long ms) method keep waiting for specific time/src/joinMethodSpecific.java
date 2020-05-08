public class joinMethodSpecific extends Thread {
    public void run() {
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(500);
            }catch(Exception e){System.out.println(e);}

            System.out.println(i);
        }
    }
    public static void main(String args[]) {
        joinMethodSpecific t1=new joinMethodSpecific();
        joinMethodSpecific t2=new joinMethodSpecific();
        joinMethodSpecific t3=new joinMethodSpecific();
        t1.start();
        try{
            t1.join(1500);
        }catch(Exception e){System.out.println(e);}

        t2.start();
        t3.start();

/**
        In the above example, when t1 is completes its task for 1500 miliseconds(3 times) then t2
        and t3 starts executing.
   */
    }
}  