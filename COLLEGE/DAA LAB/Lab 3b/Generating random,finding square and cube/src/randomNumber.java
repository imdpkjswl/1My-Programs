import java.util.Random;

class genRandom extends Thread {

    public void run() {
        Random r = new Random();

         int num;
           for(int i=1;i<=10;i++) {
               num = r.nextInt(10);
                System.out.println("Number generated:  "+num);

                // Must have to use try and catch
               try {
                   Thread.sleep(1000);// Printing values after each five second
               } catch(Exception ex) { }


               square t2 = new square(num);
               t2.start();
               try{
                   t2.join();  // it keep all other thread in queue.
               }catch(Exception e){System.out.println(e);}

               cube t3 = new cube(num);
               t3.start();
               try{
                   t3.join();  // this join used execute t3 thread until the death of t3
               }catch(Exception e){System.out.println(e);}

           }
    }

}

class square extends Thread {
    int num;
    public square(int num) {
        this.num = num;
    }
    public void run() {
        System.out.println("Square of number:  "+Math.pow(num,2));
    }
}


class cube extends Thread {
    int num;
    public cube(int num) {
        this.num = num;
    }
    public void run() {
        System.out.println("Cube of number:  "+Math.pow(num,3)+"\n");
    }
}


public class randomNumber {
    public static void main(String [] args) {
        genRandom t1 = new genRandom();

        t1.start();

    }
}