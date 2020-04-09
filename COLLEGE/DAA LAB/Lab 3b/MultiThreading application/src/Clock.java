import java.util.*;

public class Clock extends Thread {
    static int hh, mm,ss;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter time up to which you wish to run the timer");
        System.out.print("Hours:  ");
        hh=in.nextInt();
        System.out.print("Minutes:  ");
        mm=in.nextInt();
        System.out.print("Seconds:  ");
        ss=in.nextInt();

        if(hh<0 || hh>23 || mm<0 || mm>59 || ss<0 || ss>59){
            System.out.println("Invalid input entered");
            System.exit(0);
        }

        System.out.println("Timer has started:");
        Hours h = new Hours();
        h.start();
    }
}





class Hours extends Thread{
    static int k,count0;
    Hours(){
        for(k=0;k<24;k++){
            Minutes m = new Minutes();
            m.start();

            try{
                m.sleep(3600000);
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
        k=0;
    }
}




class Minutes extends Thread {
    static int j, count1;
    Minutes(){
        for(int j=0;j<60;j++){
            Seconds s = new Seconds();
            s.start();

            try{
                s.sleep(60000);
            }catch(InterruptedException ex){
                ex.printStackTrace();
            }
        }
        j=0;
        Hours.count0 = Hours.count0+1;
        count1 = 0;
        Hours h = new Hours();
        h.start();
    }
}



class Seconds extends Thread {
    static int i, count2;
    Seconds(){
        for(int i=0;i<60;i++){
            System.out.print(Hours.count0+" : "+Minutes.count1+" : "+count2);
            System.out.println();
            count2 = count2+1;

            if((Hours.count0 == Clock.hh) && (Minutes.count1==Clock.mm)&&(count2 == Clock.ss)){
                System.out.println("Timer ends here : ");
                System.exit(0);
            }

            temp t = new temp();
            t.start();
            try{
                t.sleep(1000);
            }catch(InterruptedException ex){
                ex.printStackTrace();
            }
        }

        i=0;
        count2=0;
        Minutes.count1= Minutes.count1+1;
        Minutes m = new Minutes();
        m.start();

    }
}


class temp extends Thread{
    temp(){
        for(double i=0;i<=86400;i++){
            i++;
            i--;
        }
    }
}