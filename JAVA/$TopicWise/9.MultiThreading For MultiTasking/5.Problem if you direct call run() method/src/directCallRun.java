class directCallRun extends Thread {
    public void run() {
        for(int i=1;i<=5;i++) {
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }

            System.out.println(i);
        }
    }
    public static void main(String args[]){
        directCallRun t1=new directCallRun();
        directCallRun t2=new directCallRun();

        t1.run(); //fine, but does not start a separate call stack
        t2.run(); // Matlab, t1 ka method execute hone ke baad hi t2 ka method execute hoga

        /**
         * As you can see in the above program that there is no context-switching because
         * here t1 and t2 will be treated as normal object not thread object.
         */
    }
}  